package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * practice
 * Mrityunjaya@infoedge
 * 5/4/19 10:45 AM
 */
public class MaxIncSubSeq {

	static int[] maxArr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array");
		String numbersStr = sc.nextLine();
		int[] array = getArrayFromString(numbersStr);
		maxArr = new int[array.length];
		int maxIncSubSeqCount = getMaxIncSubSeq(array, array.length);
		if (maxIncSubSeqCount == 1) maxArr = array;
		System.out.println(Arrays.toString(maxArr) + "- " + maxIncSubSeqCount);
	}

	private static int getMaxIncSubSeq(int[] passedArray, int arrLength) {
		if (arrLength == 1) return 1;
		return lic(passedArray, 0, arrLength);
	}

	private static int lic(int[] passedArray, int indx, int arrLength) {
		if (arrLength == 1) {
			maxArr[indx - 1] = passedArray[indx - 1];
			return 1;
		}
		int licArrTmp;
		int maxArrLen = 1;
		for (int i = 1; i < arrLength; i++) {
//			System.out.println(i + "<==>" + arrLength);
			licArrTmp = lic(passedArray, arrLength, i);
			if(maxArrLen == 3) System.out.println(licArrTmp + " - here  - " + i + " - " + maxArrLen);
			if (passedArray[i - 1] < passedArray[arrLength - 1] && licArrTmp >= maxArrLen) {
				maxArrLen = licArrTmp + 1;
				maxArr[i-1] = passedArray[i-1];
//				System.out.println(arrLength + " - " + Arrays.toString(maxArr) + "=====" + i + "--" + maxArrLen);
			}else {
				passedArray[i - 1] = 0;
			}
		}

		return maxArrLen;

//		int res = 0, maxFromIndexToLength = 1;
//		for (int i = 0; i < arrLength; i++) {
//			res = lic(passedArray, i);
//			if (passedArray[i] > passedArray[arrLength - 1] && res + 1 > maxFromIndexToLength) {
//				maxFromIndexToLength = res + 1;
//			}
//		}
//		if (maxCount < maxFromIndexToLength) maxCount = maxFromIndexToLength;
//		return maxFromIndexToLength;
	}

	private static int[] getArrayFromString(String numbersStr) {
		String[] numbers = numbersStr.split(" ");
		return Arrays.stream(numbers).mapToInt(Integer::valueOf).toArray();
	}


}
