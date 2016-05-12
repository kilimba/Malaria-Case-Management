/*Kilimba Analytix*/

package com.mcm2.tracking.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.mcm2.tracking.service.PatientResultsService;
import com.mcm2.tracking.service.PatientService;


import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wordnik.swagger.annotations.*;

import com.mcm2.tracking.*;
import com.mcm2.tracking.service.*;


/**
 * Controller object for domain model class Patient.
 * @see com.mcm2.tracking.Patient
 */

@RestController(value = "Tracking.PatientController")
@Api(value = "/tracking/Patient", description = "Exposes APIs to work with Patient resource.")
@RequestMapping("/tracking/Patient")
public class PatientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientController.class);

	@Autowired
	@Qualifier("tracking.PatientService")
	private PatientService patientService;


    @Autowired
    @Qualifier("tracking.PatientResultsService")
    private PatientResultsService patientResultsService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of Patient instances matching the search criteria.")
	public Page<Patient> findPatients( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering Patients list");
		return patientService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of Patient instances.")
	public Page<Patient> getPatients(Pageable pageable) {
		LOGGER.debug("Rendering Patients list");
		return patientService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of Patient instances.")
	public Long countAllPatients() {
		LOGGER.debug("counting Patients");
		Long count = patientService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Patient instance associated with the given id.")
    public Patient getPatient(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Patient with id: {}" , id);
        Patient instance = patientService.findById(id);
        LOGGER.debug("Patient details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Patient instance associated with the given id.")
    public boolean deletePatient(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Patient with id: {}" , id);
        Patient deleted = patientService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Patient instance associated with the given id.")
    public Patient editPatient(@PathVariable("id") Integer id, @RequestBody Patient instance) throws EntityNotFoundException {
        LOGGER.debug("Editing Patient with id: {}" , instance.getPatientId());
        instance.setPatientId(id);
        instance = patientService.update(instance);
        LOGGER.debug("Patient details with id: {}" , instance);
        return instance;
    }


    @RequestMapping(value="/{id:.+}/patientResultses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the patientResultses instance associated with the given id.")
     public Page<PatientResults> findAssociatedpatientResultses(Pageable pageable, @PathVariable("id") Integer id){
        LOGGER.debug("Fetching all associated patientResultses");
        return patientResultsService.findAssociatedValues(id,"patient","patientId", pageable);
   }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new Patient instance.")
	public Patient createPatient(@RequestBody Patient instance) {
		LOGGER.debug("Create Patient with information: {}" , instance);
		instance = patientService.create(instance);
		LOGGER.debug("Created Patient with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setPatientService(PatientService service) {
		this.patientService = service;
	}
}
