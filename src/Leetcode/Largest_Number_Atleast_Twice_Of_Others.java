package Leetcode;

public class Largest_Number_Atleast_Twice_Of_Others {
    // Method to find the index of the dominant number in the array
    public int dominantIndex(int[] nums) {
        int max = -1;       // Variable to store the maximum number in the array
        int smax = -1;      // Variable to store the second maximum number in the array
        int maxIdx = 0;     // Variable to store the index of the maximum number

        // Iterate through the array to find the maximum and second maximum numbers
        for (int i = 0; i < nums.length; i++) {
            // If current number is greater than the max, update max and second max
            if (max < nums[i]) {
                smax = max;  // Update second max
                max = nums[i];  // Update max
                maxIdx = i;  // Store index of the new max
            }
            // If the current number is between max and second max, update second max
            else if (smax < nums[i]) {
                smax = nums[i];  // Update second max
            }
        }

        // Check if the largest number is at least twice as large as the second largest
        if (smax * 2 <= max) {
            return maxIdx;  // If true, return the index of the max
        } else {
            return -1;  // If not, return -1 indicating no dominant number
        }
    }

    // Main method to test the dominantIndex function
    public static void main(String[] args) {
        Largest_Number_Atleast_Twice_Of_Others solution = new Largest_Number_Atleast_Twice_Of_Others();  // Create an instance of the Solution class

        // Test case 1: nums = [3, 6, 1, 0]
        int[] nums1 = {3, 6, 1, 0};
        int result1 = solution.dominantIndex(nums1);
        System.out.println("Result for nums1: " + result1);  // Expected output: 1 (index of 6)

        // Test case 2: nums = [1, 2, 3, 4]
        int[] nums2 = {1, 2, 3, 4};
        int result2 = solution.dominantIndex(nums2);
        System.out.println("Result for nums2: " + result2);  // Expected output: -1 (no dominant index)

        // Test case 3: nums = [0, 0, 3, 2]
        int[] nums3 = {0, 0, 3, 2};
        int result3 = solution.dominantIndex(nums3);
        System.out.println("Result for nums3: " + result3);  // Expected output: 2 (index of 3)

        // Test case 4: nums = [10, 5, 3, 2]
        int[] nums4 = {10, 5, 3, 2};
        int result4 = solution.dominantIndex(nums4);
        System.out.println("Result for nums4: " + result4);  // Expected output: 0 (index of 10)
    }
}
