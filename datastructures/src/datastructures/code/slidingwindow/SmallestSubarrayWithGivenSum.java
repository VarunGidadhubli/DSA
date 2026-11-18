package datastructures.code.slidingwindow;

public class SmallestSubarrayWithGivenSum {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 5, 2, 3, 2 }, sum = 7, smallestSubArray = Integer.MAX_VALUE, currentSum = 0;
		int beginIndex = 0;

		for (int i = 0; i < arr.length; i++) {

			currentSum = currentSum + arr[i];

			while (currentSum >= sum) {

				smallestSubArray = Math.min(smallestSubArray, i - beginIndex+1);
				currentSum=currentSum-arr[beginIndex];
				beginIndex++;

			}

		}
		
		System.out.println(smallestSubArray);
	}
}