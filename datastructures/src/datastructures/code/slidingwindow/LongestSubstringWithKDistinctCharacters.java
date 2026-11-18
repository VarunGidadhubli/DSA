package datastructures.code.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCharacters {

	public static void main(String[] args) {

		String str = "araaci";
		int k = 2;
		int beginIndex = 0, currentLongest = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

			while (map.size() > k) {

				if(map.get(str.charAt(beginIndex))-1==0) {
					map.remove(str.charAt(beginIndex));
				}else {
					map.put(str.charAt(beginIndex), map.get(str.charAt(beginIndex)) - 1);
				}
				beginIndex++;
			}
			currentLongest = Math.max(currentLongest, i - beginIndex+1);
		}
		System.out.println(currentLongest);
	}

}