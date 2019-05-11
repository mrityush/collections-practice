package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 3/4/19 9:36 PM
 */
public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		int[] sortedArray = mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] mergeSort(int[] passedArray, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(passedArray, start, middle);
			mergeSort(passedArray, middle + 1, end);
			merge(passedArray, start, middle, end);
		}
		return passedArray;
	}

	private static void merge(int[] passedArray, int start, int middle, int end) {
		int[] leftArr = new int[middle - start + 1];
		int[] rightArr = new int[end - middle];
		int i = start, j = middle + 1;
		while (i <= middle) {
			leftArr[i - start] = passedArray[i];
			i++;
		}
		while (j <= end) {
			rightArr[j - (middle + 1)] = passedArray[j];
			j++;
		}/*
		for (int i = start; i < (middle - start); i++) {
			leftArr[i] = passedArray[i];
		}
		for (int i = 0; i < (end - middle + 1); i++) {
			rightArr[i] = passedArray[middle - start + i];
		}*/
		i = 0;
		j = 0;
		int k = start;
		while (i < leftArr.length && j < rightArr.length) {
			if (leftArr[i] < rightArr[j]) {
				passedArray[k] = leftArr[i];
				k++;
				i++;
			} else {
				passedArray[k] = rightArr[j];
				k++;
				j++;
			}
		}
		while (i < leftArr.length) {
			passedArray[k] = leftArr[i];
			k++;
			i++;
		}
		while (j < rightArr.length) {
			passedArray[k] = rightArr[j];
			k++;
			j++;
		}
	}


/*

	private static int[] mergeSort(int[] arrayPassed, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(arrayPassed, start, middle);
			mergeSort(arrayPassed, middle + 1, end);
			merge(arrayPassed, start, middle, end);
		}
		return arrayPassed;
	}

	private static void merge(int[] arrayPassed, int start, int middle, int end) {
		int i = start, j = middle + 1;
		int[] arr1Copy = new int[middle - start + 1];
		int[] arr2Copy = new int[end - middle];
		while (i <= middle) {
			arr1Copy[i - start] = arrayPassed[i];
			i++;
		}
		while (j <= end) {
			arr2Copy[j - (middle + 1)] = arrayPassed[j];
			j++;
		}
		int n1 = 0, n2 = 0, k = start;
		while (n1 < arr1Copy.length && n2 < arr2Copy.length) {
			if(arr1Copy[n1] > arr2Copy[n2]){
				arrayPassed[k] = arr2Copy[n2];
				n2++;
			}else {
				arrayPassed[k] = arr1Copy[n1];
				n1++;
			}
			k++;
		}
		while (n1 < arr1Copy.length){
			arrayPassed[k] = arr1Copy[n1];
			n1++;
			k++;
		}
		while (n2 < arr2Copy.length){
			arrayPassed[k] = arr2Copy[n2];
			n2++;
			k++;
		}
	}
*/


	private static int[] getArrayFromString(String numbersStr) {
		String[] numbers = numbersStr.split(" ");
		return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
	}
}
