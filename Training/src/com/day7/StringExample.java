package com.day7;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello"; // Literal
		String s2 = "Hello";
		String str1 = new String("World!"); // using new keyword
		String str2 = new String("World!");
		System.out.println("Equals and reference operator usage on literals (SCP)");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println("Equals and reference operator usage on strings using new keyword (SCP and Heap)");
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		//StringBuffer andStringBuilder
		StringBuffer sb1 = new StringBuffer("Java");
		sb1.append("Training");
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("Python");
		sb2.append("Training");
		System.out.println("Training");
		
	}

}
