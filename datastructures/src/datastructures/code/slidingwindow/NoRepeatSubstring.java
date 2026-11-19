package datastructures.code.slidingwindow;

import java.util.HashMap;

public class NoRepeatSubstring {

	public static void main(String args[]) {

		String s = "abcabcbb";
		int currentLongest = 0, beginIndex = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			while (map.containsKey(s.charAt(i))) {

				if (map.get(s.charAt(beginIndex)) - 1 == 0) {
					map.remove(s.charAt(beginIndex));
				} else {
					map.put(s.charAt(beginIndex), map.get(s.charAt(beginIndex)) - 1);
				}
				beginIndex++;
			}
			currentLongest = Math.max(currentLongest, i - beginIndex + 1);
			map.put(s.charAt(i), 1);
		}

		System.out.println(currentLongest);
	}
}