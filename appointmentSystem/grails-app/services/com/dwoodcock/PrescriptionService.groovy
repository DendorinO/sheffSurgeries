package com.dwoodcock

import grails.gorm.services.Service

@Service(Prescription)
interface PrescriptionService {

    Prescription get(Serializable id)

    List<Prescription> list(Map args)

    Long count()

    void delete(Serializable id)

    Prescription save(Prescription prescription)

}