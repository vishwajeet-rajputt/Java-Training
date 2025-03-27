import java.util.Arrays;

public class colMax {
	
	public static void main(String[] args) {
		int [][] arr = {{1,8,8},{2,9,3},{3,3,12}};
		int [] colMax= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int max= arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[j][i]) {
					max=arr[j][i];
				}
			}
			colMax[i]=max;
		}
		System.out.println(Arrays.toString(colMax));
	}

}
