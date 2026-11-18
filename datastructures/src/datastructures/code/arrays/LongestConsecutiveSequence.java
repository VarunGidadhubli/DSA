package datastructures.code.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int arr[] = {0, 3, 2, 5, 4, 6, 1, 1};

        int maxSequence = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int counter = 1;
                int currentBegin = num;

                while (set.contains(currentBegin + 1)) {
                    counter++;
                    currentBegin++;
                }

                maxSequence = Math.max(maxSequence, counter);
            }
        }

        System.out.println(maxSequence);
    }
}