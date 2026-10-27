package datastructures.code.general;

public class RotateAnArrayRight {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5}, noOfRotations=2;
		
		for(int i=0;i<noOfRotations;i++) {
			
			int temp=arr[arr.length-1];//5
			
			for(int j=arr.length-1;j>0;j--) {
				
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}