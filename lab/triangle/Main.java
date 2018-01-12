public class Main {

	public static void main(String[] args) {
		Triangle et = new EquilateralTriangle(12);
		Triangle rt = new RightTriangle(12);

		System.out.println((2 * et.getArea())/et.getPerimeter());
		System.out.println((2 * rt.getArea())/rt.getPerimeter());
		System.out.println("The right triangle can hold a bigger circle");
	}

}