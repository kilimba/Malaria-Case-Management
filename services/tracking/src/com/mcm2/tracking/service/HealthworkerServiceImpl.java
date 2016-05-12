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
 * ServiceImpl object for domain model class Healthworker.
 * @see com.mcm2.tracking.Healthworker
 */
@Service("tracking.HealthworkerService")
public class HealthworkerServiceImpl implements HealthworkerService {


    private static final Logger LOGGER = LoggerFactory.getLogger(HealthworkerServiceImpl.class);

    @Autowired
    @Qualifier("tracking.HealthworkerDao")
    private WMGenericDao<Healthworker, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Healthworker, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "trackingTransactionManager")
     public Page<Healthworker> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "trackingTransactionManager")
    @Override
    public Healthworker create(Healthworker healthworker) {
        LOGGER.debug("Creating a new healthworker with information: {}" , healthworker);
        return this.wmGenericDao.create(healthworker);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Healthworker delete(Integer healthworkerId) throws EntityNotFoundException {
        LOGGER.debug("Deleting healthworker with id: {}" , healthworkerId);
        Healthworker deleted = this.wmGenericDao.findById(healthworkerId);
        if (deleted == null) {
            LOGGER.debug("No healthworker found with id: {}" , healthworkerId);
            throw new EntityNotFoundException(String.valueOf(healthworkerId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Healthworker> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all healthworkers");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Healthworker> findAll(Pageable pageable) {
        LOGGER.debug("Finding all healthworkers");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Healthworker findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding healthworker by id: {}" , id);
        Healthworker healthworker=this.wmGenericDao.findById(id);
        if(healthworker==null){
            LOGGER.debug("No healthworker found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return healthworker;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Healthworker update(Healthworker updated) throws EntityNotFoundException {
        LOGGER.debug("Updating healthworker with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getId());
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

