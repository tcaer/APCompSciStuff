public class BinarySearch {

	public static int search(int[] arr, int key, int left, int right) {
		int middle = (left + right) / 2;

		if (arr[middle] == key) {
			return middle;
		} else if (arr[middle] < key) {
			return search(arr, key, middle, right);
		} else if (arr[middle] > key) {
			return search(arr, key, left, middle);
		}

		return -1;
	}

}