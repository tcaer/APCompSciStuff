import java.util.Scanner;

public class Cooney {

	private static int numCorrect = 0;
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Try to figure out what Cooney likes:");
		System.out.println("Cooney likes MOON but he doesn't like SUN");
		System.out.println("Cooney likes SOCCER but he doesn't like HOCKEY");
		System.out.println("Cooney likes SUMMER but he doesn't like SPRING");

		scanner = new Scanner(System.in);

		startQuery();
	}

	public static boolean isCooney(String str) {
		int x = 0;

		while (x < str.length() - 1) {
			int y = x + 1;
			if (str.charAt(x) == str.charAt(y)) {
				return true;
			}
			x++;
		}
		return false;
	}

	public static void startQuery() {
		System.out.print("Enter a word: ");
		String str = scanner.nextLine();
		str = str.replaceAll(" ", "");

		boolean isLiked = isCooney(str);

		if (isLiked) {
			System.out.println("Yes, Cooney likes " + str);
			numCorrect++;

			if (numCorrect >= 5) {
				System.out.println("I think you got the rule... I quit!");
			} else {
				startQuery();
			}
		} else {
			System.out.println("No, Cooney doesn't like " + str);
			numCorrect = 0;
			startQuery();
		}
	}

}