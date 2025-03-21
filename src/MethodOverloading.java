
public class MethodOverloading {
	public static void main(String[] args) {
		add(53,0);
		add(12,13,12);
		add(41.90,89);
		add(12,23.09,11);
		add(90.09,12,13);
		
	}
	
	public static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public static void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public static void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public static void add(int num1, double num2,int num3) {
		System.out.println(num1+num2+num3);
}
	public static void add(double num1, int num2,int num3) {
		System.out.println(num1+num2+num3);
		}
	}
