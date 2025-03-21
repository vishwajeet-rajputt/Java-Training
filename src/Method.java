
public class Method {
	static int num=0;
	
	public static void m1() {
		num++;
//		System.out.println("M1 Starts");
		m2();
//		System.out.println("M1 Ends");
	}
	public static void m2() {
		System.out.println(num);
		m1();
//		System.out.println("M2 Ends");
	}
	public static void m3() {
		System.out.println("M3 Starts");
		System.out.println("M3 Ends");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		m1();

	}

}
