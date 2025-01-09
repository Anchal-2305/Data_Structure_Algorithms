package Leetcode;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {
    // Method to calculate the product of all elements except the current element for each index
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;  // Get the length of the input array
        int[] right = new int[n];  // Array to store the product of elements to the right of each index
        int pro = 1;  // Variable to hold the running product for the right side

        // Step 1: Calculate the product of elements to the right of each index
        for (int i = n - 1; i > 0; i--) {
            pro = pro * nums[i];  // Multiply current element to the product
            right[i] = pro;  // Store the product of elements to the right of index i
        }

        // Step 2: Create the result array to store the final product for each element
        int[] ans = new int[n];
        int left = 1;  // Variable to hold the running product for the left side

        // Step 3: Calculate the product of elements to the left and right of each index
        for (int i = 0; i < n - 1; i++) {
            int val = left * right[i + 1];  // Product of elements to the left and right of index i
            ans[i] = val;  // Store the result in the answer array
            left = left * nums[i];  // Update the left product for the next index
        }

        // Step 4: Handle the last element (no right element to consider)
        ans[n - 1] = left;  // For the last element, only left product is considered

        return ans;  // Return the result array
    }

    // Main method to test the productExceptSelf method
    public static void main(String[] args) {
        Product_Of_Array_Except_Self solution = new Product_Of_Array_Except_Self();  // Create an instance of the Solution class

        // Test case 1: nums = [1, 2, 3, 4]
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println("Result for [1, 2, 3, 4]: " + Arrays.toString(result1));  // Expected: [24, 12, 8, 6]

        // Test case 2: nums = [2, 3, 4, 5]
        int[] nums2 = {2, 3, 4, 5};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println("Result for [2, 3, 4, 5]: " + Arrays.toString(result2));  // Expected: [60, 40, 30, 24]

        // Test case 3: nums = [0, 1, 2, 3]
        int[] nums3 = {0, 1, 2, 3};
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.println("Result for [0, 1, 2, 3]: " + Arrays.toString(result3));  // Expected: [6, 0, 0, 0]

        // Test case 4: nums = [1, 1, 1, 1]
        int[] nums4 = {1, 1, 1, 1};
        int[] result4 = solution.productExceptSelf(nums4);
        System.out.println("Result for [1, 1, 1, 1]: " + Arrays.toString(result4));  // Expected: [1, 1, 1, 1]

        // Test case 5: nums = [1, 2, 0, 4]
        int[] nums5 = {1, 2, 0, 4};
        int[] result5 = solution.productExceptSelf(nums5);
        System.out.println("Result for [1, 2, 0, 4]: " + Arrays.toString(result5));  // Expected: [0, 0, 8, 0]
    }
}
