
public class diagoanlsum {
	
	public static int dsum(int [][] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i][i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{23,0,8},{9,3,7}};
		System.out.println(dsum(arr));

	}

}
