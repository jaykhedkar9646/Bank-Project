package com.staff_section;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.Homepage;
import com.admin_section.Admin_Homepage;
import com.customer_section.Cust_Homepage;
import com.customer_section.Cust_Operation;
import com.customer_section.Cust_Update;
import com.modal.Staff;
import com.most_common_methods_and_classes.Sign_up;
import com.most_common_methods_and_classes.Wait;

public class Staff_Update extends Sign_up {

	
	static String id;
	static Staff staff;
	
	public static void staff_Update()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Id:");
			id=sc.next();
			
			Session session= Homepage.sf.openSession();
			staff= session.get(Staff.class, id);
			if(staff.getS_Id().equals(id))
			{
				
				while(true)
				{
					System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/");
					int choice=0;
					System.out.println("Select what you want to update\n");
					System.out.println("1: Name               2: Address\n\n3: Birth Date         4: Mobile Number\n\n5: Pan Card Number    6: Aadhar Number\n\n7: password           8:Back");
					
							Scanner sc45=new Scanner(System.in);
							choice=sc45.nextInt();
							
						
					
						switch(choice)
						{
						case 1:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							Staff_Update.update_Name();
							
							 
							break;
						case 2:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							Staff_Update.update_Address();
							
							 
							break;
						case 3:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							
							Staff_Update.update_Birth_Date();
							
							 
							break;
						case 4:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							Staff_Update.update_Mo_No();
							
							 
							break;
						case 5:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							Staff_Update.update_Pan_No();
							
							 
							break;
						case 6:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							Staff_Update.update_Aadhar_No();
							
							break;
						
							 
							
						case 7:
							System.out.println("---------------//-----------------//-----------------//-----------------");
							Staff_Update.update_Pass();
							
							break;
						case 8:
							session.close();
							
							 if(Homepage.global_Name.equals("Staff"))
							{
								Staff_Homepage.staff_Homepage();
								break;
							}
							else if(Homepage.global_Name.equals("Admin"))
							{
								Admin_Homepage.admin_Homepage();
								break;
							}
							
							
							break;
						}
					}
				
				
				
				
				
			}
			else
			{
				System.out.println("Entered Id Not Found...");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	public static void update_Name()
	{
		try
		{
			Staff_Update.add_Name();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setS_name(name);
			session.beginTransaction().commit();
			Wait.wait_Time();
			
			System.out.println("Name Changed Successfully...");
			session.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void update_Address()
	{
		try
		{
			Staff_Update.add_Address();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setAddrs(address);
			session.beginTransaction().commit();
			Wait.wait_Time();
			System.out.println("Address Changed Successfully...");
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void update_Aadhar_No()
	{
		try
		{
			Staff_Update.add_Aadhar_No();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setAadhar_No(aadhar);
			session.beginTransaction().commit();
			Wait.wait_Time();
			System.out.println("Aadhar Number Changed Successfully...");
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void update_Pan_No()
	{
		try
		{
			Staff_Update.add_Pan_NO();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setPan_No(pan);
			session.beginTransaction().commit();
			Wait.wait_Time();
			System.out.println("Pan Number Changed Successfully...");
			session.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void update_Mo_No()
	{
		try
		{
			Staff_Update.add_Mo_NO();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setMo_No(mo_NO);
			session.beginTransaction().commit();
			Wait.wait_Time();
			System.out.println("Mobile Number Changed Successfully...");
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void update_Birth_Date()
	{
		try
		{
			Staff_Update.add_Birth_Date();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setBirth_Date(birth_Date);
			session.beginTransaction().commit();
			Wait.wait_Time();
			System.out.println("Birth Date Changed Successfully...");
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void update_Pass()
	{
		try
		{
			Staff_Update.add_Pass();
			Session session = Homepage.sf.openSession();
			Staff staff = session.get(Staff.class, id);
			staff.setPass(pass);
			session.beginTransaction().commit();
			Wait.wait_Time();
			System.out.println("Password Changed Successfully...");
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	
}
