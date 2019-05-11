package normal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 5/4/19 12:01 AM
 */
public class MaxIncreasingSubSeq {

	static int maxRef = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		int count = getCount(array, 0, array.length - 1);
		System.out.println(maxRef);
	}

	private static int getCount(int[] array, int start, int end) {
		if (end == 1) return 1;
		int maxEndinghere = 1, nextLayerCount ;
		for (int i = 1; i < end; i++) {
			nextLayerCount = getCount(array, start, i);
			if(array[i-1] < array[end - 1] && nextLayerCount + 1 > maxEndinghere){
				maxEndinghere = nextLayerCount + 1;
			}
		}
		if(maxRef < maxEndinghere) maxRef = maxEndinghere;
		return maxEndinghere;
	}


	private static int[] getArrayFromString(String numbersStr) {
		String[] numbers = numbersStr.split(" ");
		return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
	}
//static int max_ref; // stores the LIS
//
//	/* To make use of recursive calls, this function must return
//	two things:
//	1) Length of LIS ending with element arr[n-1]. We use
//	   max_ending_here for this purpose
//	2) Overall maximum as the LIS may end with an element
//	   before arr[n-1] max_ref is used this purpose.
//	The value of LIS of full array of size n is stored in
//	*max_ref which is our final result */
//	static int _lis(int arr[], int n)
//	{
//		// base case
//		if (n == 1)
//			return 1;
//
//		// 'max_ending_here' is length of LIS ending with arr[n-1]
//		int res, max_ending_here = 1;
//
//        /* Recursively get all LIS ending with arr[0], arr[1] ...
//           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and
//           max ending with arr[n-1] needs to be updated, then
//           update it */
//		for (int i = 1; i < n; i++)
//		{
//			res = _lis(arr, i);
//			if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
//				max_ending_here = res + 1;
//		}
//
//		// Compare max_ending_here with the overall max. And
//		// update the overall max if needed
//		if (max_ref < max_ending_here)
//			max_ref = max_ending_here;
//
//		// Return length of LIS ending with arr[n-1]
//		return max_ending_here;
//	}
//
//	// The wrapper function for _lis()
//	static int lis(int arr[], int n)
//	{
//		// The max variable holds the result
//		max_ref = 1;
//
//		// The function _lis() stores its result in max
//		_lis( arr, n);
//
//		// returns max
//		return max_ref;
//	}
//
//	// driver program to test above functions
//	public static void main(String args[])
//	{
//		int arr[] = { 9, 5, 8, 3, 0, 8, -6 };
////		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
//		int n = arr.length;
//		System.out.println("Length of lis is "
//				+ lis(arr, n) + "\n");
//	}
}
