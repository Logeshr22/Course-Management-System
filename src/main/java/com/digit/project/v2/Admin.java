package com.digit.project.v2;
import java.util.ArrayList;

import java.util.*;


class AdminComponent{
    Scanner sc = new Scanner(System.in);
    String userNameO;
    String admnPasswordO;
    boolean Login =false;
    String userNameI;
    String admnPasswordI;
    static int memberCount;
    static int courseCount;
    Course crs = new Course();

   
    static ArrayList<String> stud_name = new ArrayList<String>();
    static ArrayList<String> prof_name = new ArrayList<String>();
    

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
    	System.out.println("==== WELCOME ADMIN ====");
        System.out.println("Enter Username:");
        userNameI = sc.next();
        System.out.println("Enter Password:");
        admnPasswordI = sc.next();
        LoginChk(userNameI, admnPasswordI);
        if(LoginChk(userNameI,admnPasswordI)==true)
        {
            System.out.println("Login successful");
            return true;
        }
        else
        {
            System.out.println("Login Failed");
            return false;
        }
    }
   

    void createStudent(int member_cnt)
    {  
    	Student st = new Student();
    	System.out.println("=== Student Details ===");
        for(int i=0;i<member_cnt;i++)
        {
            System.out.println("Enter name of Student "+(i+1)+" :");
            stud_name.add(sc.next());
            System.out.println("Select the course for the Student ID #"+(i+1)+" : ");
            System.out.println("Select the courses Listed below : ");
            System.out.println(crs.crs_name);
            st.selectedCourse.add(sc.next());
            
        }
    }
   
    void createProfessor(int member_cnt)
    {
    	System.out.println("=== Professor Details ===");
    	
        for(int i=0;i<member_cnt;i++)
        {
        	System.out.println("Enter name of Professor "+(i+1)+" : ");
            Professor.ProfessorName.add(sc.next());
            Professor.ProfessorID.add(i+1);
            System.out.println("Specify the course for Professor ID #"+(i+1)+" : ");
            System.out.println("Select the courses Listed below : ");
            System.out.println(crs.crs_name);
            Professor.courseIn.add(sc.next());
        }
        
    }
    
    void createCourse(int crs_cnt) 
    {
    	for(int i = 0;i<crs_cnt;i++) {
    		System.out.println("Enter name of the course "+(i+1)+" : ");
    		crs.crs_name.add(sc.next());
    	}
    }
    

}

public class Admin {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        AdminComponent ad = new AdminComponent();
        Professor prof = new Professor();
        if(ad.AdminLogin()==true) {
        	
            System.out.println("Enter the number of Professor and Students to be inserted : ");
            AdminComponent.memberCount = sc.nextInt();
            System.out.println("Enter the number of courses to add : ");
            AdminComponent.courseCount = sc.nextInt();
            
            ad.createCourse(AdminComponent.courseCount);
            ad.createProfessor(AdminComponent.memberCount);

           
            prof.profDetails();
            System.out.println("Professor details inserted successfully.");


        }
        else {
        	System.out.println("Try Again.");
        }
        sc.close();
    }
   
}

