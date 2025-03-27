import java.util.Scanner;

public class primeNumber {

	public static boolean prime(int a) {
		int c = 0;
		int k = 1;
		while (k <= a) {
			if (a % k == 0)
				c++;
			k++;
		}
		if (c == 2) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println(prime(num));
	}

}
