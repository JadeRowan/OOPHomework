package home;

public class Cat {
	private String color;
	private boolean hungry;
	private static String sleepTime = "day";
	private int size;
	private String name;
	
	public Cat(String color, boolean hungry, int size, String name) {
		super();
		this.color = color;
		this.hungry = hungry;
		this.size = size;
		this.name = name;
	}

	public Cat() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public static String getSleepTime() {
		return sleepTime;
	}

	public static void setSleepTime(String sleepTime) {
		Cat.sleepTime = sleepTime;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void petTheCat() {
		if(this.hungry) {
			System.out.println("^-_-^ Кусь!");
		}else {
			System.out.println("^_^ Pur pur pur!");
		}
	}
	
	public void voice() {
		System.out.println("Nya nyakova neronya nyako nya!");
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", hungry=" + hungry + ", size=" + size + ", name=" + name + "]";
	}
		
}
