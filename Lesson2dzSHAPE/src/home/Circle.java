package home;

public class Circle extends Shape {
	
	private Point a;
	private Point b;
	private double r;
	public Circle(double aX, double aY, double bX, double bY) {
		super();
		this.a = new Point(aX, aY);
		this.b = new Point(bX, bY);
		this.r = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
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
