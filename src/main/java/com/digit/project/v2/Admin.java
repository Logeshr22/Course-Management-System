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
   
    ArrayList<Integer> stud_id = new ArrayList<Integer>();
    ArrayList<String> stud_name = new ArrayList<String>();
   
    ArrayList<Integer> prof_id = new ArrayList<Integer>();
    ArrayList<String> prof_name = new ArrayList<String>();
    
    ArrayList<Integer> crs_id = new ArrayList<Integer>();
    ArrayList<String> crs_name = new ArrayList<String>();

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
     
       
        for(int i=0;i<member_cnt;i++)
        {
            System.out.println("Enter name of Student "+(i+1)+" :");
            stud_name.add(sc.next());
            stud_id.add(i+1);
        }
        System.out.println(stud_id);
        System.out.println(stud_name);
    }
   
    void createProfessor(int member_cnt)
    {
       
        for(int i=0;i<member_cnt;i++)
        {
        	System.out.println("Enter name of Professor "+(i+1)+" : ");
            prof_name.add(sc.next());
            prof_id.add(i+1);
           
        }
        System.out.println(prof_id);
        System.out.println(prof_name);    
    }
    
    void createCourse(int crs_cnt) 
    {
    	for(int i = 0;i<crs_cnt;i++) {
    		System.out.println("Enter name of the course "+(i+1)+" : ");
    		crs_name.add(sc.next());
    		crs_id.add(i+1);
    	}
    	System.out.println(crs_id);
    	System.out.println(crs_name);
    }

}

public class Admin {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        AdminComponent ad = new AdminComponent();
        if(ad.AdminLogin()==true) {
            System.out.println("Enter the no. of Professor and Students to be inserted : ");
            int member_cnt = sc.nextInt();
           
            ad.createProfessor(member_cnt);
            ad.createStudent(member_cnt);
           
            System.out.println("Professor and Students inserted successfully.");
           
            Professor pf = new Professor();
            pf.ProfessorDetails(ad.prof_id, ad.prof_name);
            Student st = new Student();
            st.StudentDetails(ad.stud_id, ad.stud_name);
        }
        else {
        	System.out.println("Try Again.");
        }
        sc.close();
    }
   
}

