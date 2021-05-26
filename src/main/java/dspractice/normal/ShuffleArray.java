package dspractice.normal;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/
public class ShuffleArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		ShuffleArray shuffleArray = new ShuffleArray();
		System.out.println(Arrays.toString(shuffleArray.shuffle(arr)));
	}

	private int[] shuffle(int[] arr) {
		int[] newArr = new int[arr.length];
		int counter = 0;
		List<Integer> list = new LinkedList<>();
		for (int i : arr) list.add(i);
		Collections.shuffle(list);
		for (int i : list) {
			newArr[counter++] = i;
		}
		return newArr;
	}
}
