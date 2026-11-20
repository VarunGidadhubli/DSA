package datastructures.code.twopointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 2, 3 };
		int target = 3;

		int result = threeSumSmaller(nums, target);

		System.out.println("Number of triplets: " + result);
	}

	public static int threeSumSmaller(int[] nums, int target) {

		Arrays.sort(nums);

		int count = 0;

		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {

				int sum = nums[i] + nums[left] + nums[right];

				if (sum < target) {

					count += right - left;
					left++;

				} else {

					right--;
				}
			}
		}

		return count;
	}
}
