package home;

public class Student extends Human implements Comparable {

	private long index;
	private String secondName;

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

	@Override
	public int compareTo(Object o) {
		if (o == null) {
			return -1;
		}

		Student st = (Student) o;

		return this.secondName.compareToIgnoreCase(st.getSecondName());

	}

	@Override
	public String toString() {
		return "Student [age=" + getAge() + ", sex=" + isSex() + ", index=" + index + ", secondName=" + secondName
				+ "]";
	}

}
