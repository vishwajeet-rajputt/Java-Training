public class ConditionalOperator {

	public static void main(String[] args) {
		int num1=103;
		int num2=102;
		int num3=101;
		int res = num1>num2 ? num1>num3?num1:num3:num2>num3?num2:num3;
		System.out.println(res);
	}

}
