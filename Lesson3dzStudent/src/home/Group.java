package home;

public class Group {
	
	private Student [] gr = new Student[10];
	
	public Group() {

	}
	
	public void addStudent(Student s) {
		try {
			for (int i = 0; i < gr.length + 1; i++) {
				if(this.gr[i] == null) {
					this.gr[i] = s;
					break;
				}
			}
			
		}catch(MyExeption e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void removeStudent(int num) {
		if(num != -1 && this.gr[num - 1] != null) {
			this.gr[num - 1] = null;
		}else {
			System.out.println("Ошибка ввода");
		}
	}
	
	public int findStudent(String secondN) {
		for (int i = 0; i < this.gr.length; i++) {
			if (this.gr[i] == null) {
				continue;
			}
			String name = this.gr[i].getSecondName();
			if(name.equals(secondN)) {
				return i + 1;
			}
		}
		return -1;
	}
	
}
