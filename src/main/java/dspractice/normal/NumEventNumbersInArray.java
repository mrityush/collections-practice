package dspractice.normal;

public class NumEventNumbersInArray {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			int numDigits = getNumDigits(num);
			if (numDigits % 2 == 0)
				count++;
		}
		return count;
	}

	public int getNumDigits(int num) {
		int count = 0;
		while (num >= 10) {
			count++;
			num = (int) (num / 10);
		}
		return count + 1;
	}

	public static void main(String[] args) {
		NumEventNumbersInArray numEventNumbersInArray = new NumEventNumbersInArray();
		System.out.println(numEventNumbersInArray.findNumbers(new int[]{12, 345, 2, 6, 7896}));
	}
}
