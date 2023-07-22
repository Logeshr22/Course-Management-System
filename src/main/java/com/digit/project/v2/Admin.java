
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
    
    ArrayList<Integer> crs_id = new ArrayList<Integer>();
    ArrayList<String> crs_name = new ArrayList<String>();
    
    ArrayList<Integer> stud_id = new ArrayList<Integer>();
    ArrayList<String> stud_name = new ArrayList<String>();
    
    ArrayList<Integer> prof_id = new ArrayList<Integer>();
    ArrayList<String> prof_name = new ArrayList<String>();
    
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
    
    void createStudent(int member_cnt)
    {
     
        
        for(int i=0;i<member_cnt;i++)
        {
            stud_id.add(i);
            System.out.println("Enter Student Name:");
            stud_name.add(sc.next());
        }
        System.out.println("Student id and Name");
        System.out.println(stud_id);
        System.out.println(stud_name);
    }
    
    void createProffesor(int member_cnt)
    {
        
        for(int i=0;i<member_cnt;i++)
        {
            prof_id.add(i);
            System.out.println("Enter Professor Name:");
            prof_name.add(sc.next());
        }
        System.out.println("Professor id and Name");
        System.out.println(prof_id);
        System.out.println(prof_name);    
    }
    
    void CreateCourse()
    {
    	crs_id.add(0);
		crs_name.add("java");
		crs_id.add(1);
		crs_name.add("Sql");
		crs_id.add(2);
		crs_name.add("C++");
		crs_id.add(3);
		crs_name.add("Python");
		crs_id.add(4);
		crs_name.add("Devops");
    }
}

public class Admin {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        AdminComponent ad = new AdminComponent();
        ad.AdminLogin();
        //addition of professor and student 
        System.out.println("Enter the no. of Proffessor and Students to be inserted");
        int member_cnt = sc.nextInt();
        ad.createProffesor(member_cnt);
        ad.createStudent(member_cnt);
        
        System.out.println("prof and students inserted successfully");
        
        Professor pf = new Professor();
        pf.ProfessorDetails(ad.prof_id, ad.prof_name);
        
        Student st = new Student();
        st.StudentDetails(ad.stud_id, ad.stud_name);
        
        System.out.println("couse id and Name");
        ad.CreateCourse();
        System.out.println(ad.crs_id);
        System.out.println(ad.crs_name);
    }
    
}
