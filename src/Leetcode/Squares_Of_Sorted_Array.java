package Leetcode;

import java.util.Arrays;

public class Squares_Of_Sorted_Array {
    // Method to return an array of the squares of each number from nums[], sorted in non-decreasing order
    public int[] sortedSquares(int[] nums) {
        // Step 1: Initialize an array to store the result
        int[] ans = new int[nums.length];

        // Step 2: Set pointers for the start and end of the input array
        int start = 0;  // Start pointer
        int end = nums.length - 1;  // End pointer
        int ptr = ans.length - 1;  // Pointer for the 'ans' array, starting from the last index

        // Step 3: Iterate while the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Calculate the square of the values at the start and end pointers
            int ss = nums[start] * nums[start];  // Square of the number at the start
            int es = nums[end] * nums[end];  // Square of the number at the end

            // Step 4: Compare the squares of the numbers at the start and end pointers
            if (ss > es) {
                // If the square at the start is larger, store it in the current position of 'ans' and move the start pointer
                ans[ptr] = ss;
                start++;
            } else {
                // If the square at the end is larger, store it in the current position of 'ans' and move the end pointer
                ans[ptr] = es;
                end--;
            }
            ptr--;  // Move the pointer for 'ans' backwards
        }

        // Step 5: Return the sorted squares array
        return ans;
    }

    // Main method to test the sortedSquares method
    public static void main(String[] args) {
        Squares_Of_Sorted_Array solution = new Squares_Of_Sorted_Array();  // Create an instance of the Solution class

        // Test case 1: nums = [-4, -1, 0, 3, 10]
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = solution.sortedSquares(nums1);
        System.out.println("Sorted Squares: " + Arrays.toString(result1));  // Expected output: [0, 1, 9, 16, 100]

        // Test case 2: nums = [-7, -3, 2, 3, 11]
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = solution.sortedSquares(nums2);
        System.out.println("Sorted Squares: " + Arrays.toString(result2));  // Expected output: [9, 9, 49, 121, 121]

        // Test case 3: nums = [-1, 0, 1]
        int[] nums3 = {-1, 0, 1};
        int[] result3 = solution.sortedSquares(nums3);
        System.out.println("Sorted Squares: " + Arrays.toString(result3));  // Expected output: [0, 1, 1]

        // Test case 4: nums = [0, 0, 0, 0]
        int[] nums4 = {0, 0, 0, 0};
        int[] result4 = solution.sortedSquares(nums4);
        System.out.println("Sorted Squares: " + Arrays.toString(result4));  // Expected output: [0, 0, 0, 0]

        // Test case 5: nums = [-2, -2, 2, 2]
        int[] nums5 = {-2, -2, 2, 2};
        int[] result5 = solution.sortedSquares(nums5);
        System.out.println("Sorted Squares: " + Arrays.toString(result5));  // Expected output: [4, 4, 4, 4]
    }
}
