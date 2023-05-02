package com.day3;

public class StvsIns {
	public void add(int a, int b) {
		System.out.println("addition of "+a+" and "+b+" is " + (a+b));
	}
	public static void mul(int a, int b) {
		System.out.println("multiplication of "+a+" and "+b+" is " + (a*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(12,16);
		StvsIns obj = new StvsIns();
	    obj.add(230, 745);
	}

}
