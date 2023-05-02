package com.practicetasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<Integer>();
		values.add(42);
		values.add(24);
		values.add(76);
		values.add(38);
		values.add(12);
		values.add(60);
		
		Collections.sort(values);
		// Stream API, which uses lambda expression
		values.forEach(System.out::println);// different way to print elements.
		
		
		
//		for(Integer i: values) {
//			System.out.println(i);
//		}

	}

}
