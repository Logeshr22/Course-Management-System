package com.digit.project.v2;
import java.util.*;
import java.util.Map.Entry;
public class Student {
	
	Scanner sc = new Scanner(System.in);
	
	static ArrayList<Integer> studentID = new ArrayList<Integer>();
	static ArrayList<String> studentName = new ArrayList<String>();
	static ArrayList<String> selectedCourse = new ArrayList<String>();
	static ArrayList<String> assignedProfessor = new ArrayList<String>();
	static ArrayList<Integer> assignedMark = new ArrayList<Integer>();
	static ArrayList<String> assignedGrade = new ArrayList<String>();
	static HashMap<Integer,Integer> mapMark = new HashMap<Integer,Integer>();
	static HashMap<Integer,String> mapDetails = new HashMap<Integer,String>();
	
	
	//displays the student details
	public void studentDetails() {
		
		System.out.println();
		System.out.println("Student Details : ");
		System.out.println();
		
		System.out.println(Student.assignedProfessor);//debugging
		
		ListIterator<Integer> sidIterator= studentID.listIterator();
		ListIterator<String> snamesIterator = studentName.listIterator();
		ListIterator<String> scourseIterator = selectedCourse.listIterator();
		ListIterator<String> sprofIterator = assignedProfessor.listIterator();

		
		System.out.println("=======================================");
		System.out.println("ID\tStudent\tCourse\tProfessor\t");
		System.out.println("=======================================");
		System.out.println();
		
		//displaying student details without marks
		for(int i = 0;i<AdminComponent.memberCount;i++) {
			while(sidIterator.hasNext()) {
				System.out.print("#"+sidIterator.next()+"\t");
				break;
			}
			while(snamesIterator.hasNext()) {
				System.out.print(snamesIterator.next()+"\t");
				break;
			}
			while(scourseIterator.hasNext()) {
				System.out.print(scourseIterator.next()+"\t");
				break;
			}
			while(sprofIterator.hasNext()) {
				System.out.print(sprofIterator.next()+"\t");
				System.out.println("");
				break;
			}
		}
		System.out.println("=======================================");
	}
	
	//to assign the marks from the HashMap to ArrayList
	public void assignMarks(int id) {
		for(Entry<Integer,Integer> entry : mapMark.entrySet()) {
				Student.assignedMark.add(entry.getValue());
		}	
	}
	
	
	//to assign the grades
	
	public void assignGrades() {
		ListIterator<Integer> marks = assignedMark.listIterator();
//		System.out.println("In the assignGrades method"); //debugging

//		for(int i = 0;i<AdminComponent.memberCount;i++) {
//			System.out.println("in the for loop"); //debugging
//			while(marks.hasNext()) {
//				int currentMark = marks.next();
//				System.out.println("In the while loop"); //debugging
//				System.out.println(marks.next());
//				System.out.println(marks.next());
//				if(currentMark>=0 && currentMark<60) {
//					System.out.println("In the first if block");//debugging
//					assignedGrade.add("E");
//				}
//				else if(currentMark>=60 && currentMark<70) {
//					assignedGrade.add("D");
//				}
//				else if(currentMark>=70 && currentMark<80) {
//					assignedGrade.add("C");
//				}
//				else if(currentMark>=80 && currentMark<90) {
//					assignedGrade.add("B");
//				}
//				else if(currentMark>=90 && currentMark<100) {
//					assignedGrade.add("A");
//				}
//				
//			}
//		}
	}
	
	//checking login of student
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
	
	//displaying the scoreCard of students
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
				assignMarks(sID);//to assign the marks from HashMap to ArrayList
				
//				System.out.println(assignedMark);//debugging

				System.out.println("============================================================");
				System.out.println("ID\tStudent\tCourse\tProfessor\tMark\t");
				System.out.println("============================================================");
				System.out.println();
				ListIterator<Integer> smarkIterator = assignedMark.listIterator();
//				ListIterator<String> sgradeIterator = assignedGrade.listIterator();
				
				assignGrades();//to assign the grades with respect to marks
				
//				System.out.println(assignedGrade);//debugging
				
				
				//displaying student details with marks and grades
				
				for(int i = 0;i<AdminComponent.memberCount;i++) {
					while(sidIterator.hasNext()) {
						System.out.print("#"+sidIterator.next()+"\t");
						break;
					}
					while(snamesIterator.hasNext()) {
						System.out.print(snamesIterator.next()+"\t");
						break;
					}
					while(scourseIterator.hasNext()) {
						System.out.print(scourseIterator.next()+"\t");
						break;
					}
					while(sprofIterator.hasNext()) {
						System.out.print(sprofIterator.next()+"\t\t");
						break;
					}
					while(smarkIterator.hasNext()) {
						System.out.print(smarkIterator.next()+"\t");
						System.out.println("");
						break;
					}
//					while(sgradeIterator.hasNext()) {
//						System.out.println(sgradeIterator.next()+"\t");
//						System.out.println("");
//						break;
//					}
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


