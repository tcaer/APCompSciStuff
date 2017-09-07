import java.util.Scanner;

public class CylinderTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a radius: ");
		double radius = s.nextDouble();
		System.out.print("Enter a height: ");
		double height = s.nextDouble();


		Cylinder c = new Cylinder(radius, height);

		System.out.println(c.getVolume());
	}

}