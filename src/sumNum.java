import java.util.Scanner;

public class sumNum {
	
	public static int addNum(int a) {
		int ans=0;
		while(a>0) {
			ans+=a%10;
			a=a/10;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res= addNum(num);
		while(res>10) {
			res=addNum(res);
		}
		System.out.println(res);

	}

}
