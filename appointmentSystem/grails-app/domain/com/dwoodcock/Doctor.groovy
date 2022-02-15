package com.dwoodcock

class Doctor {
	String fullName
	String qualification
	String position
	varchar doctorEmail
	varchar password
	varchar doctorOffice
	int doctorPhone
	String bio

    static constraints = {
	fullName nullable: false, blank: false
	qualification nullable: false, blank: false
	position nullable: false, blank: false
	doctorEmail nullable: false, blank: false, email: true
	password nullable: false, blank: false, password: true
	doctorOffice nullable: false, blank: false
	doctorPhone nullable: false, blank: false, maxSize: 11
	bio nullable: false, blank: false
    }
}
