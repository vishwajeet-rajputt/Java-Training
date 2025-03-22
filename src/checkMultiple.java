import java.util.Scanner;
public class checkMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a= sc.nextInt();
		System.out.println("Enter b: ");
		int b= sc.nextInt();
		System.out.println(check(a,b));
		sc.close();

	}
	public static int check(int a, int b) {
		if(a==0 && b==0)return 3;
		else if(a%b==0)return 2;
		else return 1;
		
	}
}
