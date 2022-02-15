package com.dwoodcock

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DoctorSpec extends Specification implements DomainUnitTest<Doctor> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
