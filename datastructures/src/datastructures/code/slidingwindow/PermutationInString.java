package datastructures.code.slidingwindow;

import java.util.HashMap;

public class PermutationInString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "lecabee";

		System.out.println(doesPermutationExist(s1, s2));
	}

	private static boolean doesPermutationExist(String s1, String s2) {

		// Frequency map of s1
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}

		int left = 0;

		// Sliding window
		for (int right = 0; right < s2.length(); right++) {

			int windowSize = right - left + 1;

			if (windowSize == s1.length()) {

				// Create frequency map for current window
				HashMap<Character, Integer> windowMap = new HashMap<>();

				for (int i = left; i <= right; i++) {
					windowMap.put(s2.charAt(i), windowMap.getOrDefault(s2.charAt(i), 0) + 1);
				}

				// Compare required characters with current window
				if (map.equals(windowMap)) {
					return true;
				}

				// Slide window
				left++;
			}
		}

		return false;
	}
}