public class Limerick extends Poem {

	public int numLines() {
		return 5;
	}

	public int getSyllables(int k) {
		if (k == 1 || k == 2 || k ==5) {
			return 9;
		} else if (k == 3 || k == 4) {
			return 6;
		}

		return 0;
	}

	public void printRythm() {
		System.out.println("ta-ta-ta-ta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta\nta-ta-ta-ta-ta-ta-ta-ta-ta");
	}

}