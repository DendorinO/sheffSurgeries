package com.dwoodcock

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	def recepLoginToggle = {

		out<<"<div style='margin:15px0 40px;'>"

		if (request.getSession(false) && session.user){

			out<<"<span style='float:left;margin-left: 15px'>"
			out<< "Welcome ${session.user}."
			out<< "</span><span style='float:right;margin-right: 15px'>"
			out<< "<a href='${createLink(controller:'receptionist',action:'logout')}'>"
			out<< "Receptionist Logout <a/></span>"
		} 
		else {
			out<<"<span style='float:right;margin-right: 10px'>"
			out<< "<a href='${createLink(controller:'receptionist',action:'login')}'>"
			out<< "Receptionist Login <a/></span>"
		}

		out<<"</div><br/>"
	}

	def docLoginToggle = {

		out<<"<div style='margin:15px0 40px;'>"

		if (request.getSession(false) && session.user){

			out<<"<span style='float:left;margin-left: 15px'>"
			out<< "Welcome ${session.user}."
			out<< "</span><span style='float:right;margin-right: 15px'>"
			out<< "<a href='${createLink(controller:'doctor',action:'logout')}'>"
			out<< "Doctor Logout <a/></span>"
		} 
		else {
			out<<"<span style='float:right;margin-right: 10px'>"
			out<< "<a href='${createLink(controller:'doctor',action:'login')}'>"
			out<< "Doctor Login <a/></span>"
		}

		out<<"</div><br/>"
	}
}
