public class Main {

	public static void main(String[] args) {
		System.out.println(binomialCoeff(5, 3));
	}

	public static int binomialCoeff(int n, int k) {
		if (k == 0) {
			return 1;
		} else if (k == n) {
			return 1;
		} else {
			return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
		}
	}

}