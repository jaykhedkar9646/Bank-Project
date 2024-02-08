package com.staff_section;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.Homepage;
import com.customer_section.Create_Account;
import com.modal.Staff;
import com.most_common_methods_and_classes.Sign_up;
import com.most_common_methods_and_classes.Wait;

public class Staff_Signup extends Sign_up {

	static Staff staff_Info=new Staff();
	protected static String id;
	
	
	
	public static void staff_Sign_up()
	{
		
		int temp=1;
		switch(temp)
		{
		
		case 1:
			Staff_Signup.add_Name();
		case 2:
			Staff_Signup.add_Address();
		case 3:
			Staff_Signup.add_Aadhar_No();
		case 4:
			Staff_Signup.add_Pan_NO();
		case 5:
			Staff_Signup.add_Mo_NO();
		case 6:
			Staff_Signup.add_Birth_Date();
		case 7:
			Staff_Signup.add_Staff_Id();
		case 8:
			Staff_Signup.add_Pass();
		case 9:
			Staff_Signup.add_Date();
		case 10:
			Staff_Signup.execute();
			break;
		}
	}
	
	public static void add_Staff_Id()
	{
		while(true)
		{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Id:");
			id=sc.next();
			Session session = Homepage.sf.openSession();
			Staff staff_Id = session.get(Staff.class, id);
			if(staff_Id!=null)
			{
				System.out.println("Entered Id Already Exists...Choose Another One");
			}
			else
			{
				if(id.length()>=6)
				{
					char c;
					int count1211=0;
					for(int i=0;i<id.length();i++)
					{
						c=id.charAt(i);
						if((c>=48 && c<=57))  
						{
							count1211++;
						}
						
					}
					if((count1211)==id.length())
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
		
		staff_Info.setS_Id(id);
		staff_Info.setS_name(name);
		staff_Info.setAddrs(address);
		staff_Info.setAadhar_No(aadhar);
		staff_Info.setPan_No(pan);
		staff_Info.setMo_No(mo_NO);
		staff_Info.setBirth_Date(birth_Date);
		staff_Info.setPass(pass);
		staff_Info.setDate(date);
		
		session.save(staff_Info);
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
