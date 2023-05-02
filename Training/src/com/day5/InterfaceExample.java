package com.day5;

public class InterfaceExample implements TestA, TestB, TestC{
	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("multiplication  of "+a+" and "+b+" is " + (a*b));
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("division of "+a+" and "+b+" is " + (a/b));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("subtraction of "+a+" and "+b+" is " + (a-b));
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition of "+a+" and "+b+" is " + (a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample i =new InterfaceExample();
		i.add(2,3);
		i.sub(10, 6);
		i.mul(4, 3);
		i.div(12, 6);
	}

	

}
