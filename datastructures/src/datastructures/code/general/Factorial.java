package datastructures.code.general;

public class Factorial {

	public static void main(String[] args) {

		int n=5, factorial=1;
		System.out.println(factorialOfN(n,factorial));
		
	}

	private static int factorialOfN(int n, int factorial) {
		
		if(n>0) {
			factorial=factorial*n;
			return factorialOfN(n-1, factorial);
		}
		
		return factorial;
	}
}
