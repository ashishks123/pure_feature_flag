package com.feature.flag.utility;

import java.util.ArrayList;
import java.util.List;

import com.feature.flag.model.AuditLog;
import com.feature.flag.model.ChangeRequest;
import com.feature.flag.model.Changes;
import com.feature.flag.model.Company;
import com.feature.flag.model.FeatureFlag;
import com.feature.flag.model.Organization;
import com.feature.flag.model.User;

/**
 * 
 * Class is created to populate dummy data just for now once get DB will stop populating dummy.
 */
public class DummyDataUtility {

	
	public static void populateDummyFeatureFlagStatus(FeatureFlag featureFlag) {
		featureFlag.setId("feature-1");
		featureFlag.setValue("1");
	}
	
	public static void populateDummyFeatureFlagDetail(FeatureFlag featureFlag) {
		List<Organization> orgs = new ArrayList<Organization>();
		Organization org1 = new Organization();
		org1.setId(121);
		org1.setName("Org 1");
		org1.setValue("1");
		
		Organization org2 = new Organization();
		org2.setId(123);
		org2.setName("Org 2");
		org2.setValue("-1");
		
		orgs.add(org1);
		orgs.add(org2);
		List<User> users = new ArrayList<User>();
		
		User user = new User();
		user.setEmail("test@gmail.com");
		user.setId(1);
		user.setValue("1");
		
		users.add(user);
		
		List<Company> companies = new ArrayList<Company>();
		Company company = new Company();
		company.setId(121);
		company.setName("Comp 1");
		company.setOrgs(orgs);
		company.setUsers(users);
		company.setValue("1");
		
		company.setOrgs(orgs);
		company.setUsers(users);
		
		companies.add(company);
		
		featureFlag.setId("feature-1");
		//featureFlag.setValue(null);
		featureFlag.setCompanies(companies);
	}
	
	public static void populateDummyAuditLogs(List<AuditLog> auditLogs) {
		AuditLog auditLog = new AuditLog();
		auditLog.setAction("request");
		auditLog.setActionBy("abc@gmail.com");
		auditLog.setRequestId(123);
		auditLog.setTime(1693955698791l);
		
		AuditLog auditLog1 = new AuditLog();
		auditLog1.setAction("approve");
		auditLog1.setActionBy("xyz@gmail.com");
		auditLog1.setRequestId(321);
		auditLog1.setTime(1693955698791l);
		
		auditLogs.add(auditLog);
		auditLogs.add(auditLog1);
	}
	
	public static void populateDummyChangeRequests(List<ChangeRequest> changeRequests) {
		List<Changes> changesList = new ArrayList<Changes>();
		Changes changes = new Changes();
		changes.setCompanyId(123);
		changes.setOrgId(212);
		changes.setUserId(121);
		changes.setValue("1");
		changesList.add(changes);
		ChangeRequest changeRequest = new ChangeRequest();
		changeRequest.setChanges(changesList);
		changeRequest.setFeatureId(1);
		changeRequest.setId(11);
		changeRequest.setLastUpdatedBy("abc@gmail.com");
		changeRequest.setLastUpdatedTime(1693955698791l);
		changeRequest.setRequestBy("xyz@gmail.com");
		changeRequest.setRequestTime(1693955698791l);
		changeRequest.setStatus("decline");
		changeRequest.setAction("delete-feature-flag");
		changeRequests.add(changeRequest);
	}
}
