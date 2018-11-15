package home;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("gray", false, 2, "Murka");
		Cat cat2 = new Cat("red", true, 5, "Puk");
		
		cat1.voice();
		
		cat2.petTheCat();
		
		if(cat1.isHungry() || cat2.isHungry()) {
			cat1.setHungry(false);
			cat2.setHungry(false);
		}
		
		Cat.setSleepTime("now");
		
		cat2.petTheCat();
		cat1.petTheCat();
		
	}

}
