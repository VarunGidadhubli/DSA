package datastructures.code.slidingwindow;

public class PermutationsOfAString {

	public static void main(String[] args) {
		findPermutations("abc", "");
	}

	public static void findPermutations(String remaining, String result) {

		if (remaining.isEmpty()) {
			System.out.print(result + " ");
			return;
		}

		for (int i = 0; i < remaining.length(); i++) {

			char selected = remaining.charAt(i);
			String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
			findPermutations(newRemaining, result + selected);
		}
	}

}