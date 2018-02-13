public class Searching {

	public static int search(int[] a, int m, int n, int target) {
		if (m < n) {
			return -1;
		}

		int k = (m + n) / 2;

		if (a[k] == target) {
			 return k;
		}

		int pos = search(a, m, k+1, target);

		if (pos >= 0) {
			return pos;
		}

		pos = search(a, k+1, n, target);

		return pos;
	}

}