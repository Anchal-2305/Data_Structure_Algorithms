package Leetcode;

public class Maximum_Subarray {
    // Method to find the maximum sum of a contiguous subarray
    public int maxSubArray(int[] nums) {
        // Initialize currsum and max to the first element of the array
        int currsum = nums[0];  // Current subarray sum
        int max = nums[0];      // Maximum subarray sum found so far

        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If adding the current element to the current subarray sum is greater than the element itself,
            // then include the current element in the subarray, otherwise start a new subarray from the current element.
            if (currsum + nums[i] > nums[i]) {
                currsum += nums[i];  // Add the current element to the subarray
            } else {
                currsum = nums[i];   // Start a new subarray with the current element
            }
            // Update the max value if the current subarray sum is greater than the previous max
            max = Math.max(max, currsum);
        }

        // Return the maximum subarray sum
        return max;
    }

    // Main method to test the maxSubArray function
    public static void main(String[] args) {
        Maximum_Subarray solution = new Maximum_Subarray(); // Create an instance of Solution class

        // Test Case 1: An array with a mix of positive and negative numbers
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums1));  // Expected output: 6 (subarray [4, -1, 2, 1])

        // Test Case 2: An array with all negative numbers
        int[] nums2 = {-1, -2, -3, -4};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums2));  // Expected output: -1 (only one element)

        // Test Case 3: An array with all positive numbers
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums3));  // Expected output: 15 (subarray [1, 2, 3, 4, 5])

        // Test Case 4: An array with a single element
        int[] nums4 = {7};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums4));  // Expected output: 7 (only one element)

        // Test Case 5: An array with all zeros
        int[] nums5 = {0, 0, 0, 0, 0};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums5));  // Expected output: 0 (subarray [0])

        // Test Case 6: An array with alternating positive and negative numbers
        int[] nums6 = {1, -2, 3, -4, 5, -6, 7};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums6));  // Expected output: 7 (subarray [7])

    }
}
