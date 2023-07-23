package com.digit.project.v2;
import java.util.*;
public class Professor {
	Scanner sc = new Scanner(System.in);
	AdminComponent admin = new AdminComponent();
	static ArrayList<Integer> ProfessorID = new ArrayList<Integer>();
	static ArrayList<String> ProfessorName = new ArrayList<String>();
    static ArrayList<String> courseIn = new ArrayList<String>();
	public void profDetails() {		
		System.out.println("Professor Details : ");
		System.out.println();
		ListIterator<Integer> idIterator= ProfessorID.listIterator();
		ListIterator<String> namesIterator = ProfessorName.listIterator();
		ListIterator<String> courseIterator = courseIn.listIterator();
		System.out.println("=======================");
		System.out.println("ID\tName\tCourse\t");
		System.out.println("=======================");

		for(int i = 0;i<ProfessorID.size();i++) {
			System.out.print("#"+idIterator.next()+"\t");
			for(int j = 0;j<1;j++) {
				System.out.print(namesIterator.next()+"\t");
				for(int k = 0;k<1;k++) {
					System.out.println(courseIterator.next()+"\t");
				}
			}
			System.out.println();
		}
		System.out.println("=======================");
	}
	
	public void gradeStudents(ArrayList<Integer> id, ArrayList<String> name) {
		
	}

}


