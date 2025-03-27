import java.util.Arrays;

public class swap {

	public static String [] swapingString(String arr [],int index1,int index2) {
		String a=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=a;
		return arr;
	}
	public static int [] swapingInt(int arr [],int index1,int index2) {
		int a=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=a;
		return arr;
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(swapingInt(arr,1,4)));
	}

}
