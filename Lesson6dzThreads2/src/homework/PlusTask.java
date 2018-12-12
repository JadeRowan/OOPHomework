package homework;

public class PlusTask implements Runnable{
	int[] workArray;
	int part;
	int result;
	public PlusTask(int[] workArray, int part) {
		super();
		this.workArray = workArray;
		this.part = part;
		this.result = 0;
	}

	@Override
	public void run() {
		for (int i = part * 1000000; i < (part + 1) *1000000; i++) {
			result += workArray[i];
		}
		ThreadSum.submitResult(result);
	}

}
