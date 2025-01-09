package Leetcode;

public class Check_if_Array_is_Sorted_Rotated {
    // Method to check if the given array can be rotated to become a non-decreasing array
    public boolean check(int[] nums) {
        int n = nums.length;  // Get the length of the array
        int count = 0;  // Initialize a count to track the number of "descends" in the array

        // Loop through the array to check each pair of consecutive elements
        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than the next element (with wrap-around using modulo)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;  // Increment the count if the current element is greater than the next
            }
        }

        // If there is more than one descent (where the array elements are decreasing), return false
        // Otherwise, return true (which means the array is already non-decreasing or can be rotated into one)
        return count <= 1;
    }

    // Main method to test the check method
    public static void main(String[] args) {
        Check_if_Array_is_Sorted_Rotated solution = new Check_if_Array_is_Sorted_Rotated();  // Create an instance of Solution

        // Test case 1: Array can be rotated to become non-decreasing
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(solution.check(nums1));  // Output: true

        // Test case 2: Array cannot be rotated to become non-decreasing
        int[] nums2 = {2, 1, 3, 4};
        System.out.println(solution.check(nums2));  // Output: false

        // Test case 3: Already non-decreasing
        int[] nums3 = {1, 2, 3, 4};
        System.out.println(solution.check(nums3));  // Output: true

        // Test case 4: Array with only one element (trivially non-decreasing)
        int[] nums4 = {1};
        System.out.println(solution.check(nums4));  // Output: true
    }
}
