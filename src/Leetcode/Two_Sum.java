package Leetcode;

public class Two_Sum {
    // Method to find two indices such that the numbers at those indices add up to the target value
    public int[] twoSum(int[] nums, int target) {
        // Initialize an array to hold the indices of the two numbers that sum up to the target
        int[] ans = new int[2];

        // Outer loop iterates through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Inner loop starts from the next element to avoid repeating pairs
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of nums[i] and nums[j] equals the target
                if (nums[i] + nums[j] == target) {
                    // If a valid pair is found, store their indices in the result array
                    ans[0] = i;
                    ans[1] = j;
                    // Break the inner loop as we have found the solution
                    break;
                }
            }
        }
        // Return the indices of the two numbers that sum to the target
        return ans;
    }

    // Main method to test the twoSum method
    public static void main(String[] args) {
        Two_Sum solution = new Two_Sum();  // Create an instance of the Solution class

        // Test case 1: nums = [2, 7, 11, 15], target = 9
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);  // Expected output: [0, 1]
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

        // Test case 2: nums = [3, 2, 4], target = 6
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);  // Expected output: [1, 2]
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

        // Test case 3: nums = [3, 3], target = 6
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);  // Expected output: [0, 1]
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}
