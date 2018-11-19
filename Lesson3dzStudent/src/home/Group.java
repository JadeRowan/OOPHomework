package home;

import java.util.Arrays;

public class Group{

	private Student[] gr = new Student[10];

	public Group() {

	}

	public void addStudent(Student s) throws MyExeption {
		if (s == null) {
			throw new IllegalArgumentException("Null Student");
		}

		for (int i = 0; i < gr.length; i++) {
			if (this.gr[i] == null) {
				this.gr[i] = s;
				return;
			}
		}
		throw new MyExeption();

	}

	public Student[] getGr() {
		return gr;
	}

	public boolean removeStudent(long index) {
		for (int i = 0; i < gr.length; i++) {
			if (this.gr[i] != null && this.gr[i].getIndex() == index) {
				this.gr[i] = null;
				return true;
			}
		}
		return false;
	}

	public Student findStudent(String secondN) {
		for (Student someSt : gr) {
			if (someSt != null && someSt.getSecondName() == secondN) {
				return someSt;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {	    
		return "Group [gr=" + Arrays.toString(gr) + "]";
	}
}
