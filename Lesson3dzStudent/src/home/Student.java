package home;

public class Student extends Human {

	private long index;
	private String secondName;
	private String group; 

	public Student(int age, boolean sex, long index, String secondName) {
		super(age, sex);
		this.index = index;
		this.secondName = secondName;
	}

	public Student() {
		super();
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [age=" + getAge() + ", sex=" + isSex() + ", index=" + index + ", secondName=" + secondName
				+ "]";
	}

}
