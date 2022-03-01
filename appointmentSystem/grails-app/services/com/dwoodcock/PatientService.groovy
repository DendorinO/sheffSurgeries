package com.dwoodcock

import grails.gorm.services.Service

@Service(Patient)
interface PatientService {

    Patient get(Serializable id)

    List<Patient> list(Map args)

    Long count()

    void delete(Serializable id)

    Patient save(Patient patient)

}