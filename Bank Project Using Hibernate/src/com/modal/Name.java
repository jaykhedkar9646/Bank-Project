package com.modal;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Name {

	private String first_Name;
	
	private String middle_Name;
	
	private String last_Name;
	
	
}
