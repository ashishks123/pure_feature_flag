package com.feature.flag.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Orgs model to respond
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
public class Organization implements Serializable {

	private static final long serialVersionUID = -6589830682182212805L;

	private Integer id;
	
	private String name;
	
	private String value;
}
