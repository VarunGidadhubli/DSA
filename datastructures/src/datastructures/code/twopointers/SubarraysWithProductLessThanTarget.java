package datastructures.code.twopointers;

public class SubarraysWithProductLessThanTarget {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 10 };
		int target = 30;
		int left = 0;
		int product = 1;

		for (int right = 0; right < arr.length; right++) {

			product = product * arr[right];

			while (product >= target && left <= right) {
				product = product / arr[left];
				left++;
			}

			for (int i = right; i >= left; i--) {
				for (int j = i; j <= right; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
	}

}