package com.dwoodcock

class Prescription {
	String pharmacyName
	int prescripNumber
	String medicine
	int totalCost
	Date dateIssued
	Boolean patientPaying

    static constraints = {
	pharmacyName nullable: false, blank: false
	prescripNumber nullable: false, blank: false
	medicine nullable: false, blank: false
	totalCost nullable: false, blank: false, scale: 2
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false
	
    }
}
