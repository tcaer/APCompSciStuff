import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a radius: ");
		double radius = s.nextDouble();

		Circle circle = new Circle(radius);

		System.out.println(circle.getArea());
	}

}