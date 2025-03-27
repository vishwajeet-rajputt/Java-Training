import java.util.Scanner;
public class addNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2: ");
		int num2 = sc.nextInt();
		sc.close();
		int rnum1=0;
		while(num1!=0) {
			rnum1=rnum1*10+num1%10;
			num1/=10;
		}
//		int ans=0;
//		while(rnum1!=0 && num2!=0) {
//			ans=ans*10+rnum1%10;
//			rnum1/=10;
//			ans=ans*10+num2%10;
//			num2/=10;
//		}
//		while(rnum1>0) {
//			ans=ans*10+rnum1%10;
//			rnum1/=10;
//		}
//		while(num2>0) {
//			ans=ans*10+num2%10;
//			num2/=10;
//		}
		
//		alternate way
		int ans=0;
		while(rnum1!=0 || num2!=0) {
			if(rnum1!=0) {
				ans=ans*10+rnum1%10;
				rnum1/=10;
			}
			if(num2!=0) {
				ans=ans*10+num2%10;
				num2/=10;
			}
		}
		System.out.println("Output is: "+ans);
	}

}
