package home;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr1 = new Triangle(5.0, 8.0, 11.0);
		Triangle tr2 = new Triangle(2.5, 2.5, 2.5);
		Triangle tr3 = new Triangle(7.0, 8.0, 9.0);
		Triangle tr4 = new Triangle(16.6, 7.9, 13.3);

		System.out.println(tr1.findSquare());
		System.out.println(tr2.findSquare());
		System.out.println(tr3.findSquare());
		System.out.println(tr4.findSquare());
	}

}
