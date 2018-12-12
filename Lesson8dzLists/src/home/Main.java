package home;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		Integer lastOne = 0;
		for (int i = 0; i < 10; i++) {
			a.add((Integer) i);
			lastOne = i;
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a.remove(a.lastIndexOf(lastOne)));
	}

}
