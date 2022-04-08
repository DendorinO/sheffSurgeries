package com.dwoodcock

class Prescription {
	String pharmacyName
	int prescripNumber
	String medicine
	float totalCost
	Date dateIssued
	Boolean patientPaying
	static hasOne = [doctor:Doctor]
	static belongsTo = [Doctor, Patient]


    static constraints = {
	pharmacyName nullable: false, blank: false
	prescripNumber nullable: false, blank: false
	medicine nullable: false, blank: false
	totalCost nullable: false, blank: false, scale: 2
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false
	
    }
}
