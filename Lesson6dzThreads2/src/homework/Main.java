package homework;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int proc = Runtime.getRuntime().availableProcessors();

		Random random = new Random();
		int[] randomIntArray = new int[3000000];
		for (int i = 0; i < 3000000; i++) {
			randomIntArray[i] = random.nextInt(10000);
		}
		MultiThreadPlusing mtp = new MultiThreadPlusing();
		long tstart = System.currentTimeMillis();
		int sum = mtp.sum(randomIntArray, proc);
		long tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + " - MultiThread sort: " + sum);

		int mainResult = 0;
		long mstart = System.currentTimeMillis();
		for (int i = 0; i < randomIntArray.length; i++) {
			mainResult += randomIntArray[i];
		}
		long mend = System.currentTimeMillis();
		System.out.println((mend - mstart) + " ms" + " - MainThread sort: " + mainResult);
	}

}
