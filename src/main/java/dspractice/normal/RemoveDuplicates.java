package dspractice.normal;

public class RemoveDuplicates {
	public static void main(String[] args) {
//		int arr[] = {1};
		int arr[] = {0, 1, 2, 2, 3, 4, 20};
		RemoveDuplicates removeOneElementInArray = new RemoveDuplicates();
		System.out.println(removeOneElementInArray.removeDuplicates(arr));
	}

	public int removeDuplicates(int[] nums) {
		if(nums.length == 1 && nums[0] == 1) return 1;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && (count + i) < nums.length) {
				moveToLast(nums, i, nums.length - 1);
				i--;
				count++;
			}
		}
		return nums.length - count;
	}

	private void moveToLast(int[] nums, int currIndex, int lastIndex) {
		int tmp = nums[currIndex];
		if (lastIndex - currIndex >= 0) System.arraycopy(nums, currIndex + 1, nums, currIndex, lastIndex - currIndex);
		nums[lastIndex] = tmp;
	}
}
