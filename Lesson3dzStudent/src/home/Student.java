package home;

public class Student extends Human{
	private String firstName;
	private String secondName;
	
	public Student(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public Student() {
		super();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String getInfo() {
		String info = this.secondName + " " + this.firstName;
		return info;
	}
}
