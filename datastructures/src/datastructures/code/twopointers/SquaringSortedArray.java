package datastructures.code.twopointers;

public class SquaringSortedArray {

	public static void main(String[] args) {

		int[] arr = { -2, -1, 0, 2, 3 };
		int sortedArr[]=sortArray(arr);
		
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
	}

	public static int[] sortArray(int arr[]) {

		int start=0, end=arr.length-1;
		int[] result = new int[arr.length];
		
		while(start<=end) {
			
			int startSquare = arr[start]*arr[start];
			int endSquare = arr[end]*arr[end];
			
			if(startSquare>endSquare) {
				
				result[end]=startSquare;
				start++;
				end--;
			}else {
				result[end]=endSquare;
				end--;
			}
		}
		
		return result;
	}
}