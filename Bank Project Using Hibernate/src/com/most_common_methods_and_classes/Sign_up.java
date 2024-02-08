package com.most_common_methods_and_classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.modal.Address;
import com.modal.Name;

public class Sign_up {
	
	public static String aadhar,pan,birth_Date,mo_NO,pass,date,time;

	public static Name name=new Name();
	public static Address address=new Address();
	
	public static void add_Name()
	{
		while(true)
		{
		try
		{
		String first_Name,middle_Name ,last_Name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:-\nFirst Name:");
		name.setFirst_Name(first_Name=sc.nextLine());
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Middle Name:");
		name.setMiddle_Name(middle_Name=sc1.nextLine());
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Last Name:");
		name.setLast_Name(last_Name=sc2.nextLine());
		
		System.out.println("Name: "+first_Name+" "+middle_Name+" "+last_Name);
		
		break;
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Address()
	{
		while(true)
		{
		try
		{
			String village,taluka,district,pincode;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Address:-\nVillage:");
		address.setVillage(village=sc.nextLine());
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Taluka:");
		address.setTaluka(taluka=sc1.nextLine());
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("District:");
		address.setDistrict(district=sc2.nextLine());
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Pincode:");
		pincode=sc3.nextLine();
		
		if(pincode.length()>5 && pincode.length()<7)
		{
		char c;
		int count1211=0;
		for(int i=0;i<pincode.length();i++)
		{
			c=pincode.charAt(i);
			if((c>=48 && c<=57))  
			{
				count1211++;
			}
			
		}
		if((count1211)==pincode.length())
		{
			address.setPincode(pincode);
			break;
		}
		else
		{
			System.out.println("In Mobile No. only  Digits(0-9) are Allow...");
		}
	}
		else
		{
			System.out.println("Mobile No. Length must be 10 ...");
		}
		
		
		break;
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Aadhar_No()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Aadhar Number: (XXXX-XXXX-XXXX)");
		aadhar=sc.nextLine();
		
		
		
			if(aadhar.length()>11 && aadhar.length()<15)
			{
			char ch;
			int count131=0;
			for(int i=0;i<aadhar.length();i++)
			{
				ch=aadhar.charAt(i);
				if((ch>=48 && ch<=57) || (ch>44 && ch<46))
				{
					count131++;
				}
			}
			if(aadhar.length()==count131)
			{
				
				
				break;
			}
			else
			{
				System.out.println("In Aadhar No. only Digits (0-9) and '-' symbol are Allow...");
			}
			}
			else
			{
				System.out.println("Aadhar No. length must be 12...");
			}
		
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Pan_NO()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pan Number:");
		pan=sc.next();
		
		
			if(pan.length()>9 && pan.length()<11)
			{
			char c;
			int count121=0,count122=0;
			for(int i=0;i<pan.length();i++)
			{
				c=pan.charAt(i);
				if((c>=65 && c<=90))  
				{
					count121++;
				}
				else if((c>=48 && c<=57))
				{
					count122++;
				}
			}
			if((count121+count122)==pan.length() && (count121!=0 && count122!=0))
			{
				
				
				break;
			}
			else
			{
				System.out.println("In Pan No. only Capiatal letter(A-Z) and Digits(0-9) are Allow...");
			}
		}
			else
			{
				System.out.println("Pan No. Length must be 10...");
			}
		

		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Birth_Date()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Birth Date: (DD/MM/YYYY)");
		birth_Date=sc.nextLine();
		
		if(birth_Date.length()>9 && birth_Date.length()<11)
		{
		char sch;
		int count221=0;
		for(int i=0;i<birth_Date.length();i++)
		{
			sch=birth_Date.charAt(i);
			if((sch>=48 && sch<=57) || (sch>44 && sch<46) || (sch>46 && sch<48))
			{
				count221++;
			}
		}
		if(count221==birth_Date.length())
		{
			
			break;
		}
		else
		{
			System.out.println("In Birth Date  only Digits(0-9), '/' and '-' symbols are Allow...");
		}
		}
		else
		{
			System.out.println("Birth Date must in (DD/MM/YYYY) or (DD-MM-YYYY) Format...");
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void add_Mo_NO()
	{
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Mobile Number:");
		mo_NO=sc.next();
		
		
		if(mo_NO.length()>9 && mo_NO.length()<11)
		{
		char c;
		int count1211=0;
		for(int i=0;i<mo_NO.length();i++)
		{
			c=mo_NO.charAt(i);
			if((c>=48 && c<=57))  
			{
				count1211++;
			}
			
		}
		if((count1211)==mo_NO.length())
		{
			
			break;
		}
		else
		{
			System.out.println("In Mobile No. only  Digits(0-9) are Allow...");
		}
	}
		else
		{
			System.out.println("Mobile No. Length must be 10 ...");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	
	public static void add_Pass()
	{
		try
		{
			while(true)
			{
			System.out.println("Enter Your Password:");
			
				Scanner sc17=new Scanner(System.in);
				
				pass=sc17.next();
				if(pass.length()>=8)
				{
					char c;
					int count12=0,count13=0,count14=0;
					for(int i=0;i<pass.length();i++)
					{
						c=pass.charAt(i);
						if(c>=48 && c<=57) 
						{
							count12++;
						}
						else if(c>=65 && c<=90)
						{
							count13++;
							
						}
						else if((c>=37 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 && c<=126))
						{
							count14++;
						}
							
					}
					if(count12 !=0 && count13 !=0 && count14 !=0)
					{
						
						break;
					}
					else
					{
						System.out.println("Password contain atleast \n One Capital Letter\n One Digit\n One Special Symbol");
					}
					
				 	
				}
				else
				{
					System.out.println("Password must be 8 characters...\nRe-enter Password");
				}
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void add_Date()
	{
		try
		{
		Date date1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		date = sdf.format(date1);
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void add_Time()
	{
		try
		{
		Date date1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
		time = sdf.format(date1);
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
