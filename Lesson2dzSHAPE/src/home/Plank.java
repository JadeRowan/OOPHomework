package home;

public class Plank {
	
	private Shape [] array = new Shape[4];
	
	
	
	public void insertShape(Shape sh, int num) {
		this.array[num - 1] = sh;
	}
	
	public void deleteShape(Shape sh, int num) {
		this.array[num - 1] = null;
	}
	
//	public void plankInfo() {
//		double area
//	}
}
