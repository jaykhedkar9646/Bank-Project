package com.customer_section;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.Homepage;
import com.admin_section.Admin_Homepage;
import com.modal.Customer;
import com.most_common_methods_and_classes.Sign_up;
import com.most_common_methods_and_classes.Wait;
import com.staff_section.Staff_Homepage;

public class Cust_Update extends Sign_up {
	
	static String act_No;
	
	
	static Customer cust;
	public static void cust_Update()
	{
		try
		{
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Account Number:");
		act_No=sc.next();
		
		Session session = Homepage.sf.openSession();
		cust = session.get(Customer.class, act_No);
		if(cust.getAcc_No().equals(act_No))
		{
		
			while(true)
			{
				System.out.println("----/----/----/----/----/----/----/----/----/----/----/----/");
				int choice=0;
				System.out.println("Select what you want to update\n");
				System.out.println("1: Name               2: Address\n\n3: Birth Date         4: Mobile Number\n\n5: Pan Card Number     6: Aadhar Number\n\n7: Pin                8: password\n\n9:Back");
				
						Scanner sc45=new Scanner(System.in);
						choice=sc45.nextInt();
						
					
				
					switch(choice)
					{
					case 1:
						System.out.println("---------------//-----------------//-----------------//-----------------");

						Cust_Update.update_Name();
						 
						break;
					case 2:
						System.out.println("---------------//-----------------//-----------------//-----------------");

						Cust_Update.update_Address();
						 
						break;
					case 3:
						System.out.println("---------------//-----------------//-----------------//-----------------");
						
						Cust_Update.update_Birth_Date();
						
						 
						break;
					case 4:
						System.out.println("---------------//-----------------//-----------------//-----------------");

						Cust_Update.update_Mobile_No();
						 
						break;
					case 5:
						System.out.println("---------------//-----------------//-----------------//-----------------");

						Cust_Update.update_Pan_No();
						 
						break;
					case 6:
						System.out.println("---------------//-----------------//-----------------//-----------------");

						Cust_Update.update_Aadhar_No();
						 
						break;
					case 7:
						System.out.println("---------------//-----------------//-----------------//-----------------");
						if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
						{
							Cust_Update.update_Pin();
						}
						else
						{
							Cust_Operation.pin_Change();
						}
						 
						break;
					case 8:
						System.out.println("---------------//-----------------//-----------------//-----------------");
						
						Cust_Update.update_Pass(); 
						break;
					case 9:
						session.close();
						
						if(Homepage.global_Name.equals("Customer"))
						{
						Cust_Homepage.cust_Homepage();
						break;
						}
						else if(Homepage.global_Name.equals("Staff"))
						{
							Staff_Homepage.staff_Homepage();
							break;
						}
						else if(Homepage.global_Name.equals("Admin"))
						{
							Admin_Homepage.admin_Homepage();
							break;
						}
					}
				}
			
				
				}
		else
		{
			System.out.println("Account Number Not Found...");
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
		if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
		{
			System.out.println("Old Name: "+cust.getCust_Name().getFirst_Name()+" "+cust.getCust_Name().getMiddle_Name()+" "+cust.getCust_Name().getLast_Name());
			
		}
		Cust_Update.add_Name();
		
		Session session = Homepage.sf.openSession();
		Customer cust = session.get(Customer.class, act_No);
		cust.setCust_Name(name);
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
		if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
		{
			System.out.println("Old Address: "+cust.getAddrs().getVillage()+", "+cust.getAddrs().getTaluka()+", "+cust.getAddrs().getDistrict()+", "+cust.getAddrs().getPincode());
			
		}
		Cust_Update.add_Address();
		
		Session session = Homepage.sf.openSession();
		Customer cust = session.get(Customer.class, act_No);
		cust.setAddrs(address);
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
			if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
			{
				System.out.println("Old Aadhar Number: "+cust.getAadhar_No());
				
			}
			
			Cust_Update.add_Aadhar_No();
			
				Session session = Homepage.sf.openSession();
				Customer cust = session.get(Customer.class, act_No);
				cust.setAadhar_No(aadhar);
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
			
			if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
			{
				System.out.println("Old Pan Number: "+cust.getPan_No());
				
			}
			Cust_Update.add_Pan_NO();
			
				Session session = Homepage.sf.openSession();
				Customer cust = session.get(Customer.class, act_No);
				cust.setPan_No(pan);
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
	public static void update_Mobile_No()
	{
		try
		{
			
			if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
			{
				System.out.println("Old Mobile Number: "+cust.getMo_NO());
				
			}
			
			Cust_Update.add_Mo_NO();
				Session session = Homepage.sf.openSession();
				Customer cust = session.get(Customer.class, act_No);
				cust.setMo_NO(mo_NO);
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
			if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
			{
				System.out.println("Old Birth Date: "+cust.getBirth_Date());
				
			}
			Session session = Homepage.sf.openSession();
			Customer cust = session.get(Customer.class, act_No);
			Cust_Update.add_Birth_Date();
			
			cust.setBirth_Date(birth_Date);
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
	public static void update_Pin()
	{
		try
		{
			System.out.println("Old Pin: "+cust.getPin());
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter New Pin");
			String pin=sc.next();
			
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
				Session session = Homepage.sf.openSession();
				Customer cust = session.get(Customer.class, act_No);
				cust.setPin(pin);
				session.beginTransaction().commit();
				Wait.wait_Time();
				System.out.println("Pin Changed Successfully...");
				session.close();
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
	public static void update_Pass()
	{
		try
		{
			if(Homepage.global_Name.equals("Staff") || Homepage.global_Name.equals("Admin"))
			{
				System.out.println("Old Password: "+cust.getPass());
				
			}
			Cust_Update.add_Pass();
			Session session = Homepage.sf.openSession();
			Customer cust = session.get(Customer.class, act_No);
			cust.setPass(pass);
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
