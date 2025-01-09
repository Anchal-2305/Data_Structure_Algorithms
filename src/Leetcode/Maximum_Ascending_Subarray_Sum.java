package Leetcode;

public class Maximum_Ascending_Subarray_Sum {
    // Method to calculate the maximum ascending sum in the array
    public int maxAscendingSum(int[] nums) {
        // Initialize variables: max holds the overall maximum ascending sum,
        // currmax tracks the current ascending sum.
        int max = nums[0];
        int currmax = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is greater than the previous element,
            // it forms an ascending sequence, so add it to the current sum.
            if (nums[i - 1] < nums[i]) {
                currmax = currmax + nums[i];
            }
            // If the sequence breaks, compare and update the max sum,
            // and reset currmax to the current element (start a new sequence).
            else {
                max = Math.max(max, currmax);
                currmax = nums[i];
            }
        }

        // After the loop, we need to compare the last sequence sum (currmax)
        // with the max value since the longest ascending sequence might be at the end.
        max = Math.max(max, currmax);
        return max;  // Return the maximum ascending sum found
    }

    // Main method to test the maxAscendingSum function
    public static void main(String[] args) {
        Maximum_Ascending_Subarray_Sum solution = new Maximum_Ascending_Subarray_Sum();  // Create an instance of Solution

        // Test case 1: nums = [10, 20, 30, 5, 10, 50]
        int[] nums1 = {10, 20, 30, 5, 10, 50};
        System.out.println("Test Case 1: " + solution.maxAscendingSum(nums1));  // Expected output: 65 (sum of [10, 20, 30])

        // Test case 2: nums = [10, 20, 30, 40, 50]
        int[] nums2 = {10, 20, 30, 40, 50};
        System.out.println("Test Case 2: " + solution.maxAscendingSum(nums2));  // Expected output: 150 (sum of [10, 20, 30, 40, 50])

        // Test case 3: nums = [5, 4, 3, 2, 1]
        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 3: " + solution.maxAscendingSum(nums3));  // Expected output: 5 (single largest element)

        // Test case 4: nums = [1, 100, 200, 300, 2, 4, 7]
        int[] nums4 = {1, 100, 200, 300, 2, 4, 7};
        System.out.println("Test Case 4: " + solution.maxAscendingSum(nums4));  // Expected output: 600 (sum of [100, 200, 300])

        // Test case 5: nums = [1, 2, 3, 4, 5]
        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 5: " + solution.maxAscendingSum(nums5));  // Expected output: 15 (sum of [1, 2, 3, 4, 5])
    }
}
