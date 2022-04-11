package com.dwoodcock

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	def loginToggle = {

		out<<"<div style='margin:15px0 40px;'>"

		if (request.getSession(false) && session.user){

			out<<"<span style='float:left;margin-left: 15px'>"
			out<< "Welcome ${session.user}."
			out<< "</span><span style='float:right;margin-right: 15px'>"
			out<< "<a href='${createLink(controller:'receptionist',action:'logout')}'>"
			out<< "Logout <a/></span>"
		} 
		else {
			out<<"<span style='float:right;margin-right: 10px'>"
			out<< "<a href='${createLink(controller:'receptionist',action:'login')}'>"
			out<< "Login <a/></span>"
		}

		out<<"</div><br/>"
	}
}
