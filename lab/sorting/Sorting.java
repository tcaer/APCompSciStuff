import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		double[] a = {3, 7, 5, 8, 2, 0, 1, 9 ,4, 3};

		insertionSort(a, 6);

		System.out.println(Arrays.toString(a));
	}

	public static void insertionSort(double[] arr, int n) {
		for (int k = 1; k < n; k++) {
			double temp = arr[k];

			int i = k;

			while (i > 0 && arr[i - 1] > temp) {
				arr[i] = arr[i - 1];
				i--;
			}

			arr[i] = temp;
		}
	}

	public static void variedInsertionSort(int[] a) {
		for (int n = a.length - 2; n >= 0; n--) {
			int aTemp = a[n];
			int i = n;

			while (i < (a.length - 1) && aTemp > a[i + 1]) {
				a[i] = a[i + 1];
				i++;
			}

			a[i] = aTemp;
		}
	}

}