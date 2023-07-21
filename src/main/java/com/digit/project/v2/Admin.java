package com.digit.project.v2;

import java.util.ArrayList;
import java.util.Scanner;

class AdminComponent{
	Scanner sc = new Scanner(System.in);
	String userNameO;
	String admnPasswordO;
	boolean Login =false;
	
	
	String userNameI;
	String admnPasswordI;
	
	AdminComponent()
	{
		userNameO="Admin";
		admnPasswordO="Admin";
	}
	void LoginChk(String userNameI, String admnPasswordI)
	{
		if(userNameO.equals(userNameI))
		{
			if(admnPasswordI.equals(admnPasswordO))
			{
				Login=true;
			}
		}
	}
	
	void AdminLogin()
	{
		System.out.println("Enter Username:");
		userNameI = sc.next();
		System.out.println("Enter Password:");
		admnPasswordI = sc.next();
		LoginChk(userNameI, admnPasswordI);
		if(Login==true)
		{
			System.out.println("Login successful");
		}
		if(Login==false)
		{
			System.out.println("Login Failed");
		}
	}
	

	void createStudent()
	{
		String TmpName;
		ArrayList<Integer> stud_id = new ArrayList<Integer>();
		ArrayList<String> stud_name = new ArrayList<String>();
		System.out.println("Enter the no. of students to be inserted");
		int stud_num = sc.nextInt();
		System.out.println();
		for(int i=0;i<stud_num;i++)
		{
			stud_id.add(i);
			System.out.println("Enter Student Name:");
			TmpName=sc.next();
			stud_name.add(TmpName);
		}
		System.out.println(stud_id);
		System.out.println(stud_name);
		
	}
	void createProffesor()
	{
		String TmpName;
		ArrayList<Integer> prof_id = new ArrayList<Integer>();
		ArrayList<String> prof_name = new ArrayList<String>();
		System.out.println("Enter the no. of students to be inserted");
		int stud_num = sc.nextInt();
		System.out.println();
		for(int i=0;i<stud_num;i++)
		{
			prof_id.add(i);
			System.out.println("Enter Student Name:");
			TmpName=sc.next();
			prof_name.add(TmpName);
		}
		System.out.println(prof_id);
		System.out.println(prof_name);
		
	}
}


public class Admin {
	public static void main(String[] args) {
		AdminComponent ad = new AdminComponent();
//		ad.AdminLogin();
		ad.createStudent();
		ad.createProffesor();
	}
}