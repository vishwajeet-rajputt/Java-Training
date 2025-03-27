import java.util.Arrays;

public class shiftRight {

	public static int [] rshift(int arr []) {
		int a = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=a;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(rshift(arr)));

	}

}
