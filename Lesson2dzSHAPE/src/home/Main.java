package home;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(3.14 , 4.2);
		Point b = new Point(7.4, 1.33);
		Point c = new Point(-1.5, 0);
		
		Triangle trOne = new Triangle(a,b,c);
		Circle crOne = new Circle(a,b);
		Circle crTwo = new Circle(b,c);
		Circle crThree = new Circle(a,c);
		
		Plank pl = new Plank();
		
		System.out.println(pl.toString());
		
		System.out.println(pl.insertShape(trOne, 1));
		System.out.println(pl.insertShape(crOne, 2));
		System.out.println(pl.insertShape(crTwo, 3));
		System.out.println(pl.insertShape(crThree, 4));
		
		System.out.println(pl.toString());
		
		pl.deleteShape(2);
		pl.deleteShape(4);
		
		System.out.println(pl.toString());
	}

}
