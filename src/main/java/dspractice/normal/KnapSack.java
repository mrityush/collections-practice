package normal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 10/4/19 10:30 PM
 */

/**
 * Given weights and values of n items, put these items in a knapsack of capacity W
 * to get the maximum total value in the knapsack. In other words, given two integer
 * arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated
 * with n items respectively. Also given an integer W which represents knapsack
 * capacity, find out the maximum value subset of val[] such that sum of the
 * weights of this subset is smaller than or equal to W. You cannot break an
 * item, either pick the complete item, or don’t pick it (0-1 property).
 */
public class KnapSack {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter denomination array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		System.out.println("Enter weight array");
		String numbersStr2 = sc.nextLine();
		int[] array2 = getArrayFromString(numbersStr);
		int maxContSum = executeKnapSack(array, 0, array.length);
		System.out.println(maxContSum);
	}

	private static int executeKnapSack(int[] array, int start, int length) {
		return 0;
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
