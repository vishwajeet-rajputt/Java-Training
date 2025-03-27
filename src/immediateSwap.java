import java.util.Arrays;

public class immediateSwap {
	
	public static int [] reverse(int [] arr) {
		int i=0;
		while(i+1<arr.length) {
			int a=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=a;
			i+=2;}
		return arr;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(reverse(arr)));
	}

}
