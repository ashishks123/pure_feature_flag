package com.feature.flag.rest;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feature.flag.model.FeatureFlag;
import com.feature.flag.service.FeatureFlagService;
import com.feature.flag.utility.DummyDataUtility;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * 
 *  Rest Webservices for feature flag based operations.
 *  
 * @author ashish singh
 *
 */
@RestController
public class FeatureFlagRestService {

	public static Logger logger = LoggerFactory.getLogger(FeatureFlagRestService.class);
	
	@Autowired
	private FeatureFlagService featureFlagService;
	
	/**
	 * API to get status of feature flag.
	 * 
	 * @param featureId
	 * @return
	 */
	@GetMapping("/feature-flags")
	public ResponseEntity<?> featureFlag(@RequestParam("feature-id") String featureId) {
		FeatureFlag featureFlag = new FeatureFlag();
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		DummyDataUtility.populateDummyFeatureFlagStatus(featureFlag);
		return new ResponseEntity<FeatureFlag>(featureFlag, HttpStatus.OK);
	}
	
	
	/**
	 * API to get details of feature flag (supports searching,sorting,pagination).
	 * 
	 * @param env
	 * @param sortBy
	 * @param start
	 * @param limit
	 * @return
	 */
	@GetMapping("/feature-flags-details")
	public ResponseEntity<?> getFeatureFlagDetails(@RequestParam(value = "env",required = true) String env,
			@RequestParam(value="Filter-by",required = false) String filter,
			@RequestParam(value="Sort-by",defaultValue = "id",required = false) String sortBy,
            @RequestParam(value="start",defaultValue = "0",required = false) int start,
            @RequestParam(value="limit",defaultValue = "10",required = false) int limit) {
		FeatureFlag featureFlag = new FeatureFlag();
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		DummyDataUtility.populateDummyFeatureFlagDetail(featureFlag);
		return new ResponseEntity<FeatureFlag>(featureFlag, HttpStatus.OK);
	}
	
	/**
	 * API to - Check if a feature flag is valid for a company, OR a user in an org.
	 * 
	 * @param env
	 * @param companyId
	 * @param userId
	 * @param orgId
	 * @return
	 */
	@GetMapping("/valid-feature-flags")
	public ResponseEntity<?> validateFeatureFlag(@RequestParam(value="env", required = true) String env,
			@RequestParam(value="company-id", required = false) Integer companyId,
            @RequestParam(value="user-id",required = false) Integer userId,
            @RequestParam(value="org-id",required = false) Integer orgId) {
		FeatureFlag featureFlag = new FeatureFlag();
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		DummyDataUtility.populateDummyFeatureFlagStatus(featureFlag);
		return new ResponseEntity<FeatureFlag>(featureFlag, HttpStatus.OK);
	}
	

	/**
	 * API to create empty  feature flag.
	 * 
	 * @param env
	 * @param feature
	 * @return
	 */
	@PostMapping("/feature-flags")
	public ResponseEntity<?> createFeatureFlag(@RequestParam(value="env", required = true) String env,@RequestBody FeatureFlag feature) {
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		return new ResponseEntity<>(null, HttpStatus.CREATED);
	}
	
	
}
