
public class Mountain1 {
	
	public static int makeMountain(int arr []) {
		int middle=arr.length/2;
		int count=0;
		if(arr.length%2!=0) {
			int i=middle;
			int j=middle;
			while(i>=0 && j+1<arr.length) {
				if(arr[i]-arr[i-1]!=1) {
					arr[i-1]=arr[i]-1;
					count++;
				}
				if(arr[j+1]-arr[j]!=1) {
					arr[j+1]=arr[j]-1;
					count++;
				}
				i--;
				j++;
			}
		}
			return count;
		}
//		else {
//			int count=0;
//			while(middle<arr.length-1) {
//				if(arr[middle+1]-arr[middle]!=0) {
//					arr[middle+1]=arr[middle]-1;
//					count++;
//				}
//				middle++;
//			}
//			int i=0;
//			int j=arr.length-1;
//			while(i<j) {
//				if(arr[i]!=arr[j]) {
//					count++;
//				}
//				i++;
//				j--;
//			}
//			return count;
//		}
//	}

	public static void main(String[] args) {
		int [] arr = {1,1,2,3,2,1,1};
		System.out.println(makeMountain(arr));

	}

}
