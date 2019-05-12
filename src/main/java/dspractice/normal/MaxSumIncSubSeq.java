package dspractice.normal;

import common.CommonFunctions;

import java.util.Scanner;

public class MaxSumIncSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        String numbersStr = sc.nextLine();
        int[] array = CommonFunctions.getArrayFromString(numbersStr);
        int equilibriumPoint = getMaxSumIncSubSeqSum(array, array.length);
        System.out.println(equilibriumPoint);
    }

    private static int getMaxSumIncSubSeqSum(int[] arr, int n) {
        int i, j, max = 0;
        int msis[] = new int[n];

        /* Initialize msis values
           for all indexes */
        for (i = 0; i < n; i++)
            msis[i] = arr[i];

        /* Compute maximum sum values
           in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] &&
                        msis[i] < msis[j] + arr[i])
                    msis[i] = msis[j] + arr[i];

        /* Pick maximum of all
           msis values */
        for (i = 0; i < n; i++)
            if (max < msis[i])
                max = msis[i];

        return max;
    }
}
