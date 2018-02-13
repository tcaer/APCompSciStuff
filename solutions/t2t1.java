//Question 1b
public void moveAllForward() {
	int lanes = hwy.length;
	int xMax = hwy[0].length - 1;
	int saved = 0;

	for (int lane = 0; lane < lanes; lane++) {
		saved = hwy[lane][xMax];

		for (int x = xMax; x > 0; x--) {
			hwy[lane][x] = hwy[lane][x - 1];
		}

		hwy[lane][0] = saved;
	}
}

// Corrections && extraCredit
public void moveAllForward() {
	int saved = 0; 
	/* Thanks to Ms. Screen for the idea of using saved. 
	* My code is otherwise similar, asides from the fact that the way I check whether a car needs to be moved
	* To the back is bad and probably cannot be implemented well
	*/

	for (int y = 0; y < hwy.length; y++) {
		saved = hwy[y][hwy[0].length - 1];

		for (int x = hwy[0].length - 1; x > 0; x--) {
			hwy[y] = hwy[y][x - 1];
		}

		hwy[y][0] = saved;
	}
}

public void moveAllForward() {
	for (int y = 0; y < hwy.length; y++) {
		saved = hwy[y][hwy[0].length - 1];

		if (hwy[y][hwy[0].length - 1] == 1) {
			hwy[y][0] = 1;
		} 

		for (int x = hwy[0].length - 1; x > 0; x--) {
			if (hwy[y][x - 1] == 1) {
				hwy[y][x] = 1;
				hey[y][x - 1] = 0;
			}
		}
	}
}

public int findRemotestCity() {
	int index;
	int bigSum = 0;

	for (int x = 0; x < distances[0].length; x++) {
		int sum = 0;

		for (int y = 0; y < distances.length; y++) {
			sum += distances[y][x];
		}

		if (sum > bigSum) {
			bigSum = sum;
			index = x;
		}
	}

	return index;
}

public int findNearestCity(int i, boolean[] visited) {
	int index;
	int smallSum = 0;

	for (int x = 0; x < cityNames.size(); x++) {
		if (!visited[x]) {
			if (distances[i][x] < smallSum) {
				smallSum = distances[i][x];
				index = x;
			}
		}
	}

	return index;
}