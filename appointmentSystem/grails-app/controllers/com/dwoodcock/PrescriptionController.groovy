package com.dwoodcock

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PrescriptionController {

    PrescriptionService prescriptionService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond prescriptionService.list(params), model:[prescriptionCount: prescriptionService.count()]
    }

    def show(Long id) {
        respond prescriptionService.get(id)
    }

    def create() {
        respond new Prescription(params)
    }

    def save(Prescription prescription) {
        if (prescription == null) {
            notFound()
            return
        }

        try {
            prescriptionService.save(prescription)
        } catch (ValidationException e) {
            respond prescription.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'prescription.label', default: 'Prescription'), prescription.id])
                redirect prescription
            }
            '*' { respond prescription, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond prescriptionService.get(id)
    }

    def update(Prescription prescription) {
        if (prescription == null) {
            notFound()
            return
        }

        try {
            prescriptionService.save(prescription)
        } catch (ValidationException e) {
            respond prescription.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'prescription.label', default: 'Prescription'), prescription.id])
                redirect prescription
            }
            '*'{ respond prescription, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        prescriptionService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'prescription.label', default: 'Prescription'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'prescription.label', default: 'Prescription'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
