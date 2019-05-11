package dspractice.normal;

import common.CommonFunctions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        String numbersStr = sc.nextLine();
        System.out.println("Enter Desired sum");
        Integer desiredSum = sc.nextInt();
        int[] array = CommonFunctions.getArrayFromString(numbersStr);
        int[] subArray = getSubArrayGivenSum(array, desiredSum);
        System.out.println(Arrays.toString(subArray));
    }

    private static int[] getSubArrayGivenSum(int[] passedAray, int sum) {
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        int n = passedAray.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum += passedAray[i];
            hashMap.put(cur_sum, i);
            if (cur_sum == sum) {
                start = 0;
                end = i;
            }
            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
            }
        }
        System.out.println(hashMap + " - " + start + " - " + end);
        return Arrays.copyOfRange(passedAray, start, end + 1);
    }
}

/*
// Java program to print subarray with sum as given sum
import java.util.*;

class GFG {

	public static void subArraySum(int[] arr, int n, int sum) {
		//cur_sum to keep track of cummulative sum till that point
		int cur_sum = 0;
		int start = 0;
		int end = -1;
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			cur_sum = cur_sum + arr[i];
			//check whether cur_sum - sum = 0, if 0 it means
			//the sub array is starting from index 0- so stop
			if (cur_sum - sum == 0) {
				start = 0;
				end = i;
				break;
			}
			//if hashMap already has the value, means we already
			// have subarray with the sum - so stop
			if (hashMap.containsKey(cur_sum - sum)) {
				start = hashMap.get(cur_sum - sum) + 1;
				end = i;
				break;
			}
			//if value is not present then add to hashmap
			hashMap.put(cur_sum, i);

		}
		// if end is -1 : means we have reached end without the sum
		if (end == -1) {
			System.out.println("No subarray with given sum exists");
		} else {
			System.out.println("Sum found between indexes "
							+ start + " to " + end);
		}

	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = {10, 2, -2, -20, 10};
		int n = arr.length;
		int sum = -10;
		subArraySum(arr, n, sum);

	}
}

 */