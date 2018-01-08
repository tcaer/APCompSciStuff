import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Factorial: ");
		int num = scanner.nextInt();
		System.out.println(num + "! = " + factorial(num));
		System.out.println("Power: ");
		num = scanner.nextInt();
		System.out.println("Power: " + num + " gives " + power(2, num));
		System.out.println("Pascals triangle: ");
		num = scanner.nextInt();
		print(num);
		System.out.println("Binary: ");
		num = scanner.nextInt();
		System.out.println(binary(num));
	}

	private static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}

		return factorial(n - 1) * n;
	}

	private static int power(int n, int power) {
		if (power == 0) {
			return 1;
		} else {
			return n * power(n, power-1);
		}
	}

	private static void print(int n) {
		for (int i = 0; i < n; i++) {
            System.out.format("%"+(n-i)*3+"s","");
            for (int j = 0; j <= i; j++) {
                System.out.format("%6d",(pascalsTriangle(i, j)));
            }
            System.out.println();
        }
	}

	private static int pascalsTriangle(int i, int j) {
		if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascalsTriangle(i - 1, j - 1) + pascalsTriangle(i - 1, j);
        }
	}

	private static String binary(int n) {
		if (n == 1) {
			return "1";
		} else {
			int rem = n%2;
			return binary(n/2) + rem;
		}
	}

}