/*Kilimba Analytix*/

package com.mcm2.tracking.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.mcm2.tracking.*;
/**
 * Specifies methods used to obtain and modify Healthworker related information
 * which is stored in the database.
 */
@Repository("tracking.HealthworkerDao")
public class HealthworkerDao extends WMGenericDaoImpl <Healthworker, Integer> {

   @Autowired
   @Qualifier("trackingTemplate")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}
