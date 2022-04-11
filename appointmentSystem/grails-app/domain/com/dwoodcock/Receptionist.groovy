package com.dwoodcock

class Receptionist {
	String recepName
	String recepEmail
	String username
	String password
	String recepPhone
	static hasOne = [surgery:Surgery]

    static constraints = {
	recepName nullable:false, blank: false
	recepEmail nullable:false, blank: false, email: true
	username nullable:false, blank: false
	password nullable:false, blank: false, password: true
	recepPhone nullable:false, blank: false, maxSize: 11
    }
}
