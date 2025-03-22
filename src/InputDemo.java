import java.util.Scanner;
public class InputDemo {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("int input: ");
		int num1 = ip.nextInt();
		System.out.println(num1);
		System.out.println("long input");
		long num2 = ip.nextLong();
		System.out.println(num2);
		System.out.println("boolean input");
		boolean num3 = ip.nextBoolean();
		System.out.println(num3);
		System.out.println("double input");
		double num4 = ip.nextDouble();
		System.out.println(num4);
		System.out.println("float input");
		float num5 = ip.nextFloat();
		System.out.println(num5);
		ip.nextLine();
		System.out.println("Enter String");
		String st= ip.nextLine();
		System.out.println(st);
		
		ip.close();
	}
}
