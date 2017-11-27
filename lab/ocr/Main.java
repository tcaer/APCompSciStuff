import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
	}

	private static int findVertPosition(int[][] image, int h) {
		int bigInk = 0;

		for (int x = 0; x < image.length; x++) {
			int ink = 0;
			for (int y = 0; y < image.length; y++) {
				ink += image[y][x];
			}

			if (ink > bigInk) {
				bigInk = ink;
			}
		}

		return bigInk;
	}

	private static int findVertPosition(int[][] image, int row0, int h, int w) {
		int numRows = 0;
		int numCols = 0;
	}

	private static int[][] loadImage(String fileName, int rows, int cols) {
		File file = new File(fileName);
		Scanner input = null;

		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		int[][] image = new int[rows][cols];

		input.nextLine();
		input.nextLine();
		input.nextLine();

		int r = 0, c = 0;
		while (input.hasNextLine()) {
			if (r >= rows) {
				input.close();
				System.exit(-1);
			}

			image[r][c] = input.nextInt();
			c++;

			if (c == cols) {
				c = 0;
				r++;
			}
		}

		if (c != 0 || r != rows) {
			input.close();
			System.exit(-1);
		}

		input.close();
		return image;
	}

}