package normal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 5/4/19 4:16 PM
 */
public class Kad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		int maxContSum = getMaxContSum(array, 0, array.length);
		System.out.println(maxContSum);
	}

	static int maxSum = 0;

	private static int getMaxContSum(int[] array, int start, int end) {
		if(start == end) return array[start];
		int maxSoFar = 0; int maxEndingHere = 0;
		for (int i = 0; i < end; i++) {
			maxEndingHere = maxEndingHere + array[i];
			if(maxEndingHere < 0) maxEndingHere = 0;

			if(maxSoFar < maxEndingHere) maxSoFar = maxEndingHere;
		}
		return maxSoFar;
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
