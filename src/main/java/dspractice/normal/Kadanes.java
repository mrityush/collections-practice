package dspractice.normal;

import common.CommonFunctions;

import java.util.*;

public class Kadanes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        String numbersStr = sc.nextLine();
        int[] array = CommonFunctions.getArrayFromString(numbersStr);
        int maxSum = getMaxSum(array);
        System.out.println(maxSum);
    }

    private static int getMaxSum(int[] passedArray) {
        int l = passedArray.length;
        int maxTillNow = 0, max = 0;
        List<Integer> elements = new LinkedList<>();
        for (int i = 0; i < l; i++) {
            maxTillNow += passedArray[i];
            if (maxTillNow < 0) {
                maxTillNow = 0;
                if (i < l - 1) {
                    elements = new LinkedList<>();
                }
            } else {
                elements.add(passedArray[i]);
            }
            if (max < maxTillNow) {
                max = maxTillNow;
            }
        }
        System.out.println(elements);
        return max;
    }
}