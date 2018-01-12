public class Main {

	public static void main(String[] args) {
		Triangle et = new EquilateralTriangle(12);
		Triangle rt = new RightTriangle(12);

		System.out.println(rt.getArea());
		System.out.println(et.getArea());
	}

}