package com.digit.project.v2;
import java.util.*;
import java.util.Map.Entry;
public class Student {
	Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> studentID = new ArrayList<Integer>();
	static ArrayList<String> studentName = new ArrayList<String>();
	static ArrayList<String> selectedCourse = new ArrayList<String>();
	static ArrayList<String> assignedProfessor = new ArrayList<String>();
	static ArrayList<Integer> assignedGrade = new ArrayList<Integer>();
	static HashMap<Integer,Integer> mapGrade = new HashMap<Integer,Integer>();
	static HashMap<Integer,String> mapDetails = new HashMap<Integer,String>();
	
	public void studentDetails() {
		System.out.println();
		System.out.println("Student Details : ");
		System.out.println();
		System.out.println(Student.assignedProfessor);
		
		ListIterator<Integer> sidIterator= studentID.listIterator();
		ListIterator<String> snamesIterator = studentName.listIterator();
		ListIterator<String> scourseIterator = selectedCourse.listIterator();
		ListIterator<String> sprofIterator = assignedProfessor.listIterator();

		
		System.out.println("=======================================");
		System.out.println("ID\tStudent\tCourse\tProfessor\t");
		System.out.println("=======================================");
		System.out.println();
		for(int i = 0;i<studentID.size();i++) {
			System.out.print("#"+sidIterator.next()+"\t");
			for(int j = 0;j<1;j++) {
				System.out.print(snamesIterator.next()+"\t");
				for(int k = 0;k<1;k++) {
					System.out.print(scourseIterator.next()+"\t");
					for(int l = 0;l<1;l++) {
						System.out.println(sprofIterator.next()+"\t");
					}
				}
			}
			System.out.println();
		}
		System.out.println("=======================================");
	}
	public void assignGrades(int id) {
			for(Entry<Integer,Integer> entry : mapGrade.entrySet()) {
					Student.assignedGrade.add(entry.getValue());
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
	
	public void scoreCard() {
		ListIterator<Integer> sidIterator= studentID.listIterator();
		ListIterator<String> snamesIterator = studentName.listIterator();
		ListIterator<String> scourseIterator = selectedCourse.listIterator();
		ListIterator<String> sprofIterator = assignedProfessor.listIterator();

		System.out.println("========== STUDENT ==========");
		System.out.println();
		System.out.println("Enter Student ID : ");
		int sID = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sName = sc.next();
		if(loginCheck(sID,sName)==true) {
			System.out.println("1.View Scorecard");
			switch(sc.nextInt()) {
			case 1 :
			{
				assignGrades(sID);
				System.out.println(assignedGrade);
				System.out.println("============================================================");
				System.out.println("ID\tStudent\tCourse\tProfessor\tGrade");
				System.out.println("============================================================");
				System.out.println();
				ListIterator<Integer> sgradeIterator = assignedGrade.listIterator();
				for(int i = 0;i<studentID.size();i++) {
					System.out.print("#"+sidIterator.next()+"\t");
					for(int j = 0;j<1;j++) {
						System.out.print(snamesIterator.next()+"\t");
						for(int k = 0;k<1;k++) {
							System.out.print(scourseIterator.next()+"\t");
							for(int l = 0;l<1;l++) {
								System.out.print(sprofIterator.next()+"\t\t");
								for(int m = 0;m<1;m++) {
									System.out.println(sgradeIterator.next()+"\t");
								}
							}
							
						}
					}
					System.out.println();
				}
				System.out.println("============================================================");
			}
			}
		}
		else {
			System.err.println("Login Failed.");
		}
		
		
	}
}


