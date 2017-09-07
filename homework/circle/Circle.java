

public class Circle {

	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

}