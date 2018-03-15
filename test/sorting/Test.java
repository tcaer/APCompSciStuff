import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = {32, 68, 1023, 3, 92, 6, 31, 95, 34, 4, 1, 50};
		int[] arr2 = {32, 68, 1023, 3, 92, 6, 31, 95, 34, 4, 1, 50};
		int[] arrSorted = {1, 3, 4, 6, 31, 32, 34, 50, 68, 92, 95, 1023};

		System.out.println(sequentialSearch(arr, 34));
		System.out.println(binarySearch(arrSorted, 34, 0, arrSorted.length));
		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(insertionSort(arr2)));
	}

	public static int sequentialSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1;
	}

	public static int binarySearch(int[] arr, int key, int left, int right) {
		if (right < left) {
			return -1;
		}

		int middle = (left + right) / 2;

		if (arr[middle] == key) {
			return middle;
		} else if (arr[middle] > key) {
			return binarySearch(arr, key, left, middle - 1);
		} else {
			return binarySearch(arr, key, middle + 1, right);
		}
	}

	public static int[] selectionSort(int[] arr) {
		int k = arr.length - 1;

		while (k > 0) {
			int max = 0;
			int maxPos = 0;

			for (int i = 0; i < k; i++) {
				if (arr[i] > max) {
					max = arr[i];
					maxPos = i;
				}
			}

			int temp = arr[k];
			arr[k] = max;
			arr[maxPos] = temp;

			k--;
		}

		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		int k = 1;

		while (k < arr.length) {
			int num = arr[k];
			int i = k;

			while (i > 0 && arr[i - 1] > num) {
				arr[i] = arr[i - 1];
				i--;
			}

			arr[i] = num;

			k++;
		}

		return arr;
	}

}