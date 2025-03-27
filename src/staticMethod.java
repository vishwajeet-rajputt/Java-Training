
public class staticMethod {
	static int a =10;
	static {
		System.out.println("Static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(a);
		System.out.println("main end");
		
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block -1");
	}
}
