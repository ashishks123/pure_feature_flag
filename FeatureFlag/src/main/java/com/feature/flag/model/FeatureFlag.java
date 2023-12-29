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
 * FeatureFlag model to respond
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
public class FeatureFlag implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String value;
	
	private List<Company> companies;
	
	
}
