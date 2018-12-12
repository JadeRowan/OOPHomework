package home;

//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student vasa = new Student(21, true, 12345678, "Мкртчан");
		Student rem = new Student(19, true, 88005553, "Ноутбуков");
		Student gera = new Student(19, false, 10101010, "Зевсова");
		Student nya = new Student(16, false, 33060309, "Котовская");

		Group thoB = new Group("КДА-702");

		thoB.addStudent(rem);

		Student remNum = thoB.findStudent(rem.getSecondName());
		Student vasaNum = thoB.findStudent(vasa.getSecondName());
		try {
		thoB.removeStudent(remNum.getIndex());
		thoB.removeStudent(vasaNum.getIndex());
		}catch (NullPointerException e) {
			System.out.println("Null Student");
		}
		try {
			for (int i = 0; i < 2; i++) {
				thoB.addStudent(vasa);
				thoB.addStudent(rem);
				thoB.addStudent(gera);
				thoB.addStudent(nya);
			}
		} catch (MyExeption e) {
			System.out.println(e.getMessage());
		}
		
		thoB.removeStudent(vasa.getIndex());
		thoB.removeStudent(nya.getIndex());
		
		thoB.interactiveAddStudent();
		System.out.println(thoB.toString());
		Student [] voenList = thoB.getMilitaryList();
		for (Student st : voenList) {
		    System.out.println(st.getSecondName());
		}    
	}

}
