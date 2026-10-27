package datastructures.code.arrays;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, 3};

        int[] result = new int[arr.length];

        // Step 1: Store product of everything to the LEFT
        int leftProduct = 1;

        for (int i = 0; i < arr.length; i++) {

            result[i] = leftProduct;

            leftProduct = leftProduct * arr[i];
        }

        // Step 2: Multiply by product of everything to the RIGHT
        int rightProduct = 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            result[i] = result[i] * rightProduct;

            rightProduct = rightProduct * arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}