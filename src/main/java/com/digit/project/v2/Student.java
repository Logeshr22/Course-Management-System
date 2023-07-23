package com.digit.project.v2;
import java.util.*;
public class Student {
	
	static ArrayList<Integer> studentID = new ArrayList<Integer>();
	static ArrayList<String> studentName = new ArrayList<String>();
	static ArrayList<String> selectedCourse = new ArrayList<String>();
	static ArrayList<String> assignedProfessor = new ArrayList<String>();
	
	public void studentDetails() {
		System.out.println();
		System.out.println("Student Details : ");
		System.out.println();
		System.out.println(Student.assignedProfessor);
		
		ListIterator<Integer> sidIterator= studentID.listIterator();
		ListIterator<String> snamesIterator = studentName.listIterator();
		ListIterator<String> scourseIterator = selectedCourse.listIterator();
		ListIterator<String> sprofIterator = assignedProfessor.listIterator();

		
		System.out.println("============================================================");
		System.out.println("ID\tStudent\tCourse\tProfessor\t");
		System.out.println("============================================================");
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
		System.out.println("============================================================");
	}
	public void StudentDetails(ArrayList<Integer> id, ArrayList<String> name) {
		
	}
}


