package Leetcode;

import java.util.Arrays;

public class Two_Sum_II {
    // Method to find two numbers in a sorted array that add up to a given target
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2]; // Array to store the indices of the two numbers
        int start = 0; // Start pointer at the beginning of the array
        int end = numbers.length - 1; // End pointer at the end of the array

        // Step 1: Iterate while the start pointer is less than the end pointer
        while (start < end) {
            int sum = numbers[start] + numbers[end]; // Calculate the sum of the numbers at the start and end

            // Step 2: Check if the sum equals the target
            if (sum == target) {
                // If the sum is equal to the target, return the 1-based indices
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            } else if (sum > target) {
                // If the sum is greater than the target, move the end pointer to the left
                end--;
            } else {
                // If the sum is less than the target, move the start pointer to the right
                start++;
            }
        }

        // Step 3: Return the answer (indices). If no valid pair is found, the array will remain unmodified.
        return ans;
    }

    // Main method to test the twoSum method
    public static void main(String[] args) {
        Two_Sum_II solution = new Two_Sum_II(); // Create an instance of the Solution class

        // Test case 1: numbers = [2, 7, 11, 15], target = 9
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(numbers1, target1);
        System.out.println("Indices: " + Arrays.toString(result1));  // Expected output: [1, 2]

        // Test case 2: numbers = [1, 2, 3, 4, 6], target = 10
        int[] numbers2 = {1, 2, 3, 4, 6};
        int target2 = 10;
        int[] result2 = solution.twoSum(numbers2, target2);
        System.out.println("Indices: " + Arrays.toString(result2));  // Expected output: [4, 5]

        // Test case 3: numbers = [-1, 0], target = -1
        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] result3 = solution.twoSum(numbers3, target3);
        System.out.println("Indices: " + Arrays.toString(result3));  // Expected output: [1, 2]

        // Test case 4: numbers = [1, 3, 5, 7], target = 12
        int[] numbers4 = {1, 3, 5, 7};
        int target4 = 12;
        int[] result4 = solution.twoSum(numbers4, target4);
        System.out.println("Indices: " + Arrays.toString(result4));  // Expected output: [3, 4]

        // Test case 5: numbers = [1, 2, 3, 4, 5, 6], target = 10
        int[] numbers5 = {1, 2, 3, 4, 5, 6};
        int target5 = 10;
        int[] result5 = solution.twoSum(numbers5, target5);
        System.out.println("Indices: " + Arrays.toString(result5));  // Expected output: [4, 6]
    }
}
