package common;

class Solution {
	public int[] sortArrayByParity(int[] arr) {
		int swapIndex = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i]  % 2 == 1){
				swapIndex = i;
			}else{
				swapNumbers(arr, swapIndex, i);
				swapIndex++;
			}
		}
		System.out.println(arr);
		return arr;
	}
	private void swapNumbers(int[] arr, int i, int j){
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}

	public static void main(String[] args){
		Solution solution = new Solution();
		solution.sortArrayByParity(new int[]{3, 1, 2, 4});
	}
}
