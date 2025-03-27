import java.util.Scanner;

public class evenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int ans=0;
		while(num>0) {
			if((num%10)%2==0) {
				ans+=num%10;
			}
			num/=10;
		}
		System.out.println(ans);

	}

}
