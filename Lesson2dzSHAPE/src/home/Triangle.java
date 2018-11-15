package home;

public class Triangle extends Shape {

	Point a;
	Point b;
	Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}

	@Override
	public double getPerimetr() {
		double per = a.distance(b) + b.distance(c) + c.distance(a);
		return per;
	}
	
	

	@Override
	public double getArea() {
		double p = getPerimetr()/2;
		double area = Math.sqrt(p * (p - a.distance(b)) * (p - b.distance(c)) * (p - c.distance(a)));
		return area;
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
