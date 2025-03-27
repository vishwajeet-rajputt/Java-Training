import java.util.Arrays;

public class heightSorting {
	
	public static String [] hsort(String [] arr1, int [] arr2) {
		for (int i = 0; i < arr2.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] > arr2[maxIndex]) {
                	maxIndex = j;
                }
            }
            swap.swapingInt(arr2, i, maxIndex);
            swap.swapingString(arr1, i, maxIndex);
	}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names []= {"Mary","John","Emma"};
		int heights []= {180,165,170};
		System.out.println(Arrays.toString(hsort(names,heights)));
	}

}
