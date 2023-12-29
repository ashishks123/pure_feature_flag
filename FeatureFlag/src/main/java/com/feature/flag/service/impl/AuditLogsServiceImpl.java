package com.feature.flag.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.feature.flag.service.AuditLogsService;

/**
 * Audit Based service.
 * 
 * @author ashish singh
 * 
 */
@Service
public class AuditLogsServiceImpl implements AuditLogsService {

	public static Logger logger = LoggerFactory.getLogger(AuditLogsServiceImpl.class);
}
