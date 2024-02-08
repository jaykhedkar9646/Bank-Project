package com.customer_section;

import java.awt.Desktop.Action;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.admin.Homepage;
import com.modal.Customer;
import com.most_common_methods_and_classes.Hibernate_Util;
import com.most_common_methods_and_classes.Sign_up;
import com.most_common_methods_and_classes.Wait;

public class Create_Account extends Sign_up
{
	static String acc_NO,pin,acct_Type;
	static double amount;
	
	
	static Customer cust_Info=new Customer();
	
	

	public static void cust_Sign_up()
	{
		int temp=1;
		switch(temp)
		{
		case 1:
			Create_Account.add_Acct_Type();
		case 2:
			Create_Account.add_Acct_NO();
		case 3:
			Create_Account.add_Name();
		case 4:
			Create_Account.add_Address();
		case 5:
			Create_Account.add_Aadhar_No();
		case 6:
			Create_Account.add_Pan_NO();
		case 7:
			Create_Account.add_Mo_NO();
		case 8:
			Create_Account.add_Birth_Date(); 
		case 9:
			Create_Account.add_Amount();;
		case 10:
			Create_Account.add_Pin();
		case 11:
			Create_Account.add_Pass();
		case 12:
			Create_Account.add_Date();
		case 13:
			Create_Account.execute();
			break;
		}
	}
	public static void add_Acct_Type()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Select Account Type: \n 1:Savings\n 2:Current");
		int choice=sc.nextInt();
		
		if(choice<3)
		{	
		switch(choice)
		{
		case 1:
			 cust_Info.setAct_Type("Savings");
			break;
		case 2:
			cust_Info.setAct_Type("Current");
			break;
		}
		break;
		}
		else
		{
			System.out.println("Select 1/2 only...");
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Acct_NO()
	{
		while(true)
		{
		try
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		acc_NO=sc.next();
		
		Session session = Homepage.sf.openSession();
		
		Customer cust = session.get(Customer.class, acc_NO);
		
		
		if(cust!=null)
		{
			System.out.println("Account Number already exists...Choose Another One");
		}
		else
		{
		
		int count=0;
		char c;
		for(int i=0;i<acc_NO.length();i++)
		{
			c=acc_NO.charAt(i);
			if(c>=48 && c<=57)
			{
				count++;
			}
		}
		if(acc_NO.length()==count)
		{
			session.close();
			
			break;
		}
		else
		{
			System.out.println("Account Number in Digits Only...");
		}
		}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
		
	}
	
	
	public static void add_Amount()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount:");
		amount=sc.nextDouble();
		if(cust_Info.getAct_Type().equals("Savings"))
		{
			if(amount>=1000)
			{
				
				break;
			}
			else
			{
				System.out.println("Your Account is Savings...Minimum Amount Should be greater than 1000");
			}
		}
		else
		{
			cust_Info.setAmount(amount);
			break;
		}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Pin()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pin:");
		pin=sc.next();
		
		
		if(pin.length()>3 && pin.length()<5)
		{
		char c;
		int count1211=0;
		for(int i=0;i<pin.length();i++)
		{
			c=pin.charAt(i);
			if((c>=48 && c<=57))  
			{
				count1211++;
			}
			
		}
		if((count1211)==pin.length())
		{
			
			break;
		}
		else
		{
			System.out.println("In Pin only Digits(0-9) are Allow...");
		}
	}
		else
		{
			System.out.println("Pin  Length must be 4...");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	}
	
		public static void execute()
		{
			try
			{
				
			  	
	
	Session session = Homepage.sf.openSession();
	
	cust_Info.setAct_Type(cust_Info.getAct_Type());
	cust_Info.setAcc_No(acc_NO);
	cust_Info.setCust_Name(name);
	cust_Info.setAddrs(address);
	cust_Info.setAadhar_No(aadhar);
	cust_Info.setPan_No(pan);
	cust_Info.setMo_NO(mo_NO);
	cust_Info.setBirth_Date(birth_Date);
	cust_Info.setAmount(amount);
	cust_Info.setPin(pin);
	cust_Info.setPass(pass);
	cust_Info.setDate(date);
	
	session.save(cust_Info);
	session.beginTransaction().commit();
	
	Wait.wait_Time();
	
	
	
		System.out.println("Hello "+name.getFirst_Name()+" Your Account has been created successfully...");
	session.close();
	
	
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
}
