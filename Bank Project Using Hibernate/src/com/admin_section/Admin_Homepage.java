package com.admin_section;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.admin.Homepage;
import com.customer_section.Create_Account;
import com.customer_section.Cust_Operation;
import com.customer_section.Cust_Update;
import com.modal.Admin;
import com.modal.Staff;
import com.most_common_methods_and_classes.Hibernate_Util;
import com.staff_section.Staff_Homepage;
import com.staff_section.Staff_Operation;
import com.staff_section.Staff_Signup;
import com.staff_section.Staff_Update;

public class Admin_Homepage {

static String admin_Name;
	
	
	public static void admin_Section()
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
			Admin_Operation.login();
			
			break;
		case 2:
			System.out.println("---------------//-----------------//-----------------//-----------------");
			System.out.println("                                                             [Logged Out]");
			Scanner sc21=new Scanner(System.in);
			String security_Code="Admin@9646";
			System.out.println("Enter Security Code:");
			String s_Code=sc21.next();
			if(security_Code.equals(s_Code))
			{
			Admin_Signup.admin_Sign_Up();
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
	
	public static void admin_Homepage()
	{
	int choice=0;
	while(true)
	{
		try
		{
	System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/");		
	System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("1: Show Self Details              2: Add Staff\n\n3: Single staff Details           4: Total Staff Details\n\n5: Delete Staff                   6: Create Customer Account\n\n7: Show Balance                   8: Withdraw\n\n9: Cash Deposite                 10: Account Deposite\n\n11: Single Customer Details      12: Total Customer Information\n\n13: Update Customer Information  14: Update Staff Details \n\n15: Delete Customer Account      16: Delete Self Account\n\n17: Customer Statement           18: Search Record\n\n19: Logout");
	
	choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Admin_Operation.self_Details();
			break;
		case 2:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Signup.staff_Sign_up();
			
			break;
		case 3:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Admin_Operation.single_Staff_Details();
			
			break;
		case 4:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Admin_Operation.all_Staff_Details();
			
			break;
		case 5:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Admin_Operation.delete_Staff();
			
			break;
		case 6:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Create_Account.cust_Sign_up();
		case 7:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");	 
			Staff_Operation.show_Cust_Amount();
			
			break;
		case 8:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.withdrawl();
			 
			break;
		case 9:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Cust_Operation.cash_Deposite();
			 
			break;
		case 10:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.account_Deposite();
			break;
		case 11:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.single_Customer_Details();
			break;
		case 12:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.all_Customer_Details();
			
			 
			break;
		case 13:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Cust_Update.cust_Update();
			 
			break;
		case 14:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Update.staff_Update();
			break;
		case 15:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.delete_Customer();
			 
			break;
		case 16:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Admin_Operation.delete_Self_Account();
			break;
		case 17:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.all_Record();
			break;
		case 18:
			System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/\n");		
			System.out.println("Wel-Come "+Admin_Homepage.admin_Name+" in Admin Section          [Logged In]");
			Staff_Operation.search_Record();
			break;
		case 19:
			 Admin_Homepage.admin_Section();
			
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
