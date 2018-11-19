package home;

public class Human {
	
	private int age;
	private boolean sex;
	
	public Human(int age, boolean sex) {
		super();
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", sex=" + sex + "]";
	}

}
