package com.digit.project.v2;

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
	
	void AdminLogin()
	{
		System.out.println("Enter Username:");
		userNameI = sc.next();
		System.out.println("Enter Password:");
		admnPasswordI = sc.next();
		
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
}


public class Admin {
	public static void main(String[] args) {
		
	}
}