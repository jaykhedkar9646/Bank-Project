package com.customer_section;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.admin.Homepage;
import com.modal.Customer;
import com.modal.Transaction;
import com.most_common_methods_and_classes.Hibernate_Util;
import com.staff_section.Staff_Operation;

public class Cust_Homepage {
	static String name;
	
	
	
	
	public static void cust_Section()
	{
		while(true)
		{
			try {
				System.out.println("---------------//-----------------//-----------------//-----------------");
		System.out.println("                                                             [Logged Out]");
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Your Choice: \n 1:Login\n 2:Create Account\n 3:Cash Deposite\n 4:Back");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("                                                             [Logged Out]");

			Cust_Operation.cust_Login();
			break;
		case 2:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("                                                             [Logged Out]");

			Create_Account.cust_Sign_up();
			break;
			
		case 3:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("                                                             [Logged Out]");
			Cust_Operation.cash_Deposite();
			break;
		case 4:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			Homepage.homepage();
			
			break;
		
		}
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		
		}
		
	}
	
	public static void cust_Homepage()
	{
		while(true)
		{
			try {
				System.out.println("---------------//-----------------//-----------------//-----------------");
		System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
				Scanner sc=new Scanner(System.in);
		System.out.println("Select Your Choice:\n\n1: Show Acct Details       2: Withdrawl               \n\n3: Deposite                4:Balance Enquiry\n\n5: Cash Deposite           6:Update Information\n\n7: View Statement          8:Logout");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Operation.show_Cust_Details();
			break;
		case 2:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Operation.withdrwal();
			break;
		case 3:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Operation.deposite();
			break;
		case 4:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Operation.balance_Enquiry();
			break;
		
		case 5:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Operation.cash_Deposite();
			break;
		case 6:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Update.cust_Update();
		case 7:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("Welcome "+Cust_Homepage.name+"                           [Logged In]");
			Cust_Operation.all_Record();
			break;
		case 8:
			Cust_Homepage.cust_Section();
			
			break;
		
		}
			}
			catch(Exception e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		
		}
	
	}
	
	
}
