package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ReceptionistServiceSpec extends Specification {

    ReceptionistService receptionistService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Receptionist(...).save(flush: true, failOnError: true)
        //new Receptionist(...).save(flush: true, failOnError: true)
        //Receptionist receptionist = new Receptionist(...).save(flush: true, failOnError: true)
        //new Receptionist(...).save(flush: true, failOnError: true)
        //new Receptionist(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //receptionist.id
    }

    void "test get"() {
        setupData()

        expect:
        receptionistService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Receptionist> receptionistList = receptionistService.list(max: 2, offset: 2)

        then:
        receptionistList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        receptionistService.count() == 5
    }

    void "test delete"() {
        Long receptionistId = setupData()

        expect:
        receptionistService.count() == 5

        when:
        receptionistService.delete(receptionistId)
        sessionFactory.currentSession.flush()

        then:
        receptionistService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Receptionist receptionist = new Receptionist()
        receptionistService.save(receptionist)

        then:
        receptionist.id != null
    }
}
