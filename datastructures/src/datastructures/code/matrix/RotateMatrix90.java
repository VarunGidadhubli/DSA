package datastructures.code.matrix;

public class RotateMatrix90 {

	public static void main(String[] args) {

		int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		int[][] transpose = new int[3][3];
		
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix[i].length;j++) {
				
				transpose[j][i]=matrix[i][j];
			}
		}
		
		for(int i=0;i<transpose.length;i++) {
			
			for(int j=0,k=transpose[i].length-1;j<k;j++,k--) {
				
				int temp=transpose[i][j];
				transpose[i][j]=transpose[i][k];
				transpose[i][k]=temp;
				
			}
		}
		
		for(int i=0;i<transpose.length;i++) {

			for(int j=0;j<transpose[i].length;j++) {

				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}