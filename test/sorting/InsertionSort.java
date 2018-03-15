import java.util.Arrays;

public class InsertionSort {

	public static int[] sort(int[] arr) {
		for (int k = 1; k < arr.length; k++) {	
			int temp = arr[k];
			int i = k;

			while (i > 0 && arr[i - 1] > temp) {
				arr[i] = arr[i - 1];
				i--;
			}

			arr[i] = temp;
		}

		return arr;
	}

}