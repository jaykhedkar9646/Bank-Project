package com.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	long t_Id;

	private String description;
	
	private String date;
	
	private String time;
	
	private double debit;
	
	private double credit;
	
	private double amount;
	
	private String acc_No;
	
	@ManyToOne
	private Customer customer;
}
