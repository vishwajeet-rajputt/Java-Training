import java.util.Scanner;

public class factorNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int a =num/2;
		int c=1;
		System.out.print(num+" ");
		while(a!=0) {
			if(num%a==0) {
				System.out.print(a+" ");
				c++;
			}
			a--;
		}
		System.out.println();
		System.out.print(c);
	}

}
