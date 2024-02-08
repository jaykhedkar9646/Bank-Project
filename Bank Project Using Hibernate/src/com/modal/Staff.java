package com.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Staff {

	@Id
	private String s_Id;
	
	private Name s_name;
	
	private Address addrs;
	
	private String aadhar_No;
	
	private String  pan_No;
	
	private String birth_Date;
	
	private String mo_No;
	
	private String pass;
	
	private String date;
}
