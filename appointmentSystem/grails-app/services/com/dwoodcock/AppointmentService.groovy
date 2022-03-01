package com.dwoodcock

import grails.gorm.services.Service

@Service(Appointment)
interface AppointmentService {

    Appointment get(Serializable id)

    List<Appointment> list(Map args)

    Long count()

    void delete(Serializable id)

    Appointment save(Appointment appointment)

}