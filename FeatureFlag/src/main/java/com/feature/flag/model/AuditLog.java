package com.feature.flag.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * AuditLog model to respond
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
public class AuditLog implements Serializable {
	
	private static final long serialVersionUID = 1092721178152596130L;

	private Integer requestId;
	
	private String action;
	
	private String actionBy;
	
	private Long time;
}
