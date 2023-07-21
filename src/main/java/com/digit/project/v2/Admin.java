package com.digit.project.v2;

import java.util.Scanner;

public class Admin {
	Scanner sc = new Scanner(System.in);
	String userNameO;
	String admnPasswordO;
	
	
	String userNameI;
	String admnPasswordI;
	
	public Admin()
	{
		String userNameO="Admin";
		String admnPasswordO="Admin";
	}
	
	void AdminLogin()
	{
		System.out.println("Enter Username:");
		userNameI = sc.next();
		System.out.println("Enter Password:");
		admnPasswordI = sc.next();
	}
	void RegisterCourse()
	{
		System.out.println("Enter The no. of Courses you need to Register");
	}
}