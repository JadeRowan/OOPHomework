package homework;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i++) {
			FactTask factTask = new FactTask(i);
			Thread fThread = new Thread(factTask);
			fThread.start();
		}
		
		
	}
	
	


}
