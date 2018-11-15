package home;

public class Triangle extends Shape {

	Point a;
	Point b;
	Point c;

	public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
		super();
		this.a = new Point(aX, aY);
		this.b = new Point(bX, bY);
		this.c = new Point(cX, cY);
	}

	public Triangle() {
		super();
	}

	@Override
	public double getPerimetr() {
		double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
		double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
		double ac = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));

		return (ab + bc + ac);
	}

	@Override
	public double getArea() {
		double square = 0.5 * Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY()) 
				- (b.getX() - c.getX()) * (a.getY() - c.getY()));
		return square;
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
