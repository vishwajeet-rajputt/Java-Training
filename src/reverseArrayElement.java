import java.util.Arrays;

public class reverseArrayElement {

	public static int rev(int a) {
		int ans=0;
		while(a>0) {
			ans=ans*10+a%10;
			a/=10;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1 []= {12,31,43,89};
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=rev(arr1[i]);
		}
		System.out.println(Arrays.toString(arr1));
	}

}
