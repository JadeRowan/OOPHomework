package homework;

public class SingleThreadSorting implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private Thread thr;
	private int index;
	private boolean stop = false;
	private int length;

	public SingleThreadSorting(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
		this.index = begin;
		this.length = end - begin;
	}

	public Thread getThr() {
		return thr;
	}

	public int peekElement() {
		return array[index];
	}

	public int pollElement() {
		int temp = array[index];
		check();
		return temp;
	}

	public boolean isStop() {
		return stop;
	}

	@Override
	public void run() {
		int increment = length / 2;
		while (increment >= 1) {
			int lastIndex = begin + increment;
			for (int startIndex = begin; startIndex < lastIndex; startIndex++) {
				insertionSort(array, startIndex, increment);
			}
			increment = increment / 2;
		}
	}

	public void insertionSort(int[] array, int startIndex, int increment) {

		for (int i = startIndex; i < end - 1; i += increment) {
			for (int j = Math.min(i + increment, end - 1); j - increment >= begin; j -= increment) {
				if (array[j - increment] > array[j]) {
					int tmp = array[j];
					array[j] = array[j - increment];
					array[j - increment] = tmp;
				} else {
					break;
				}
			}
		}
	}

	private void check() {
		this.index++;
		if (this.index >= this.end) {
			this.stop = true;
		}
	}

}
