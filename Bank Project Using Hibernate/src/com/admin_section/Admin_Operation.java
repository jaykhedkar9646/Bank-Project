package com.admin_section;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.Homepage;
import com.modal.Admin;
import com.modal.Staff;
import com.most_common_methods_and_classes.Wait;
import com.staff_section.Staff_Homepage;

public class Admin_Operation {

	
	
	static String id;
	
	public static void login() 
	 {
		 try
		 {
			 Scanner sc=new  Scanner(System.in);
				System.out.println("Enter Your Id:");
				id=sc.next();
				
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter Your Password:");
				String pass=sc1.next();
				
				Session session = Homepage.sf.openSession();
				Admin admin = session.get(Admin.class, id);
				if(admin.getA_Id().equals(id) && admin.getPass().equals(pass))
				{
					Wait.wait_Time();
					
					System.out.println("Login Successflly...");
					
					
					Admin_Homepage.admin_Name=admin.getA_name().getFirst_Name();
					Homepage.global_Name="Admin";
					session.close();
					Admin_Homepage.admin_Homepage();
				}
				else
				{
					System.out.println("Invalid Credentials...");
				}
				
				
				
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error: "+e.getMessage());
		 }
	 }
	public static void self_Details() 
	 {
		try
		 {
			Wait.wait_Time();
			Session session = Homepage.sf.openSession();
			Admin admin = session.get(Admin.class, id);
			System.out.println("Your Details:-\n");
			System.out.println("Name          :"+admin.getA_name().getFirst_Name()+" "+admin.getA_name().getMiddle_Name()+" "+admin.getA_name().getLast_Name());
			System.out.println("Address       :"+admin.getAddrs().getVillage()+", "+admin.getAddrs().getTaluka()+", "+admin.getAddrs().getDistrict()+", "+admin.getAddrs().getPincode());
			System.out.println("Aadhar Number :"+admin.getAadhar_No());
			System.out.println("Pan Number    :"+admin.getPan_No());
			System.out.println("Mobile Number :+91 "+admin.getMo_No());
			System.out.println("Birth Date    :"+admin.getBirth_Date());
			System.out.println("Id            :"+admin.getA_Id());
			System.out.println("Password      :"+admin.getPass());
			System.out.println("Act Crte Date :"+admin.getDate());
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error: "+e.getMessage());
		 }
	 }
	public static void single_Staff_Details() 
	 {
		try
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter Staff Id:");
			 String s_Id=sc.next();
			 Session session = Homepage.sf.openSession();
			 Staff staff = session.get(Staff.class, s_Id);
			 if(staff.getS_Id().equals(s_Id))
			 {
				 Wait.wait_Time();
				 	System.out.println("Staff Details :-\n");
				 	System.out.println("Name          :"+staff.getS_name().getFirst_Name()+" "+staff.getS_name().getMiddle_Name()+" "+staff.getS_name().getLast_Name());
					System.out.println("Address       :"+staff.getAddrs().getVillage()+", "+staff.getAddrs().getTaluka()+", "+staff.getAddrs().getDistrict()+", "+staff.getAddrs().getPincode());
					System.out.println("Aadhar Number :"+staff.getAadhar_No());
					System.out.println("Pan Number    :"+staff.getPan_No());
					System.out.println("Mobile Number :+91 "+staff.getMo_No());
					System.out.println("Birth Date    :"+staff.getBirth_Date());
					System.out.println("Id            :"+staff.getS_Id());
					System.out.println("Password      :"+staff.getPass());
					System.out.println("Act Crte Date :"+staff.getDate());
					session.close();
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
	public static void all_Staff_Details() 
	 {
		try
		 {
			 System.out.println("All Staff Details:-\n");
			 Session session = Homepage.sf.openSession();
			 List<Staff> staff1 = session.createQuery("from Staff").list();
			 if(staff1.isEmpty())
			 {
				 System.out.println("No record found...");
			 }
			 else
			 {
			 Wait.wait_Time();
			 for(Staff staff:staff1)
			 {
				 	System.out.println("Name          :"+staff.getS_name().getFirst_Name()+" "+staff.getS_name().getMiddle_Name()+" "+staff.getS_name().getLast_Name());
					System.out.println("Address       :"+staff.getAddrs().getVillage()+", "+staff.getAddrs().getTaluka()+", "+staff.getAddrs().getDistrict()+", "+staff.getAddrs().getPincode());
					System.out.println("Aadhar Number :"+staff.getAadhar_No());
					System.out.println("Pan Number    :"+staff.getPan_No());
					System.out.println("Mobile Number :+91 "+staff.getMo_No());
					System.out.println("Birth Date    :"+staff.getBirth_Date());
					System.out.println("Id            :"+staff.getS_Id());
					System.out.println("Password      :"+staff.getPass());
					System.out.println("Act Crte Date :"+staff.getDate());
					System.out.println("*****************************************************");
					
					session.close();
			 }
			 
			 } 
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error: "+e.getMessage());
		 }
	 }
	public static void delete_Staff() 
	 {
		try
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter Staff Id:");
			 String s_id=sc.next();
			 Session session = Homepage.sf.openSession();
			 Staff staff = session.get(Staff.class, s_id);
			 if(staff.getS_Id().equals(s_id))
			 {
				 session.delete(staff);
				 session.beginTransaction().commit();
				 Wait.wait_Time();
				 System.out.println("Staff Account Deleted Successfully...");
				 
				 session.close();
				 
				 
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
	public static void delete_Self_Account()
	{
		try
		{
			System.out.println("To Confirm Enter Your Id:");
			Scanner sc=new Scanner(System.in);
			String id=sc.next();
			
			Session session = Homepage.sf.openSession();
			Admin admin = session.get(Admin.class, id);
			if(admin.getA_Id().equals(id))
			{
				session.delete(admin);
				session.beginTransaction().commit();
				Wait.wait_Time();
				System.out.println("Your Account Deleted Successfully...");
				Admin_Homepage.admin_Section();
				session.close();
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
	
}
