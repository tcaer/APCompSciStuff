public class Scores {

	private static int[] scores = {1, 1, 1, 0, 1};

	public static void main(String[] args) {
		testIfSame();
	}

	public static boolean testIfSame() {
		int first = scores[0];

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] != first) {
				System.out.println("The elements of the array are not equal");
				return false;
			}
		}

		System.out.println("The elements of the array are equal");
		return true;
	}

}