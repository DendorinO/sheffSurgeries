package com.dwoodcock

class Appointment {
	date appDate
	time appTime
	time appDuration
	String roomNumber

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank: false, nullable: false, format: 'hh-mm'
	appDuration: blank: false, nullable: false, format: 'mm'
	roomNumber: blank: false, nullable: false
    }
}
