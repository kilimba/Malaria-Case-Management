/*Kilimba Analytix*/

package com.mcm2.tracking.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.mcm2.tracking.*;


/**
 * ServiceImpl object for domain model class Patient.
 * @see com.mcm2.tracking.Patient
 */
@Service("tracking.PatientService")
public class PatientServiceImpl implements PatientService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PatientServiceImpl.class);

    @Autowired
    @Qualifier("tracking.PatientDao")
    private WMGenericDao<Patient, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Patient, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "trackingTransactionManager")
     public Page<Patient> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "trackingTransactionManager")
    @Override
    public Patient create(Patient patient) {
        LOGGER.debug("Creating a new patient with information: {}" , patient);
        return this.wmGenericDao.create(patient);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Patient delete(Integer patientId) throws EntityNotFoundException {
        LOGGER.debug("Deleting patient with id: {}" , patientId);
        Patient deleted = this.wmGenericDao.findById(patientId);
        if (deleted == null) {
            LOGGER.debug("No patient found with id: {}" , patientId);
            throw new EntityNotFoundException(String.valueOf(patientId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Patient> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all patients");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Patient> findAll(Pageable pageable) {
        LOGGER.debug("Finding all patients");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Patient findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding patient by id: {}" , id);
        Patient patient=this.wmGenericDao.findById(id);
        if(patient==null){
            LOGGER.debug("No patient found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return patient;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Patient update(Patient updated) throws EntityNotFoundException {
        LOGGER.debug("Updating patient with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getPatientId());
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


