package dspractice.normal;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 */
public class AddDoubleZeros {

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
		AddDoubleZeros addDoubleZeros = new AddDoubleZeros();
		addDoubleZeros.duplicateZeros(arr);
	}

	public void duplicateZeros(int[] arr) {
		int[] dup = new int[arr.length];
		int counter = 0;
		for (int j : arr) {
			if (counter < arr.length) {
				if (j == 0) {
					dup[counter++] = 0;
					if (counter < arr.length)
						dup[counter++] = 0;
				} else {
					dup[counter++] = j;
				}
			}
		}
		System.arraycopy(dup, 0, arr, 0, dup.length);
	}
}
