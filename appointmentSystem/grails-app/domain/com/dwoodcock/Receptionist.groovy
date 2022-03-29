package com.dwoodcock

class Receptionist {
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone
	static belongsTo = [surgery:Surgery]

    static constraints = {
	recepName nullable:false, blank: false
	recepEmail nullable:false, blank: false, email: true
	recepUsername nullable:false, blank: false
	recepPassword nullable:false, blank: false, password: true
	recepPhone nullable:false, blank: false, maxSize: 11
    }
}
