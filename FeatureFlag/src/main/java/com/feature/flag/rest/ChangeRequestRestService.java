package com.feature.flag.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feature.flag.model.ChangeRequest;
import com.feature.flag.utility.DummyDataUtility;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * 
 *  Rest Webservices for change request based workflow.
 *  
 * @author ashish singh
 *
 */
@RestController
@RequestMapping("/change-request")
public class ChangeRequestRestService {

	public static Logger logger = LoggerFactory.getLogger(ChangeRequestRestService.class);
	
	
	/**
	 * API to get Change Requests.
	 * 
	 * @param filter
	 * @param sortBy
	 * @param start
	 * @param limit
	 * @return
	 */
	@GetMapping
	public ResponseEntity<?> changeRequests(@RequestParam(value = "env",required = true) String env,
			@RequestParam(value="Filter-by",required = false) String filter,
			@RequestParam(value="Sort-by",defaultValue = "id",required = false) String sortBy,
            @RequestParam(value="start",defaultValue = "0",required = false) int start,
            @RequestParam(value="limit",defaultValue = "10",required = false) int limit) {
		List<ChangeRequest> changeRequests = new ArrayList<ChangeRequest>();
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		DummyDataUtility.populateDummyChangeRequests(changeRequests);
		return new ResponseEntity<List<ChangeRequest>>(changeRequests, HttpStatus.OK);
	}
	
	/**
	 * API to create change request.
	 * 
	 * @param env
	 * @param feature
	 * @return
	 */
	@PostMapping
	public ResponseEntity<?> createChangeRequest(@RequestParam(value="env", required = true) String env,@RequestBody ChangeRequest changeRequest) {
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		return new ResponseEntity<>(null, HttpStatus.CREATED);
	}
	
	
	/**
	 * API to update change request.
	 * 
	 * @param env
	 * @param feature
	 * @return
	 */
	@PutMapping
	public ResponseEntity<?> updateChangeRequest(@RequestParam(value="env", required = true) String env,@RequestBody ChangeRequest changeRequest) {
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
	}
}
