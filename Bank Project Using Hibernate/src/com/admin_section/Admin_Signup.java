package com.admin_section;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.Homepage;
import com.modal.Admin;
import com.modal.Staff;
import com.most_common_methods_and_classes.Sign_up;
import com.most_common_methods_and_classes.Wait;
import com.staff_section.Staff_Signup;

public class Admin_Signup extends Sign_up {

	
	
	static Admin admin_Info=new Admin();
	static String a_Id;
	public static void admin_Sign_Up()
	{
		int temp=1;
		switch(temp)
		{
		
		case 1:
			Admin_Signup.add_Name();
		case 2:
			Admin_Signup.add_Address();
		case 3:
			Admin_Signup.add_Aadhar_No();
		case 4:
			Admin_Signup.add_Pan_NO();
		case 5:
			Admin_Signup.add_Mo_NO();
		case 6:
			Admin_Signup.add_Birth_Date();
		case 7:
			Admin_Signup.add_Id();
		case 8:
			Admin_Signup.add_Pass();
		case 9:
			Admin_Signup.add_Date();
		case 10:
			Admin_Signup.execute();
			break;
		}
	}
	public static void add_Id()
	{
		while(true)
		{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Id:");
			a_Id=sc.next();
			Session session = Homepage.sf.openSession();
			Admin admin_Id = session.get(Admin.class, a_Id);
			if(admin_Id!=null)
			{
				System.out.println("Entered Id Already Exists...Choose Another One");
			}
			else
			{
				if(a_Id.length()>=6)
				{
					char c;
					int count1211=0;
					for(int i=0;i<a_Id.length();i++)
					{
						c=a_Id.charAt(i);
						if((c>=48 && c<=57))  
						{
							count1211++;
						}
						
					}
					if((count1211)==a_Id.length())
					{
						
						break;
					}
					else
					{
						System.out.println("In Id No. only  Digits(0-9) are Allow...");
					}
					
				}
				else
				{
					System.out.println("Username/Id must be 6 characters...");
				}
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
			admin_Info.setA_name(name);
			admin_Info.setAddrs(address);
			admin_Info.setAadhar_No(aadhar);
			admin_Info.setPan_No(pan);
			admin_Info.setMo_No(mo_NO);
			admin_Info.setBirth_Date(birth_Date);
			admin_Info.setA_Id(a_Id);
			admin_Info.setPass(pass);
			admin_Info.setDate(date);
			
			session.save(admin_Info);
			session.beginTransaction().commit();
			
			Wait.wait_Time();
			System.out.println("Hello "+name.getFirst_Name()+" your account has been created successfully...");
			
			session.close();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
