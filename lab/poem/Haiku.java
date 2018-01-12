public class Haiku extends Poem {

	public int numLines() {
		return 3;
	}

	public int getSyllables(int k) {
		if (k == 1) {
			return 5;
		} else if (k == 2) {
			return 7;
		} else {
			return 5;
		}
	}

	public void printRythm() {
		System.out.println("ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta");
	}

}