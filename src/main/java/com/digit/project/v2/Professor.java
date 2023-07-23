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
	
	
	
	public void assignCourse(String name) {
		for(Entry<String,String> entry : map.entrySet()) {
			if(name.equals(entry.getValue())) {
				Student.assignedProfessor.add(entry.getKey());
			}
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


