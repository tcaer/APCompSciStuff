public abstract class Triangle {

  public double side;

  public Triangle(double side) {
    this.side = side;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  public double getRatio() {
    return getArea()/getPerimeter();
  }

}