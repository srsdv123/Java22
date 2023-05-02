package com.practicetasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
	
	
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Panda");
		animals.add("Bear");
		
		System.out.println(animals);
		System.out.println("after adding elephant the list is");
		animals.add(2,"elephant");
		System.out.println(animals);
	}

}
