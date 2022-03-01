package com.dwoodcock

class Appointment {
	Date appDate
	Date appTime
	Date appDuration
	String roomNumber

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank: false, nullable: false, format: 'hh-mm'
	appDuration blank: false, nullable: false, format: 'mm'
	roomNumber blank: false, nullable: false
    }
}
