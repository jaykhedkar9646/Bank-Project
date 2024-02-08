package com.admin;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.customer_section.Cust_Homepage;
import com.customer_section.Cust_Operation;
import com.modal.Admin;
import com.modal.Customer;
import com.modal.Staff;
import com.modal.Transaction;
import com.most_common_methods_and_classes.Hibernate_Util;
import com.staff_section.Staff_Homepage;
import com.admin_section.Admin_Homepage;
import com.customer_section.Create_Account;

public class Homepage {
	
	
	static
	{
		Homepage.getSessionFactory();
		
	}
	
	public static String global_Name="Global";

	public static void homepage()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Choice:\n 1:Admin Section \n 2:Staff Section \n 3:Customer Section\n 4:Exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Admin_Homepage.admin_Section();
			break;
		case 2:
			Staff_Homepage.staff_Section();
			break;
		case 3:
			Cust_Homepage.cust_Section();
			break;
		case 4:
			Homepage.sf.close();
			
			System.exit(0);
			
			break;
		}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
		
	}
	
	public static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{
		
			StandardServiceRegistry registry=Hibernate_Util.getStandardServiceRegistry();
			
			MetadataSources ms=new MetadataSources(registry).addAnnotatedClass(Customer.class).addAnnotatedClass(Transaction.class).addAnnotatedClass(Staff.class).addAnnotatedClass(Admin.class);
			
			Metadata md = ms.getMetadataBuilder().build();
			
			 sf = md.getSessionFactoryBuilder().build();
			
			return sf;
		
		
	}

}
