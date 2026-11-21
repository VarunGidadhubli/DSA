package datastructures.code.twopointers;

import java.util.Arrays;

public class QuadrupleSumToTarget {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 2, -1, 1, -3 }, target = 1;

		Arrays.sort(arr); // -3 -1 1 1 2 4

		int sum = 0;

		for (int i = 0; i < arr.length - 3; i++) {

			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			for (int j = i + 1; j < arr.length - 2; j++) {

				if (j > i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}

				int left = j + 1, right = arr.length - 1;

				while (left < right) {

					sum = arr[i] + arr[j] + arr[left] + arr[right];

					if (sum == target) {

						System.out.print(arr[i] + " " + arr[j] + " " + arr[left] + " " + arr[right]);
						System.out.println();
						left++;
						right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}
				}
			}
		}

	}

}