package home;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student vasa = new Student("Васо","Мкртчан");
		Student rem = new Student("Ремонт", "Ноутбуков");
		
		Group thoB = new Group();
		
		thoB.addStudent(rem);
		
		int remNum = thoB.findStudent(rem.getSecondName());
		int vasaNum = thoB.findStudent(vasa.getSecondName());
		
		thoB.removeStudent(remNum);
		thoB.removeStudent(vasaNum);
		
		for (int i = 0; i < args.length + 1; i++) {
			thoB.addStudent(vasa);
		}
	}

}
