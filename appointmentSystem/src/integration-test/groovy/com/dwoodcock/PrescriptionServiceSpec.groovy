package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PrescriptionServiceSpec extends Specification {

    PrescriptionService prescriptionService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Prescription(...).save(flush: true, failOnError: true)
        //new Prescription(...).save(flush: true, failOnError: true)
        //Prescription prescription = new Prescription(...).save(flush: true, failOnError: true)
        //new Prescription(...).save(flush: true, failOnError: true)
        //new Prescription(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //prescription.id
    }

    void "test get"() {
        setupData()

        expect:
        prescriptionService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Prescription> prescriptionList = prescriptionService.list(max: 2, offset: 2)

        then:
        prescriptionList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        prescriptionService.count() == 5
    }

    void "test delete"() {
        Long prescriptionId = setupData()

        expect:
        prescriptionService.count() == 5

        when:
        prescriptionService.delete(prescriptionId)
        sessionFactory.currentSession.flush()

        then:
        prescriptionService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Prescription prescription = new Prescription()
        prescriptionService.save(prescription)

        then:
        prescription.id != null
    }
}
