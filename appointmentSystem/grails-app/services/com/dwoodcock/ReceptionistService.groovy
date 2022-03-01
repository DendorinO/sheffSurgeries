package com.dwoodcock

import grails.gorm.services.Service

@Service(Receptionist)
interface ReceptionistService {

    Receptionist get(Serializable id)

    List<Receptionist> list(Map args)

    Long count()

    void delete(Serializable id)

    Receptionist save(Receptionist receptionist)

}