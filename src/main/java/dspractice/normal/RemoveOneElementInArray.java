package dspractice.normal;

public class RemoveOneElementInArray {

	public static void main(String[] args) {
		int arr[] = {1};
//		int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};
		RemoveOneElementInArray removeOneElementInArray = new RemoveOneElementInArray();
		System.out.println(removeOneElementInArray.removeElement(arr, 1));
	}

	public int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				moveToLast(nums, i, nums.length - 1);
				if ((nums[i] == val) && (count + i) < nums.length) {
					i--;
					count++;
				}
			}
		}
		return nums.length - count;
	}

	private void moveToLast(int[] nums, int currIndex, int lastIndex) {
		int tmp = nums[currIndex];
		for (int i = currIndex; i < lastIndex; i++) {
			nums[i] = nums[i + 1];
		}
		nums[lastIndex] = tmp;
	}
}
