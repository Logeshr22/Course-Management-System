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

    

    int member_cnt=0;

    void createStudent()

    {

        ArrayList<Integer> stud_id = new ArrayList<Integer>();

        ArrayList<String> stud_name = new ArrayList<String>();

        System.out.println("Enter the no. of students to be inserted");

        int member_cnt = sc.nextInt();

 

        for(int i=0;i<member_cnt;i++)

        {

            stud_id.add(i);

            System.out.println("Enter Student Name:");

            stud_name.add(sc.next());

        }

        System.out.println(stud_id);

        System.out.println(stud_name);

        

    }

    void createProffesor()

    {

        ArrayList<Integer> prof_id = new ArrayList<Integer>();

        ArrayList<String> prof_name = new ArrayList<String>();

 

        for(int i=0;i<member_cnt;i++)

        {

            prof_id.add(i);

            System.out.println("Enter Professor Name:");

            prof_name.add(sc.next());

        }

        System.out.println(prof_id);

        System.out.println(prof_name);    

        

    }

}

 

public class Admin {

    public static void main(String[] args) {

        AdminComponent ad = new AdminComponent();

//        ad.AdminLogin();

        ad.createStudent();

        ad.createProffesor();
        System.out.println("Hello");
        System.out.println();

    }

}