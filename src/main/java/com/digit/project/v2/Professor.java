package com.digit.project.v2;
import java.util.*;
public class Professor {
	public static void main(String[] args) {
		
		Admin admin = new Admin();
		Scanner sc = new Scanner(System.in);
		String usernameO = "Professor";
		String passwordO = "professor";
		System.out.println("Enter the Username : ");
		String username = sc.nextLine();
		System.out.println("Enter the Password : ");
		String password = sc.nextLine();
		if(username.equals(usernameO) && password.equals(passwordO)) {
			System.out.println("Login Successful");
			System.out.println();
			System.out.println("1. Grade Students");
			System.out.println("2. View Student Details");
			int input = sc.nextInt();
			switch(input) {
			case 1 :
				
			}
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
	
	public void StudentDetails(ArrayList<Integer> id, ArrayList<String> name) {
		System.out.println(id);
		System.out.println(name);
	}
}


