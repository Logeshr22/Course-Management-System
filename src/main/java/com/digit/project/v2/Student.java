package com.digit.project.v2;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class Student {
	public static void main(String[] args)
	{




		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping Students with their ID
		hash_map.put(4101, "Aarav");
		hash_map.put(4102, "Akalya");
		hash_map.put(4103, "Raghav");
		hash_map.put(4104, "Ramya");
		hash_map.put(4105, "Rasmia");      
		hash_map.put(4106, "Shivani");
		hash_map.put(4107, "Shwetha");
		hash_map.put(4108, "Soorya");
		hash_map.put(4109, "Varuna");
		hash_map.put(4110, "Ziaudeen");

		hash_map.forEach(
	            (key, value)
	                -> System.out.println(key + " : " + value));
	   
		//  System.out.println(hash_map.get(41010));


	}
}
