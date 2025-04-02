
public class Mountain {
	
	public static int makeMountain(int arr []) {
		int middle=arr.length/2;
		if(arr.length%2!=0) {
			int count=0;
			int i=middle-1;
			while(i>=0) {
				if(arr[middle]-arr[i]!=1) {
					arr[i]=arr[middle]-1;
					count++;
				}
				middle--;
				i--;
			}
			i=0;int j=arr.length-1;
			while(i<j) {
				if(arr[i]!=arr[j]) {
					count++;
				}
				i++;
				j--;
			}
			return count;
		}
		else {
			int count=0;
			while(middle<arr.length-1) {
				if(arr[middle+1]-arr[middle]!=0) {
					arr[middle+1]=arr[middle]-1;
					count++;
				}
				middle++;
			}
			int i=0;
			int j=arr.length-1;
			while(i<j) {
				if(arr[i]!=arr[j]) {
					count++;
				}
				i++;
				j--;
			}
			return count;
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,7};
		System.out.println(makeMountain(arr));

	}

}
