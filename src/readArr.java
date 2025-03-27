
public class readArr {

	public static void reverse(int [] arr){
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverseFirstHalf(int [] arr) {
		for(int i=arr.length/2;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverseSecondHalf(int [] arr) {
		for(int i=arr.length-1;i>=arr.length/2;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void evenIndexed(int [] arr) {
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void oddIndexed(int [] arr) {
		for(int i=1;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void evenIndexedReverse(int [] arr) {
		for(int i=arr.length-1;i>=0;i-=2) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void oddIndexedReverse(int [] arr) {
		for(int i=arr.length-2;i>=1;i-=2) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int [] arr1 = {11,12,13,14,15,16};
		reverse(arr);
		System.out.println();
		reverseFirstHalf(arr);
		System.out.println();
		reverseSecondHalf(arr);
		System.out.println();
		evenIndexed(arr);
		System.out.println();
		oddIndexed(arr);
		System.out.println();
		evenIndexedReverse(arr1);
		System.out.println();
		oddIndexedReverse(arr1);
 		
	}

}
