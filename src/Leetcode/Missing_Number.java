package Leetcode;

public class Missing_Number {
    // Method to find the missing number in the array
    public int missingNumber(int[] nums) {
        // Step 1: Calculate the expected sum of numbers from 0 to n (inclusive)
        int range = nums.length;  // The range is the length of the array (n), so the numbers are from 0 to n.
        int actualSum = (range * (range + 1)) / 2;  // Formula for sum of first n natural numbers

        // Step 2: Calculate the sum of the elements in the given array
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];  // Sum all the elements of the array
        }

        // Step 3: The missing number is the difference between the expected sum and the current sum
        int ans = actualSum - currSum;  // The missing number
        return ans;  // Return the missing number
    }

    // Main method to test the missingNumber method
    public static void main(String[] args) {
        Missing_Number solution = new Missing_Number();  // Create an instance of the Solution class

        // Test case 1: nums = [3, 0, 1]
        int[] nums1 = {3, 0, 1};
        int result1 = solution.missingNumber(nums1);
        System.out.println(result1);  // Expected output: 2 (The missing number is 2)

        // Test case 2: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result2 = solution.missingNumber(nums2);
        System.out.println(result2);  // Expected output: 8 (The missing number is 8)

        // Test case 3: nums = [0]
        int[] nums3 = {0};
        int result3 = solution.missingNumber(nums3);
        System.out.println(result3);  // Expected output: 1 (The missing number is 1)

        // Test case 4: nums = [1, 2, 3, 4]
        int[] nums4 = {1, 2, 3, 4};
        int result4 = solution.missingNumber(nums4);
        System.out.println(result4);  // Expected output: 0 (The missing number is 0)

        // Test case 5: nums = [1, 0]
        int[] nums5 = {1, 0};
        int result5 = solution.missingNumber(nums5);
        System.out.println(result5);  // Expected output: 2 (The missing number is 2)
    }
}
