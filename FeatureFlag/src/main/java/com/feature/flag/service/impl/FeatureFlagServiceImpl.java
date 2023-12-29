package com.feature.flag.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.feature.flag.service.FeatureFlagService;

/**
 * FeatureFlag based services.
 * 
 * @author ashish singh
 * 
 */
@Service
public class FeatureFlagServiceImpl implements FeatureFlagService {

	public static Logger logger = LoggerFactory.getLogger(FeatureFlagServiceImpl.class);
}
