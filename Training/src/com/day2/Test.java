package com.day2;

public class Test {
	int a;
	int b;
	int c;
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Test() {
    	System.out.println("default constructor with zero parameters");
    }
    public Test(int a, int b) {
    	this.a = a;
    	this.b = b;
    	System.out.println("constructor with two parameters");
    }
    public Test(int a,int b, int c) {
    	this.a = a;
    	this.b = b;
    	this.c = c;
    	System.out.println("constructor with three parameters");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test(5,6,7);
		obj.setA(1);
		obj.setB(2);
		obj.setC(3);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
	}

}
