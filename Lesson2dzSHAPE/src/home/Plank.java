package home;

import java.util.Arrays;

public class Plank {
	
	private Shape [] array = new Shape[4];
	
	public Plank() {
		super();
	}

	public boolean insertShape(Shape sh, int num) {
		if (array[num - 1] == null) {
			array[num - 1] = sh;
			return true;
		}
		return false;
	}
	
	public boolean deleteShape(int num) {
		if (array[num - 1] != null) {
			array[num - 1] = null;
			return true;
		}
		return false;
	}
	
	public double countArea() {
		double area = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				area += array[i].getArea();
			}
		}
		return area;
	}

	@Override
	public String toString() {
		String text = "";
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				text += array[i].toString();
			}else {
				text += "<empty>";
			}
			text += System.lineSeparator();
		}
		text += System.lineSeparator();
		text += countArea();
		return text;
	}
	
	
}
