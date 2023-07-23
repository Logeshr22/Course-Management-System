package com.digit.project.v2;
import java.util.*;
import java.util.Map.Entry;
public class Professor {
	Scanner sc = new Scanner(System.in);
	AdminComponent admin = new AdminComponent();
	static ArrayList<Integer> ProfessorID = new ArrayList<Integer>();
	static ArrayList<String> ProfessorName = new ArrayList<String>();
    static ArrayList<String> courseIn = new ArrayList<String>();
	static HashMap<String,String> map = new HashMap<String,String>();
	static HashMap<Integer,String> mapDetails = new HashMap<Integer,String>();
	
	
	
	public void assignCourse(String name) {
		for(Entry<String,String> entry : map.entrySet()) {
			if(name.equals(entry.getValue())) {
				Student.assignedProfessor.add(entry.getKey());
			}
		}
	}
	
	public boolean loginCheck(int id,String name)
	{
		boolean login = false;
		for(Entry<Integer,String> entry : mapDetails.entrySet()) {
			if(id==entry.getKey() && name.equals(entry.getValue())) {
				System.out.println("Login successful.");
				login = true;
			}
		}
		return login;
	}
	public void grading() {
		Student stud = new Student();
		int getID;
		int gradeMark;
		System.out.println();
		System.out.println(mapDetails);
		System.out.println("========== PROFESSOR ==========");
		System.out.println();
		System.out.println("Enter Professor ID : ");
		int pID = sc.nextInt();
		System.out.println("Enter Professor Name : ");
		String pName = sc.next();
		if(loginCheck(pID,pName)==true) {
			System.out.println("1.Grade Students");
			switch(sc.nextInt()) {
			case 1 :
			{
				for(int i = 0;i<AdminComponent.memberCount;i++) {
					System.out.println("Enter student ID : ");
					getID = sc.nextInt();
					System.out.println("Enter Grade out of 100 : ");
					gradeMark = sc.nextInt();
					Student.mapGrade.put(getID,gradeMark);
					System.out.println("Student Graded Successfully.");
				}
				System.out.println(Student.mapGrade);
			}
			}
		}
		else {
			System.out.println("Login Failed.");
		}
		
		
	}

	public void profDetails() {	
		ListIterator<Integer> idIterator= ProfessorID.listIterator();
		ListIterator<String> namesIterator = ProfessorName.listIterator();
		ListIterator<String> courseIterator = courseIn.listIterator();
		System.out.println("Professor Details : ");
		
		System.out.println();
			
		System.out.println("======================================");
		System.out.println("ID\tProfessor\tCourse\t");
		System.out.println("======================================");
		System.out.println();
		for(int i = 0;i<ProfessorID.size();i++) {
			System.out.print("#"+idIterator.next()+"\t");
			for(int j = 0;j<1;j++) {
				System.out.print(namesIterator.next()+"\t\t");
				for(int k = 0;k<1;k++) {
					System.out.println(courseIterator.next()+"\t");
				}
			}
			System.out.println();
		}
		System.out.println("======================================");

	}
	public void mapValues() {
		ListIterator<String> namesIterator = ProfessorName.listIterator();
		ListIterator<String> courseIterator = courseIn.listIterator();
		while(namesIterator.hasNext()) {
			map.put(namesIterator.next(),courseIterator.next());
		}
		
	}
	public void gradeStudents(ArrayList<Integer> id, ArrayList<String> name) {
		
	}

}


