package datastructures.code.slidingwindow;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int arr[]= {1,2,10};
		System.out.println(calculateMaxProfit(arr));
	}

	private static int calculateMaxProfit(int arr[]) {

		int minPrice = arr[0];
		int maxProfit = 0;

		for (int i = 1; i < arr.length; i++) {

			int currentProfit = arr[i] - minPrice;

			if (currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}

			if (arr[i] < minPrice) {
				minPrice = arr[i];
			}
		}

		return maxProfit;
	}
}