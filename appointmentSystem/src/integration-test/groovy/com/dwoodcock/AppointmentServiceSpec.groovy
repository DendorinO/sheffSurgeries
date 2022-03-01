package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AppointmentServiceSpec extends Specification {

    AppointmentService appointmentService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Appointment(...).save(flush: true, failOnError: true)
        //new Appointment(...).save(flush: true, failOnError: true)
        //Appointment appointment = new Appointment(...).save(flush: true, failOnError: true)
        //new Appointment(...).save(flush: true, failOnError: true)
        //new Appointment(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //appointment.id
    }

    void "test get"() {
        setupData()

        expect:
        appointmentService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Appointment> appointmentList = appointmentService.list(max: 2, offset: 2)

        then:
        appointmentList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        appointmentService.count() == 5
    }

    void "test delete"() {
        Long appointmentId = setupData()

        expect:
        appointmentService.count() == 5

        when:
        appointmentService.delete(appointmentId)
        sessionFactory.currentSession.flush()

        then:
        appointmentService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Appointment appointment = new Appointment()
        appointmentService.save(appointment)

        then:
        appointment.id != null
    }
}
