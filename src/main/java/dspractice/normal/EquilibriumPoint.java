package dspractice.normal;

import common.CommonFunctions;

import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        String numbersStr = sc.nextLine();
        int[] array = CommonFunctions.getArrayFromString(numbersStr);
        int equilibriumPoint = getEquilibriumPoint(array);
        System.out.println(equilibriumPoint);
    }

    private static int getEquilibriumPoint(int[] passedArray) {
        int l = passedArray.length;
        int equilibriumPoint = 0;
        // later
        return equilibriumPoint;
    }
}
