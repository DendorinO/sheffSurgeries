package com.dwoodcock

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NurseServiceSpec extends Specification {

    NurseService nurseService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Nurse(...).save(flush: true, failOnError: true)
        //new Nurse(...).save(flush: true, failOnError: true)
        //Nurse nurse = new Nurse(...).save(flush: true, failOnError: true)
        //new Nurse(...).save(flush: true, failOnError: true)
        //new Nurse(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //nurse.id
    }

    void "test get"() {
        setupData()

        expect:
        nurseService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Nurse> nurseList = nurseService.list(max: 2, offset: 2)

        then:
        nurseList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        nurseService.count() == 5
    }

    void "test delete"() {
        Long nurseId = setupData()

        expect:
        nurseService.count() == 5

        when:
        nurseService.delete(nurseId)
        sessionFactory.currentSession.flush()

        then:
        nurseService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Nurse nurse = new Nurse()
        nurseService.save(nurse)

        then:
        nurse.id != null
    }
}
