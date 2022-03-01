package com.dwoodcock

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class SurgeryController {

    SurgeryService surgeryService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond surgeryService.list(params), model:[surgeryCount: surgeryService.count()]
    }

    def show(Long id) {
        respond surgeryService.get(id)
    }

    def create() {
        respond new Surgery(params)
    }

    def save(Surgery surgery) {
        if (surgery == null) {
            notFound()
            return
        }

        try {
            surgeryService.save(surgery)
        } catch (ValidationException e) {
            respond surgery.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'surgery.label', default: 'Surgery'), surgery.id])
                redirect surgery
            }
            '*' { respond surgery, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond surgeryService.get(id)
    }

    def update(Surgery surgery) {
        if (surgery == null) {
            notFound()
            return
        }

        try {
            surgeryService.save(surgery)
        } catch (ValidationException e) {
            respond surgery.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'surgery.label', default: 'Surgery'), surgery.id])
                redirect surgery
            }
            '*'{ respond surgery, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        surgeryService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'surgery.label', default: 'Surgery'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'surgery.label', default: 'Surgery'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
