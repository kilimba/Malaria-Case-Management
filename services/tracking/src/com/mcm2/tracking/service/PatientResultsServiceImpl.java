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
 * ServiceImpl object for domain model class PatientResults.
 * @see com.mcm2.tracking.PatientResults
 */
@Service("tracking.PatientResultsService")
public class PatientResultsServiceImpl implements PatientResultsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PatientResultsServiceImpl.class);

    @Autowired
    @Qualifier("tracking.PatientResultsDao")
    private WMGenericDao<PatientResults, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<PatientResults, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "trackingTransactionManager")
     public Page<PatientResults> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "trackingTransactionManager")
    @Override
    public PatientResults create(PatientResults patientresults) {
        LOGGER.debug("Creating a new patientresults with information: {}" , patientresults);
        return this.wmGenericDao.create(patientresults);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public PatientResults delete(Integer patientresultsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting patientresults with id: {}" , patientresultsId);
        PatientResults deleted = this.wmGenericDao.findById(patientresultsId);
        if (deleted == null) {
            LOGGER.debug("No patientresults found with id: {}" , patientresultsId);
            throw new EntityNotFoundException(String.valueOf(patientresultsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<PatientResults> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all patientresultss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<PatientResults> findAll(Pageable pageable) {
        LOGGER.debug("Finding all patientresultss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public PatientResults findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding patientresults by id: {}" , id);
        PatientResults patientresults=this.wmGenericDao.findById(id);
        if(patientresults==null){
            LOGGER.debug("No patientresults found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return patientresults;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public PatientResults update(PatientResults updated) throws EntityNotFoundException {
        LOGGER.debug("Updating patientresults with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getResultsId());
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


