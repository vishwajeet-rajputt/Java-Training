import java.util.Arrays;

public class mergeArray {

	
	public static int [] merge(int [] arr1, int [] arr2){
		int m= arr1.length;
		int n= arr2.length;
		int [] newArr = new int [m+n];
		int i=0;
		int j=0;
		while(i<m && j<n) {
			for(int k=0;k<newArr.length;k++) {
				if(arr1[i]<arr2[j]) {
					newArr[k]=arr1[i];
					i++;
				}
				else
					newArr[k]=arr2[j];
				j++;
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		int [] arr1 = {8,12,15};
		int [] arr2 = {1,9,11};
		System.out.println(Arrays.toString(merge(arr1,arr2)));
 	}

}
