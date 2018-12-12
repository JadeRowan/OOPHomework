package homework;

public class SingleThreadPlusing implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private Thread thr;
	private int result;

	public SingleThreadPlusing(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
		this.result = 0;
	}

	public Thread getThr() {
		return thr;
	}

	@Override
	public void run() {
		for (int i = begin; i < end; i++) {
			result += array[i];
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
