package homework;

public class ThreadSum {
	private static int callCounter = 0;
	private static int sum = 0;
	
	public static void submitResult(int result) {
		callCounter += 1;
		sum += result;
		if (callCounter == 3) {
			System.out.println("Multy Thread work is sucses, result is "+sum);
		}
	}
	
}
