
public class secondMax {

	public static int secondMaximum(int [] arr) {
		int max1=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max1<arr[i]) {
				max1=arr[i];
			}
		}
		int max2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max2<arr[i] && arr[i]!=max1) {
				max2=arr[i];
			}
		}
		
		return max2;
	}
	public static void main(String[] args) {
		int [] arr = {2,7,11,5,9,3};
		System.out.println(secondMaximum(arr));
	}

}
