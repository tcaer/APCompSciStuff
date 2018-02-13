public class Point implements Place {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int distance(Place other) {
		int otherX = other.getX();
		int otherY = other.getY();

		return (int)Math.sqrt(Math.pow((double)Math.abs(this.x - otherX), 2.0) + Math.pow((double)Math.abs(this.y - otherY), 2.0));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}