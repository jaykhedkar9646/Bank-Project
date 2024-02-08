package com.modal;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

	private String village;
	
	private String taluka;
	
	private String district;
	
	private String pincode;
	
}
