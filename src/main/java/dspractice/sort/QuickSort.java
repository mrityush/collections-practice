package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 3/4/19 9:36 PM
 */
public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		int[] sortedArray = quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] quickSort(int[] arrayPassed, int start, int end) {
		if (start < end) {
			int pivot = partitionArr(arrayPassed, start, end);
			System.out.println("=======" + pivot + "======");
			System.out.println("1. " + Arrays.toString(arrayPassed));
			quickSort(arrayPassed, start, pivot - 1);
			System.out.println("2. " + Arrays.toString(arrayPassed));
			quickSort(arrayPassed, pivot + 1, end);
			System.out.println("3. " + Arrays.toString(arrayPassed));
		}
		return arrayPassed;
	}

	/**
	 * pivot = last index (can be any index actually)
	 * we run loop to put any element less than pivot to initial half.
	 * <p>
	 * //	 * @param arrayPassed
	 * //	 * @param start
	 * //	 * @param end
	 *
	 * @return
	 */
	private static int partitionArr(int[] arrayPassed, int start, int end) {
		int partitionIndex = start;
		for (int i = start; i < end; i++) {
			if (arrayPassed[i] <= arrayPassed[end]) {
				swap(arrayPassed, i, partitionIndex);
				partitionIndex += 1;
			}
			System.out.print(start + " == " + end + " == " + partitionIndex + ", " + "||" +Arrays.toString(arrayPassed) + "||");
		}
		swap(arrayPassed, partitionIndex, end);
		System.out.println("");
		return partitionIndex;
	}

	private static int[] getArrayFromString(String numbersStr) {
		String[] numbers = numbersStr.split(" ");
		return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
	}


	private static void swap(int[] arrayPassed, int id1, int id2) {
		int tmp = arrayPassed[id1];
		arrayPassed[id1] = arrayPassed[id2];
		arrayPassed[id2] = tmp;
	}

}
