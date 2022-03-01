package com.dwoodcock

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AppointmentController {

    AppointmentService appointmentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond appointmentService.list(params), model:[appointmentCount: appointmentService.count()]
    }

    def show(Long id) {
        respond appointmentService.get(id)
    }

    def create() {
        respond new Appointment(params)
    }

    def save(Appointment appointment) {
        if (appointment == null) {
            notFound()
            return
        }

        try {
            appointmentService.save(appointment)
        } catch (ValidationException e) {
            respond appointment.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'appointment.label', default: 'Appointment'), appointment.id])
                redirect appointment
            }
            '*' { respond appointment, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond appointmentService.get(id)
    }

    def update(Appointment appointment) {
        if (appointment == null) {
            notFound()
            return
        }

        try {
            appointmentService.save(appointment)
        } catch (ValidationException e) {
            respond appointment.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'appointment.label', default: 'Appointment'), appointment.id])
                redirect appointment
            }
            '*'{ respond appointment, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        appointmentService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'appointment.label', default: 'Appointment'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'appointment.label', default: 'Appointment'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
