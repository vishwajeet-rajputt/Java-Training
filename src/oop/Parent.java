package oop;

public class Parent {
	
	static int a=10;
	int b=20;
	
	Parent(){
		System.out.println("Parent class constructor");
	}
	
	static {
		System.out.println("Parent class static block");
	}
	{
		System.out.println("parent class non-static block");
	}
	public static void m1() {
		System.out.println("Parent class static Method");
	}
	public void m2() {
		System.out.println("Parent class non-static method");
	}
}
