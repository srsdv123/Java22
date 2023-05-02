package com.day6;

public class AccessSpecifiers {
	
	protected void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("multiplication  of "+a+" and "+b+" is " + (a*b));
	}
	private void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("division of "+a+" and "+b+" is " + (a/b));
	}

	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("subtraction of "+a+" and "+b+" is " + (a-b));
	}

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition of "+a+" and "+b+" is " + (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiers as = new AccessSpecifiers();
		as.div(10, 2);// private method is accessed within the class.
		}

}
