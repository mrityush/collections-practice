package collectionspractice.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MissingNumbersInASequence {
	public List<Integer> findDisappearedNumbers(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(arr.c);
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] != (i + 1)){
				int numAtIndex = arr[i];
				arr[i] = arr[arr[i] - 1];
				arr[arr[i] - 1] = numAtIndex;
			}
		}
		System.out.println(Arrays.toString(arr));
		return list;
		// List<Integer> intList = new LinkedList<>();
		// for(int i = 0 ; i < arr.length ; i++){
		//     if(arr[i] != (i+1))
		//        intList.add(i+1);
		// }
		// return intList;
	}

	public static void main(String[] args) {
		MissingNumbersInASequence missingNumbersInASequence = new MissingNumbersInASequence();
		missingNumbersInASequence.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
	}
}