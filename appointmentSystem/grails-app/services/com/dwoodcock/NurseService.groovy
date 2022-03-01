package com.dwoodcock

import grails.gorm.services.Service

@Service(Nurse)
interface NurseService {

    Nurse get(Serializable id)

    List<Nurse> list(Map args)

    Long count()

    void delete(Serializable id)

    Nurse save(Nurse nurse)

}