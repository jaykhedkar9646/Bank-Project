package com.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;


@Data
@Entity
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Customer {

	@Id
	private String acc_No;
	
	private Name cust_Name;
	
	private Address addrs;
	
	private String aadhar_No;
	
	private String pan_No;
	
	private String birth_Date;
	
	private String mo_NO;
	
	private double amount;
	
	private String pin;
	
	private String act_Type;
	
	private String pass;
	
	private String date;
	
	@OneToMany(mappedBy = "customer", cascade= CascadeType.ALL)
	private List<Transaction> transaction;
}
