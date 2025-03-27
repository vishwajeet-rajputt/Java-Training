import java.util.Arrays;

public class stringReverse {
	
	public static String [] reverse(String [] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(i%2!=0 && j%2!=0) {
			String a=arr[i];
			arr[i]=arr[j];
			arr[j]=a;}
			i++;
			j--;
		}
		return arr;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"my","name","is","vishwajeet","chhonker"};
		System.out.println(Arrays.toString(reverse(arr)));
	}

}
