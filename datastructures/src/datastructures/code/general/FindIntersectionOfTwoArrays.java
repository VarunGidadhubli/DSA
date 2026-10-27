package datastructures.code.general;

import java.util.HashSet;

public class FindIntersectionOfTwoArrays {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<Integer>();

        // Add all elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Check which elements from arr2 exist in arr1
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}