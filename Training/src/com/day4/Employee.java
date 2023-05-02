package com.day4;

public class Employee extends Department{
	public void emp(String c, int a) {
	   System.out.println("Employee name is "+ c + " and age is"+ a);
	}
	public static void main(String[] args) {
		Employee e =new Employee();
		e.emp("Sita",24);
		e.details();
	}

}
