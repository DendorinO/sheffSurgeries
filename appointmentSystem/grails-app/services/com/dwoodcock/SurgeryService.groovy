package com.dwoodcock

import grails.gorm.services.Service

@Service(Surgery)
interface SurgeryService {

    Surgery get(Serializable id)

    List<Surgery> list(Map args)

    Long count()

    void delete(Serializable id)

    Surgery save(Surgery surgery)

}