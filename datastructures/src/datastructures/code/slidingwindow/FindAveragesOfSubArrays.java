package datastructures.code.slidingwindow;

public class FindAveragesOfSubArrays {

	public static void main(String[] args) {
		
		int arr[]= {1, 3, 2, 6, -1, 4, 1, 8, 2}, k=5;
		
		int windowSum=0;
	
		for(int i=0;i<k;i++) {
			
			windowSum=windowSum+arr[i];
		}
		
		for(int i=0;i<=arr.length-k;i++) {
			
			System.out.print((double)windowSum/k+", ");
			
			if(i<arr.length-k) {
				windowSum=windowSum-arr[i];
				windowSum=windowSum+arr[i+k];
			}
		}
		
	}

}