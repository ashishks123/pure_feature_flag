package com.feature.flag.rest;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *  Health Check Rest Web Service.
 *  
 * @author ashish singh
 *
 */
@RestController
@RequestMapping("/v1")
public class HealthCheckController {

	public static Logger logger = LoggerFactory.getLogger(HealthCheckController.class);


	@GetMapping("/health-check")
	public ResponseEntity<?> healthCheck() {
		Map<String, String> test = new HashMap<String, String>();
		test.put("STATUS", "SUCCESS");
		return new ResponseEntity<Map<String,String>>(test, HttpStatus.OK);
	}

}
