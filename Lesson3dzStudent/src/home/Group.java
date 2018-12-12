package home;

import java.util.ArrayList;
//import java.io.*;
import java.util.Arrays;

import javax.swing.JOptionPane;

import exeption.NegativeExeption;

public class Group implements Voencom {
	
	private String name;
	private ArrayList <Student> stArray;

	public Group(String name) {
		super();
		this.name = name;
		this.stArray = new ArrayList<Student>();

	}

	public Group() {
		this.stArray = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStArray() {
		return stArray;
	}

	public void interactiveAddStudent() throws MyExeption {
		int age = inputAge();
		boolean sex = inputSex();
		long index = inputIndex();
		String secondName = inputSecondName();

		Student iSt = new Student(age, sex, index, secondName);
		this.addStudent(iSt);

	}
	
	
	private int inputAge() {
		int age = 0;
		for (;;) {
			try {
				age = Integer.valueOf(JOptionPane.showInputDialog("Input Age"));
				if (age <= 0) {
					throw new NegativeExeption();
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				age = 0;
				JOptionPane.showMessageDialog(null, "Cansel");
				break;
			} catch (NegativeExeption e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return age;

	}

	private boolean inputSex() {
		int sex = 0;
		for (;;) {
			try {
				sex = Integer.valueOf(JOptionPane.showInputDialog("Input sex (0 - Female. 1 - Male)"));
				if (sex < 0) {
					throw new NegativeExeption();
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				sex = 0;
				JOptionPane.showMessageDialog(null, "Cansel");
				break;
			} catch (NegativeExeption e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		if (sex > 0) {
			return true;
		}
		return false;
	}

	private String inputSecondName() {
		String secondName = "";
		for (;;) {
			try {
				secondName = String.valueOf(JOptionPane.showInputDialog("Input Second Name"));
				if (secondName.equals("")) {
					throw new NegativeExeption();
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				secondName = "";
				JOptionPane.showMessageDialog(null, "Cansel");
				break;
			} catch (NegativeExeption e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return secondName;
	}

	private long inputIndex() {
		long index = 0;
		for (;;) {
			try {
				index = Long.valueOf(JOptionPane.showInputDialog("Input Index"));
				if (index <= 0) {
					throw new NegativeExeption();
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				index = 0;
				JOptionPane.showMessageDialog(null, "Cansel");
				break;
			} catch (NegativeExeption e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return index;
	}

	public void addStudent(Student stud) throws MyExeption {
		if (stud == null) {
			throw new IllegalArgumentException("Null Student");
		}
		if(stArray.size() <= 10) {
			stArray.add(stud);
			stud.setGroup(name);
			return;
		}
//		for (int i = 0; i < stArray.length; i++) {
//			if (this.stArray[i] == null) {
//				this.stArray[i] = s;
//				s.setGroup(this.name);
//				return;
//			}
//		}
		throw new MyExeption();

	}

	public boolean removeStudent(long index) {
		
		for (int i = 0; i < stArray.size(); i++) {
			
			if (stArray.get(i) != null && this.stArray.get(i).getIndex() == index) {
				stArray.remove(i);
				return true;
			}
		}
		return false;
	}

	public Student findStudent(String secondN) {
		for (Student someSt : stArray) {
			if (someSt != null && someSt.getSecondName() == secondN) {
				return someSt;
			}
		}
		return null;
	}

	public int nullCompare(Student sOne, Student sTwo) {
		if (sOne != null && sTwo == null) {
			return -1;
		}
		if (sOne == null && sTwo != null) {
			return 1;
		}
		return 0;
	}

	public int compareStudent(Student sOne, Student sTwo, int param) {
		if (sOne != null && sTwo != null) {
			switch (param) {
			case 1:
				return String.valueOf(sOne.getAge()).compareTo(String.valueOf(sTwo.getAge()));
			case 2:
				return String.valueOf(sOne.isSex()).compareTo(String.valueOf(sTwo.isSex()));
			case 3:
				return String.valueOf(sOne.getIndex()).compareTo(String.valueOf(sTwo.getIndex()));
			case 4:
				return sOne.getSecondName().compareTo(sOne.getSecondName());
			}
		}
		return nullCompare(sOne, sTwo);
	}

	public String sortStudent(int param) {
		Student temp;
		for (int i = stArray.size() - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (compareStudent(stArray.get(j), stArray.get(j + 1), param) > 0) {
					temp = stArray.get(j);
					stArray.set(j, stArray.get(j + 1));
					stArray.set(j + 1, temp);
				}
			}
		}
		return "Group [name=" + name + " stArray=" + stArray + "]";
	}

	public boolean isSoldier(Student student) {
		if (student != null && student.isSex() && student.getAge() > 18) {
			return true;
		}
		return false;
	}

	@Override
	public Student[] getMilitaryList() {

		int counter = 0;
		for (Student student : stArray) {
			if (isSoldier(student)) {
				counter += 1;
			}
		}
		Student[] result = new Student[counter];
		int temp = 0;
		for (Student student : stArray) {
			if (isSoldier(student)) {
				result[temp] = student;
				temp += 1;
			}
		}
		return result;
	}

	public String toString() {
		Student temp;
		String text = "";
		for (int i = stArray.size() - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (compareStudent(stArray.get(j), stArray.get(j + 1), 4) > 0) {
					temp = stArray.get(j);
					stArray.set(j, stArray.get(j + 1));
					stArray.set(j + 1, temp);
				}
			}
		}
		for (Student student : stArray) {
			if (student != null) {
				text += student.getSecondName();
				text += System.lineSeparator();
			}
		}
		return "Group name: " + name + System.lineSeparator() + text;
	}
}
