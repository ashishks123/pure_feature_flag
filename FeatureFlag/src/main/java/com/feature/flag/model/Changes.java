package com.feature.flag.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Change model to hold changes
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
public class Changes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String value;
	
	private Integer companyId;
	
	private Integer orgId;
	
	private Integer userId;

}
