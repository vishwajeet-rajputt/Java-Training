import java.util.Scanner;

public class evenOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		boolean i = false, j = false, k = false;
		System.out.println("Enter no.");
		int num1 = sc.nextInt();
		System.out.println("Enter no.");
		int num2 = sc.nextInt();
		System.out.println("Enter no.");
		int num3 = sc.nextInt();
		if (num1 % 2 == 0) {
			flag++;
			i = !i;
		}
		if (num2 % 2 == 0) {
			flag++;
			j = !j;
		}
		if (num3 % 2 == 0) {
			flag++;
			k = !k;
		}

		if (flag == 0) {
			System.out.println(0);
		}
		if (flag == 1) {
			if (i == true) {
				System.out.println(num1);
			} else if (j == true) {
				System.out.println(num2);
			} else
				System.out.println(num3);
		}
		if (flag == 2) {
			int add = 0;
			if (i == true) {
				add += num1;
			}
			if (j == true) {
				add += num2;
			}
			if (k == true) {
				add += num3;
			}
			System.out.println(add);
		}
		if (flag == 3) {
			System.out.println(num1 * num2 * num3);
		}
		sc.close();
	}
}
