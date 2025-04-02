package oop;

public class Child extends Parent {

	static int c=30;
	int d=40;
	Child(){
		System.out.println("child class constructor");
	}
	
	static {
		System.out.println("child class static block");
	}
	{
		System.out.println("child class non-static block");
	}
	public static void m3() {
		System.out.println("child class static Method");
	}
	public void m4() {
		System.out.println("child class non-static method");
	
}
	public static void main(String[] args) {
		Parent ch = new Child();
		System.out.println(a);
		System.out.println(ch.b);
		System.out.println(c);
//		System.out.println(ch.d);
		m1();
		ch.m2();
		m3();
//		ch.m4();
	}
}
