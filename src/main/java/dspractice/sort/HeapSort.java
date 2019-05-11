package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 3/4/19 9:36 PM
 */
public class HeapSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		int[] sortedArray = heapSort(array);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] heapSort(int[] passedArray) {
		int length = passedArray.length;
		for (int i = length / 2 - 1; i >= 0; i--) {
			createMaxHeap(passedArray, length, i);
		}

		for (int i = length - 1; i >= 0; i--) {
			swap(passedArray, i, 0);
			createMaxHeap(passedArray, i, 0);
		}
		return passedArray;
	}
//	private static int[] heapSort(int[] arrayPassed) {
//		int length = arrayPassed.length;
//		for (int i = length / 2 - 1; i >= 0; i--)
//			createMaxHeap(arrayPassed, length, i);
//
//		for (int i = length - 1; i >= 0; i--) {
//			System.out.println(Arrays.toString(arrayPassed) + " - " + i);
//			swap(arrayPassed, 0, i);
//			System.out.println(Arrays.toString(arrayPassed) + " - " + i);
//			createMaxHeap(arrayPassed, i, 0);
//		}
//		return arrayPassed;
//	}

	private static void createMaxHeap(int[] passedArray, int length, int index) {
		int largestValueIndex = index;
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
		if (leftChildIndex < length && passedArray[leftChildIndex] > passedArray[largestValueIndex]) {
//			swap(passedArray, leftChildIndex, largestValueIndex);
			largestValueIndex = leftChildIndex;
		}
		if (rightChildIndex < length && passedArray[rightChildIndex] > passedArray[largestValueIndex]) {
//			swap(passedArray, rightChildIndex, largestValueIndex);
			largestValueIndex = rightChildIndex;
		}
		if (largestValueIndex != index) {
			swap(passedArray, largestValueIndex, index);
			createMaxHeap(passedArray, length, largestValueIndex);
		}
	}

//
//	private static void createMaxHeap(int[] arrayPassed, int arrLength, int index) {
//		int passedLargestIndx = index;
//		int left = index * 2 + 1;
//		int right = index * 2 + 2;
//		if (left < arrLength && arrayPassed[left] > arrayPassed[passedLargestIndx]) {
//			passedLargestIndx = left;
//		}
//		if (right < arrLength && arrayPassed[right] > arrayPassed[passedLargestIndx]) {
//			passedLargestIndx = right;
//		}
//		if (passedLargestIndx != index) {
//			swap(arrayPassed, passedLargestIndx, index);
//			createMaxHeap(arrayPassed, arrLength, passedLargestIndx);
//		}
//	}

	private static void swap(int[] arrayPassed, int id1, int id2) {
		int tmp = arrayPassed[id1];
		arrayPassed[id1] = arrayPassed[id2];
		arrayPassed[id2] = tmp;
	}

	private static int[] getArrayFromString(String numbersStr) {
		String[] numbers = numbersStr.split(" ");
		return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
	}

//	public class Heap {
//		Heap left;
//		Heap right;
//		int data;
//	}
}
/*public class HeapSort
{
	public void sort(int arr[])
	{
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i=n-1; i>=0; i--)
		{
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2*i + 1; // left = 2*i + 1
		int r = 2*i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i)
		{
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

// A utility function to print array of size n

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[])
	{
		int arr[] = {12, 11, 13, 5, 6, 7};
		int n = arr.length;

		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
	}
}*/
