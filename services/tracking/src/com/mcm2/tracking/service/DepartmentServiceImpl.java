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
 * ServiceImpl object for domain model class Department.
 * @see com.mcm2.tracking.Department
 */
@Service("tracking.DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    @Qualifier("tracking.DepartmentDao")
    private WMGenericDao<Department, Integer> wmGenericDao;
    public void setWMGenericDao(WMGenericDao<Department, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "trackingTransactionManager")
     public Page<Department> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "trackingTransactionManager")
    @Override
    public Department create(Department department) {
        LOGGER.debug("Creating a new department with information: {}" , department);
        return this.wmGenericDao.create(department);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Department delete(Integer departmentId) throws EntityNotFoundException {
        LOGGER.debug("Deleting department with id: {}" , departmentId);
        Department deleted = this.wmGenericDao.findById(departmentId);
        if (deleted == null) {
            LOGGER.debug("No department found with id: {}" , departmentId);
            throw new EntityNotFoundException(String.valueOf(departmentId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Department> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all departments");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Page<Department> findAll(Pageable pageable) {
        LOGGER.debug("Finding all departments");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public Department findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding department by id: {}" , id);
        Department department=this.wmGenericDao.findById(id);
        if(department==null){
            LOGGER.debug("No department found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return department;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "trackingTransactionManager")
    @Override
    public Department update(Department updated) throws EntityNotFoundException {
        LOGGER.debug("Updating department with information: {}" , updated);
        this.wmGenericDao.update(updated);
        return this.wmGenericDao.findById((Integer)updated.getId());
    }

    @Transactional(readOnly = true, value = "trackingTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

