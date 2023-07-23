package com.digit.project.v2;

import java.util.*;

class AdminComponent{
    Scanner sc = new Scanner(System.in);
    String userNameO;
    String admnPasswordO;
    boolean Login =false;
    String userNameI;
    String admnPasswordI;
    static int memberCount = 4;
    static int courseCount = 4;
//    Course crs = new Course();
    
    AdminComponent()

    {
        userNameO="Admin";
        admnPasswordO="Admin";
    }

    boolean LoginChk(String userNameI, String admnPasswordI)
    {
        if(userNameO.equals(userNameI) && admnPasswordI.equals(admnPasswordO))
        	return true;
        else
        	return false;
    }

    boolean AdminLogin()
    {
    	System.out.println("======= COURSE MANAGEMENT SYSTEM =======");
    	System.out.println();
    	System.out.println("========== ADMINISTRATOR ==========");
    	System.out.println();
        System.out.println("Enter Username:");
        userNameI = sc.next();
        System.out.println("Enter Password:");
        admnPasswordI = sc.next();
        LoginChk(userNameI, admnPasswordI);
        if(LoginChk(userNameI,admnPasswordI)==true)
        {
            System.out.println("Login successful.");
            return true;
        }
        else
        {
            System.out.println("Login Failed.");
            return false;
        }
    }
   

    void createStudent(int member_cnt)
    {  
    	Professor pf = new Professor();
    	System.out.println();
    	System.out.println("=== Student Details ===");
    	System.out.println();
        for(int i=0;i<member_cnt;i++)
        {
        	String course;
            System.out.println("Enter name of Student "+(i+1)+" :");
            Student.studentName.add(sc.next());
            System.out.println("Select the course for the Student ID #"+(i+1)+" : ");
            System.out.println(Course.crs_name);
            course = sc.next();
            Student.selectedCourse.add(course);
            pf.assignCourse(course);
            Student.studentID.add(i+1);
        }
    }
   
    void createProfessor(int member_cnt)
    {
    	System.out.println();
    	System.out.println("=== Professor Details ===");
    	System.out.println();
        for(int i=0;i<member_cnt;i++)
        {
        	System.out.println("Enter name of Professor "+(i+1)+" : ");
        	Professor.ProfessorName.add(sc.next());
            System.out.println("Specify the course for Professor ID #"+(i+1)+" : ");
            System.out.println(Course.crs_name);
            Professor.courseIn.add(sc.next());
            Professor.ProfessorID.add(i+1);
        }
    }
    
    void createCourse(int crs_cnt) 
    {
    	for(int i = 0;i<crs_cnt;i++) {
    		System.out.println("Enter name of the course "+(i+1)+" : ");
    		Course.crs_name.add(sc.next());
    	}
    }
    
}

public class Admin {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        AdminComponent ad = new AdminComponent();
        Professor prof = new Professor();
        Student stud = new Student();
        if(ad.AdminLogin()==true) {
        	System.out.println();
            System.out.println("Enter the number of Professor and Students to be inserted : ");
            AdminComponent.memberCount = sc.nextInt();
            System.out.println("Enter the number of courses to add : ");
            AdminComponent.courseCount = sc.nextInt();
            
            ad.createCourse(AdminComponent.courseCount);
            System.out.println("Courses added successfully.");
            ad.createProfessor(AdminComponent.memberCount);
            prof.profDetails();
            System.out.println();
            System.out.println("Professor details inserted successfully.");
            prof.mapValues();
            System.out.println("HashMap : "+Professor.map);
            ad.createStudent(AdminComponent.memberCount);
            stud.studentDetails();
            System.out.println();
            System.out.println("Student details inserted successfully.");
            prof.grading();
        }
        else {
        	System.out.println("Try Again.");
        }
        sc.close();
    }
   
}

