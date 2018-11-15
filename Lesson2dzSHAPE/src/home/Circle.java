package home;

public class Circle extends Shape {
	
	private Point a;
	private Point b;
	private double r;
	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
		this.r = a.distance(b);
	}
	
	public Circle() {
		super();
	}
	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPerimetr() {
		return 2.0 * this.r * Math.PI;
	}
	
	public double getArea() {
		return Math.pow(this.r, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + ", r=" + r + "]";
	}
	
}
