package Leetcode;

public class Increasing_Triplet_Subsequence {
    // Method to check if there exists an increasing triplet subsequence
    public boolean increasingTriplet(int[] nums) {
        // Initialize three variables to store the potential values for the triplet
        // first, second, and third, all set to maximum values initially.
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];  // Current element in the array

            // If the current element is smaller than or equal to the first, update first
            if (first >= ele) {
                first = ele;
            }
            // If the current element is smaller than or equal to second, update second
            else if (second >= ele) {
                second = ele;
            }
            // If the current element is greater than both first and second, we have found the triplet
            else {
                third = ele;  // Update third
                return true;  // Return true as we found a valid increasing triplet
            }
        }

        // Return false if no increasing triplet was found
        return false;
    }

    // Main method to test the increasingTriplet function
    public static void main(String[] args) {
        Increasing_Triplet_Subsequence solution = new Increasing_Triplet_Subsequence();  // Create an instance of Solution

        // Test case 1: nums = [1, 2, 3, 4, 5]
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 1: " + solution.increasingTriplet(nums1));  // Expected output: true

        // Test case 2: nums = [5, 4, 3, 2, 1]
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 2: " + solution.increasingTriplet(nums2));  // Expected output: false

        // Test case 3: nums = [2, 1, 5, 0, 4, 6]
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println("Test Case 3: " + solution.increasingTriplet(nums3));  // Expected output: true

        // Test case 4: nums = [1, 1, 1, 1, 1]
        int[] nums4 = {1, 1, 1, 1, 1};
        System.out.println("Test Case 4: " + solution.increasingTriplet(nums4));  // Expected output: false

        // Test case 5: nums = [3, 2, 1]
        int[] nums5 = {3, 2, 1};
        System.out.println("Test Case 5: " + solution.increasingTriplet(nums5));  // Expected output: false
    }
}
