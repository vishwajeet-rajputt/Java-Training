import java.util.Scanner;

public class arrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int add=0;
		for(int i=0;i<arr.length;i++) {
			 add+=arr[i];
		}
		System.out.println(add);
	}

	}