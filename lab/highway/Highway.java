public class Highway {

	private int[][] hwy;

	public Highway(int col, int row) {
		hwy = new int[col][row];
	}

	public void addCar(int col, int row) {
		hwy[col][row] = 1;
	}

	public boolean canSwitchLane(int lane, int dir, int x) {
		if ((dir == -1) && (lane == 0)) {
			return false;
		}
		if ((dir == 1) && (lane == hwy.length)) {
			return false;
		}
		if (hwy[lane + dir][x] == 1) {
			return false;
		}

		return true;
	}

	public void moveAllForward() {
		int saved = 0; 

		for (int y = 0; y < hwy.length; y++) {
			saved = hwy[y][hwy[0].length - 1];

			for (int x = hwy[0].length - 1; x > 0; x--) {
				hwy[y][x] = hwy[y][x - 1];
			}

			hwy[y][0] = saved;
		}
	}

	public int[][] getHwy() {
		return hwy;
	}

}