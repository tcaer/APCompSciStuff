public class Test {

	public static void main(String[] args) {
		Place p1 = new Point(0, 0);
		Place p2 = new Point(-3, -4);
		Place p3 = new Point(3, 4);

		System.out.println(sameDistance(p1, p2, p3));
	}

	public static boolean sameDistance(Place p1, Place p2, Place p3) {
		return p1.distance(p2) == p1.distance(p3);
	}

}