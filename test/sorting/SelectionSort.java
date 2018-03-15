public class SelectionSort {

	public static int[] sort(int[] arr) {
		int n = arr.length - 1;

		while (n > 0) {
			int max = 0;
			int maxPos = 0;

			for (int i = 0; i <= n; i++) {
				if (arr[i] > max) {
					max = arr[i];
					maxPos = i;
				}
			}

			int temp = arr[n];

			arr[maxPos] = temp;
			arr[n] = max;

			n--;
		}

		return arr;
	}

}