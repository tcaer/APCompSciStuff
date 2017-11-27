public class Loop {

	public static void main(String[] args) {
		int[] foo = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		System.out.println(sum(foo));
		
		int[][] array = {
			{-1, 0, 1, 2, 3, 4, 5, 6},
			{-1, 0, 1, 2, 3, 4, 5, 6}
		};
		System.out.println(sums(array));
	}

	public static int sum(int[] ints) {
		int result = 0;

		for (int i : ints) {
			result += i;
		}

		return result;
	}

	public static int[] sums(int[][] t) {
		int[] sums = new int[t.length];
		int i = 0;

		for (int[] x : t) {
			sums[i] = sum(x);
			i++;
		}

		return sums;
	}

}