package common;

import java.util.Arrays;

public interface CommonFunctions {


    public static void swap(int[] arrayPassed, int id1, int id2) {
        int tmp = arrayPassed[id1];
        arrayPassed[id1] = arrayPassed[id2];
        arrayPassed[id2] = tmp;
    }

    public static int[] getArrayFromString(String numbersStr) {
        String[] numbers = numbersStr.split(" ");
        return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
    }

}
