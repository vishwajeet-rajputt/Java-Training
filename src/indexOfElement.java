
public class indexOfElement {
	
	public static int index(int [] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] arr= {1,2,3,45};
		System.out.println(index(arr,45));
	}

}
