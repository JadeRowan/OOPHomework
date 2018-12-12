package homework;

public class MultiThreadPlusing {
	public int sum(int[] array, int threadNumber) {
		SingleThreadPlusing[] threadarray = new SingleThreadPlusing[threadNumber];
		for (int i = 0; i < threadarray.length; i++) {
			int size = array.length / threadNumber;
			int begin = size * i;
			int end = ((i + 1) * size);
			if ((array.length - end) < size) {
				end = array.length;
			}
			threadarray[i] = new SingleThreadPlusing(array, begin, end);
		}
		for (int i = 0; i < threadarray.length; i++) {
			try {
				threadarray[i].getThr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		return mergeThreads(threadarray);
	}

	private static int mergeThreads(SingleThreadPlusing[] threadarray) {
		int sum = 0;
		for (SingleThreadPlusing thread : threadarray) {
			sum += thread.getResult();
		}
		return sum;
	}
}
