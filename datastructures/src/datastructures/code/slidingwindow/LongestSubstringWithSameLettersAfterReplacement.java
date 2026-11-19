package datastructures.code.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithSameLettersAfterReplacement {

	public static void main(String[] args) {

		String s = "ABAB";
		int k = 2, maxFrequency = 0;

		int currentLongest = 0, beginIndex = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put(s.charAt(0), map.getOrDefault(s.charAt(0), 0) + 1);
		maxFrequency = Math.max(maxFrequency, map.get(s.charAt(0)));

		for (int i = 1; i < s.length(); i++) {

			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			maxFrequency = Math.max(maxFrequency, map.get(s.charAt(i)));

			if ((i - beginIndex + 1) - maxFrequency > k) {

				char leftChar = s.charAt(beginIndex);
				map.put(leftChar, map.get(leftChar) - 1);
				beginIndex++;
			}
			currentLongest = Math.max(currentLongest, i - beginIndex + 1);
		}

		System.out.println(currentLongest);
	}
}