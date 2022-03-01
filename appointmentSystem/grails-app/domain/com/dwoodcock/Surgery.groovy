package com.dwoodcock

class Surgery {
	String name
	String address
	String postcode
	int telephone
	int numberOfPatients
	String description
	Date openingTime

    static constraints = {
	name nullable: false, blank: false
	address nullable: false, blank: false
	postcode nullable: false, blank: false
	telephone nullable: false, blank: false, maxSize: 11
	numberOfPatients nullable: false, blank: false, maxSize: 50
	description nullable: false, blank: false
	openingTime nullable: false, blank: false, format: 'hh-mm'
    }
}
