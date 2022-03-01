package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DoctorServiceSpec extends Specification {

    DoctorService doctorService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Doctor(...).save(flush: true, failOnError: true)
        //new Doctor(...).save(flush: true, failOnError: true)
        //Doctor doctor = new Doctor(...).save(flush: true, failOnError: true)
        //new Doctor(...).save(flush: true, failOnError: true)
        //new Doctor(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //doctor.id
    }

    void "test get"() {
        setupData()

        expect:
        doctorService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Doctor> doctorList = doctorService.list(max: 2, offset: 2)

        then:
        doctorList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        doctorService.count() == 5
    }

    void "test delete"() {
        Long doctorId = setupData()

        expect:
        doctorService.count() == 5

        when:
        doctorService.delete(doctorId)
        sessionFactory.currentSession.flush()

        then:
        doctorService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Doctor doctor = new Doctor()
        doctorService.save(doctor)

        then:
        doctor.id != null
    }
}
