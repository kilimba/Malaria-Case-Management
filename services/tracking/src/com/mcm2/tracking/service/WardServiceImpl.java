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
 * ServiceImpl object for domain model class Ward.
 * @see com.mcm2.tracking.Ward
 */
@Service("tracking.WardService")
public class WardServiceImpl implements WardService {


    private static final Logger LOGGER = LoggerFactory.getLogger(WardServiceImpl.class);

    @Autowired
    @Qualifier("tracking.WardDao")
    private WMGenericDao<Ward, Short> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Ward, Short> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "trackingTransactionManager")
     public Page<Ward> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "trackingTransactionManager")
    @Override
    public Ward create(Ward ward) {
        LOGGER.debug("Creating a new ward with information: {}" , ward);
        return this.wmGenericDao.create(ward);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Ward delete(short wardId) throws EntityNotFoundException {
        LOGGER.debug("Deleting ward with id: {}" , wardId);
        Ward deleted = this.wmGenericDao.findById(wardId);
        if (deleted == null) {
            LOGGER.debug("No ward found with id: {}" , wardId);
            throw new EntityNotFoundException(String.valueOf(wardId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Ward> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all wards");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Ward> findAll(Pageable pageable) {
        LOGGER.debug("Finding all wards");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Ward findById(short id) throws EntityNotFoundException {
        LOGGER.debug("Finding ward by id: {}" , id);
        Ward ward=this.wmGenericDao.findById(id);
        if(ward==null){
            LOGGER.debug("No ward found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return ward;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Ward update(Ward updated) throws EntityNotFoundException {
        LOGGER.debug("Updating ward with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((short)updated.getWardId());
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

