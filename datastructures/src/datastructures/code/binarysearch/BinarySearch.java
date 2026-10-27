package datastructures.code.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[]= {-1,0,2,4,6,8},target = 4;
		System.out.println(doesNumberExist(arr,target));
	}

	private static int doesNumberExist(int arr[], int target) {
		
		int left=0,right=arr.length-1;
		
		while(left<=right) {
			
			int mid=arr[left]+arr[right]/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>target) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		
		return -1;
	}
}