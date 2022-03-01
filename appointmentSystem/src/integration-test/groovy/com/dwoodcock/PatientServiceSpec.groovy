package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PatientServiceSpec extends Specification {

    PatientService patientService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Patient(...).save(flush: true, failOnError: true)
        //new Patient(...).save(flush: true, failOnError: true)
        //Patient patient = new Patient(...).save(flush: true, failOnError: true)
        //new Patient(...).save(flush: true, failOnError: true)
        //new Patient(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //patient.id
    }

    void "test get"() {
        setupData()

        expect:
        patientService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Patient> patientList = patientService.list(max: 2, offset: 2)

        then:
        patientList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        patientService.count() == 5
    }

    void "test delete"() {
        Long patientId = setupData()

        expect:
        patientService.count() == 5

        when:
        patientService.delete(patientId)
        sessionFactory.currentSession.flush()

        then:
        patientService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Patient patient = new Patient()
        patientService.save(patient)

        then:
        patient.id != null
    }
}
