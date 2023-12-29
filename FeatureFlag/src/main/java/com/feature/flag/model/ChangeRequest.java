package com.feature.flag.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * ChangeRequest model to hold changesRequest
 * 
 * @author ashish singh
 * 
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ChangeRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Integer featureId;
	
	private Long requestTime;
	
	private String requestBy;
	
	private List<Changes> changes;
	
	private String status;
	
	private Long lastUpdatedTime;
	
	private String lastUpdatedBy;
	
	private String action;
}
