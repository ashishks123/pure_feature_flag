package com.feature.flag.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feature.flag.model.AuditLog;
import com.feature.flag.model.FeatureFlag;
import com.feature.flag.service.AuditLogsService;
import com.feature.flag.utility.DummyDataUtility;

/**
 * 
 *  Rest Webservices for audit based operations.
 *  
 * @author ashish singh
 *
 */
@RestController
@RequestMapping("/audit-logs")
public class AuditRestService {

	public static Logger logger = LoggerFactory.getLogger(AuditRestService.class);
	
	@Autowired
	private AuditLogsService auditLogsService;
	
	/**
	 * API to get audit logs.
	 * 
	 * @param featureId
	 * @return
	 */
	@GetMapping
	public ResponseEntity<?> featureFlag(@RequestParam(required = false) String filter,
			@RequestParam(defaultValue = "id",required = false) String sortBy,
            @RequestParam(defaultValue = "0",required = false) int start,
            @RequestParam(defaultValue = "10",required = false) int limit) {
		List<AuditLog> auditLogs = new ArrayList<AuditLog>();
		/*
		 * Calling service layer and get data from backend and perform buisness logic 
		 * needs to be written. for now respond dummy.
		 */
		DummyDataUtility.populateDummyAuditLogs(auditLogs);
		return new ResponseEntity<List<AuditLog>>(auditLogs, HttpStatus.OK);
	}
	
}
