public class RightTriangle extends Triangle {

	public RightTriangle(double side) {
		super(side);
	}

	public double getArea() {
		return super.side * super.side / 2;
	}

	public double getPerimeter() {
		return (2 + Math.sqrt(2.0)) * super.side;
	}

}