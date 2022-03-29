package com.dwoodcock

class Appointment {
	Date appDate
	String appTime
	int appDuration
	int roomNumber
	static hasOne = [patient:Patient]
	static hasMany = [surgeries:Surgery]
	static belongsTo = [doctor:Doctor] [Surgery]

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank: false, nullable: false
	appDuration blank: false, nullable: false, maxSize: 60
	roomNumber blank: false, nullable: false
    }
}
