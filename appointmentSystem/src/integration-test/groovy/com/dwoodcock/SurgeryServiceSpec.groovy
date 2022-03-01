package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SurgeryServiceSpec extends Specification {

    SurgeryService surgeryService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Surgery(...).save(flush: true, failOnError: true)
        //new Surgery(...).save(flush: true, failOnError: true)
        //Surgery surgery = new Surgery(...).save(flush: true, failOnError: true)
        //new Surgery(...).save(flush: true, failOnError: true)
        //new Surgery(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //surgery.id
    }

    void "test get"() {
        setupData()

        expect:
        surgeryService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Surgery> surgeryList = surgeryService.list(max: 2, offset: 2)

        then:
        surgeryList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        surgeryService.count() == 5
    }

    void "test delete"() {
        Long surgeryId = setupData()

        expect:
        surgeryService.count() == 5

        when:
        surgeryService.delete(surgeryId)
        sessionFactory.currentSession.flush()

        then:
        surgeryService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Surgery surgery = new Surgery()
        surgeryService.save(surgery)

        then:
        surgery.id != null
    }
}
