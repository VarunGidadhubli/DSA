package datastructures.code.general;

public class PermutationsOfString {

	public static void main(String[] args) {

		String s="abcd";
		printPermutations(s,"");
	}
	
	private static void printPermutations(String remaining, String chosen) {
		
		if(remaining.length()==0) {
			System.out.println(chosen);
			return;
		}
		
		for(int i=0;i<remaining.length();i++) {
			
			char currentChar=remaining.charAt(i);
			String newChosen=chosen+currentChar;
			String newRemaining=remaining.substring(0,i)+remaining.substring(i+1);
			printPermutations(newRemaining, newChosen);
		}
	}

}