/*Kilimba Analytix*/

package com.mcm2.tracking.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.mcm2.tracking.service.PatientResultsService;


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
 * Controller object for domain model class PatientResults.
 * @see com.mcm2.tracking.PatientResults
 */

@RestController(value = "Tracking.PatientResultsController")
@Api(value = "/tracking/PatientResults", description = "Exposes APIs to work with PatientResults resource.")
@RequestMapping("/tracking/PatientResults")
public class PatientResultsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientResultsController.class);

	@Autowired
	@Qualifier("tracking.PatientResultsService")
	private PatientResultsService patientResultsService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of PatientResults instances matching the search criteria.")
	public Page<PatientResults> findPatientResultss( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering PatientResultss list");
		return patientResultsService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of PatientResults instances.")
	public Page<PatientResults> getPatientResultss(Pageable pageable) {
		LOGGER.debug("Rendering PatientResultss list");
		return patientResultsService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of PatientResults instances.")
	public Long countAllPatientResultss() {
		LOGGER.debug("counting PatientResultss");
		Long count = patientResultsService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the PatientResults instance associated with the given id.")
    public PatientResults getPatientResults(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting PatientResults with id: {}" , id);
        PatientResults instance = patientResultsService.findById(id);
        LOGGER.debug("PatientResults details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the PatientResults instance associated with the given id.")
    public boolean deletePatientResults(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting PatientResults with id: {}" , id);
        PatientResults deleted = patientResultsService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the PatientResults instance associated with the given id.")
    public PatientResults editPatientResults(@PathVariable("id") Integer id, @RequestBody PatientResults instance) throws EntityNotFoundException {
        LOGGER.debug("Editing PatientResults with id: {}" , instance.getResultsId());
        instance.setResultsId(id);
        instance = patientResultsService.update(instance);
        LOGGER.debug("PatientResults details with id: {}" , instance);
        return instance;
    }




	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new PatientResults instance.")
	public PatientResults createPatientResults(@RequestBody PatientResults instance) {
		LOGGER.debug("Create PatientResults with information: {}" , instance);
		instance = patientResultsService.create(instance);
		LOGGER.debug("Created PatientResults with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setPatientResultsService(PatientResultsService service) {
		this.patientResultsService = service;
	}
}

