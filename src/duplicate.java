import java.util.Arrays;

public class duplicate {
	
	public static String duplicaten(int ... arr) {
		String str="";
		for(int i=0;i<arr.length;i++) {
			int a= arr[i];int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(a==arr[j] && a!=Integer.MIN_VALUE) {
					arr[j]=Integer.MIN_VALUE;
					count++;
				}
			}
			if(count>0) {
				str+=a;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String res = duplicaten(1,2,3,4,1,2,5,6,7,8,9,3);
		int [] arr = new int[res.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Character.getNumericValue(res.charAt(i));
		}
		System.out.println(Arrays.toString(arr));
		}


	}