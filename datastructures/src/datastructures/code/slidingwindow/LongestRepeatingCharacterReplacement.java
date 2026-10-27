package datastructures.code.slidingwindow;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

        String s = "AABBB";
        int k = 1;

        int left = 0;
        int maxFrequency = 0;
        int currentMax = 0;

        int[] frequency = new int[26];

        for (int right = 0; right < s.length(); right++) {

            // Add current character to the window
            int index = s.charAt(right) - 'A';
            frequency[index]++;

            // Find the highest frequency character
            maxFrequency = Math.max(maxFrequency, frequency[index]);

            // Check how many replacements are required
            int replacements = (right - left + 1) - maxFrequency;

            // Window is invalid
            while (replacements > k) {

                frequency[s.charAt(left) - 'A']--;

                left++;

                replacements = (right - left + 1) - maxFrequency;
            }

            // Window is valid
            currentMax = Math.max(currentMax, right - left + 1);
        }

        System.out.println(currentMax);
    }
}