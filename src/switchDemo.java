import java.util.Scanner;
public class switchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a= sc.nextInt();
		System.out.println("Enter b: ");
		int b= sc.nextInt();
		System.out.println("Enter operator: ");
		char ch = sc.next().charAt(0);
		System.out.println(calc(a,b,ch));
		}
	public static double calc(int a, int b, char ch) {
		switch(ch) {
		case '+':{
			return a+b;
		}
		case '-':{
			return a-b;
		}
		case '/':{
			return a/(double)b;
		}
		case '*':{
			return a*b;
		}
		default:{
			return -1;
		}
		}
	}
	}
