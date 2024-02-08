package com.staff_section;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.admin.Homepage;
import com.customer_section.Create_Account;
import com.customer_section.Cust_Operation;
import com.customer_section.Cust_Update;
import com.modal.Staff;
import com.most_common_methods_and_classes.Hibernate_Util;

public class Staff_Homepage {

	static String staff_Name;
	
	
	
	
	
	public static void staff_Section()
	{
		while(true)
		{
			try {
				System.out.println("---------------//-----------------//-----------------//-----------------");
		System.out.println("                                                             [Logged Out]");
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Your Choice: \n 1:Login\n 2:Create Account\n 3:Back");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("                                                             [Logged Out]");
			Staff_Operation.login();
			
			break;
		case 2:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("                                                             [Logged Out]");
			Scanner sc21=new Scanner(System.in);
			String security_Code="Staff@9646";
			System.out.println("Enter Security Code:");
			String s_Code=sc21.next();
			if(security_Code.equals(s_Code))
			{
			Staff_Signup.staff_Sign_up();
			break;
			}
			else
			{
				System.out.println("Invalid Code...");
			}
		case 3:
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
	
	public static void staff_Homepage()
	{
		int choice=0;
		while(true)
		{
			try
			{
		System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/");		
		System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Show Self Details             2: Create Customer Account\n\n3: Show Balance                  4: Withdraw\n\n5: Cash Deposite                 6: Account Deposite\n\n7: Single Customer Details       8: Total Customer Information\n\n9: Update Customer Information  10: Update Self Details \n\n11: Delete Customer Account     12: Customer Statement\n\n13: Search Statement            14: Logout");
		
		choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.show_Self_Details();
				break;
			case 2:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Create_Account.cust_Sign_up();
			case 3:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");	 
				Staff_Operation.show_Cust_Amount();
				
				break;
			case 4:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.withdrawl();
				 
				break;
			case 5:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Cust_Operation.cash_Deposite();
				 
				break;
			case 6:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.account_Deposite();
				break;
			case 7:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.single_Customer_Details();
				break;
			case 8:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.all_Customer_Details();
				
				 
				break;
			case 9:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Cust_Update.cust_Update();
				 
				break;
			case 10:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Update.staff_Update();
				break;
			case 11:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.delete_Customer();
				 
				break;
			case 12:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.all_Record();
				break;
			case 13:
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
				System.out.println("Wel-Come "+Staff_Homepage.staff_Name+" in Staff Section          [Logged In]");
				Staff_Operation.search_Record();
				break;
			case 14:
				 Staff_Homepage.staff_Section();
				
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
