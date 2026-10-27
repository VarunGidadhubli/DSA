package datastructures.code.general;

public class SumOfDigits {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		
		System.out.println(sumOfDigits(arr,0,0));
		
	}
	
	private static int sumOfDigits(int arr[], int index, int sum) {
		
		if(index==arr.length)
			return sum;
		
		sum=sum+arr[index];
		return sumOfDigits(arr, index+1, sum);
	}
}
