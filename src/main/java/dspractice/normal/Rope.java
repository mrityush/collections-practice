package normal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 6/4/19 3:52 PM
 */
public class Rope {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array");
		String arr = scanner.nextLine();
		int[] array = getArrayFromString(arr);
		int maxSumRope = (int) getRopeMaxSum(array);
		System.out.println("maxSum = " + maxSumRope);
	}

	private static int sumOverall = 0;

	private static int getRopeMaxSum(int[] arr) {
		heapify(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			int sum = arr[0] + arr[1];
			sumOverall += sum;
			arr[0] = 0;
			arr[1] = sum;
//			swap(arr, arr.length - 1, 0);
			shiftZerosToRight(arr);
			heapify(arr, arr.length);
			System.out.println(sumOverall + "-" + Arrays.toString(arr));

		}
		return sumOverall;
	}

	private static void shiftZerosToRight(int[] arr) {
		int reachedIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				while (reachedIndex != arr.length - 1) {
					swap(arr, reachedIndex, reachedIndex + 1);
					reachedIndex++;
				}
			}
		}
	}

	private static void heapify(int[] arr, int end) {
		for (int i = 0; i < end / 2 - 1; i++) {
			createHeap(arr, arr.length, i);
		}
	}

	/**
	 * min heap
	 *
	 * @param arr
	 * @param length
	 * @param index
	 */
	private static void createHeap(int[] arr, int length, int index) {
		int smallestIndex = index;
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		if (left < length && arr[left] != 0 && arr[smallestIndex] > arr[left]) {
			swap(arr, smallestIndex, left);
			smallestIndex = left;
		}
		if (right < length && arr[right] != 0 && arr[smallestIndex] > arr[right]) {
			swap(arr, smallestIndex, right);
			smallestIndex = right;
		}
		if (smallestIndex != index) {
			createHeap(arr, length, smallestIndex);
		}

	}

	private static int[] getArrayFromString(String arr) {
		String[] numbers = arr.split(" ");
		return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
	}


	private static void swap(int[] arrayPassed, int id1, int id2) {
		int tmp = arrayPassed[id1];
		arrayPassed[id1] = arrayPassed[id2];
		arrayPassed[id2] = tmp;
	}
}
