package homework;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int proc = Runtime.getRuntime().availableProcessors();		
		int[] array = new int[20];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		long tstart = System.currentTimeMillis();
		sort(array);
		long tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + "- Static method sort");
		tstart = System.currentTimeMillis();
		MultiThreadSorting.sort(array2, proc);
		tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + " - MultiThread sort");
		tstart = System.currentTimeMillis();
		Arrays.sort(array3);
		tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + " - Array sort");
	}

	public static void sort (int[] arr) {
        int increment = arr.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(arr, startIndex, increment);
            }
            increment = increment / 2;
        }
    }

    public static void insertionSort (int[] arr, int startIndex, int increment) {
        for (int i = startIndex; i < arr.length - 1; i = i + increment) {
            for (int j = Math.min(i + increment, arr.length - 1); j - increment >= 0; j = j - increment) {
                if (arr[j - increment] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - increment];
                    arr[j - increment] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}
