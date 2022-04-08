package com.dwoodcock

class Surgery {
	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime
	static hasMany = [doctors:Doctor, receptionists:Receptionist, nurses:Nurse, patients:Patient, appointments:Appointment]


    static constraints = {
	name nullable: false, blank: false
	address nullable: false, blank: false
	postcode nullable: false, blank: false, minSize: 5, maxSize: 8
	telephone nullable: false, blank: false, maxSize: 11
	numberOfPatients nullable: false, blank: false, maxSize: 50
	description nullable: false, blank: false
	openingTime nullable: false, blank: false
    }
}
