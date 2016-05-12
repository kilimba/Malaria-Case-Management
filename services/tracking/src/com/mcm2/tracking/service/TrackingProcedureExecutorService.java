/*Kilimba Analytix*/


package com.mcm2.tracking.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface TrackingProcedureExecutorService {

	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

