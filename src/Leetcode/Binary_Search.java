package Leetcode;

public class Binary_Search {
    // Method to perform binary search on a sorted array to find the target
    public int search(int[] nums, int target) {
        // Initialize start and end pointers
        int start = 0;
        int end = nums.length - 1;

        // Perform binary search while start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Find the middle index
            int mid = (start + end) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target) {
                return mid;  // Return the index if the target is found
            }
            // If the target is greater than the middle element, move the start pointer to the right
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            // If the target is smaller than the middle element, move the end pointer to the left
            else {
                end = mid - 1;
            }
        }
        return -1;  // Return -1 if the target is not found in the array
    }

    // Main method to test the search function
    public static void main(String[] args) {
        Binary_Search solution = new Binary_Search();  // Create an instance of Solution

        // Test case 1: nums = [1, 2, 3, 4, 5], target = 3
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 1: " + solution.search(nums1, 3));  // Expected output: 2 (index of 3)

        // Test case 2: nums = [1, 2, 3, 4, 5], target = 6
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 2: " + solution.search(nums2, 6));  // Expected output: -1 (target not found)

        // Test case 3: nums = [10, 20, 30, 40, 50], target = 40
        int[] nums3 = {10, 20, 30, 40, 50};
        System.out.println("Test Case 3: " + solution.search(nums3, 40));  // Expected output: 3 (index of 40)

        // Test case 4: nums = [2, 4, 6, 8, 10], target = 2
        int[] nums4 = {2, 4, 6, 8, 10};
        System.out.println("Test Case 4: " + solution.search(nums4, 2));  // Expected output: 0 (index of 2)

        // Test case 5: nums = [1, 3, 5, 7, 9], target = 5
        int[] nums5 = {1, 3, 5, 7, 9};
        System.out.println("Test Case 5: " + solution.search(nums5, 5));  // Expected output: 2 (index of 5)
    }
}
