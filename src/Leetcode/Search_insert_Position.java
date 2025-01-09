package Leetcode;

public class Search_insert_Position {
    // Method to find the position to insert the target in the sorted array.
    public int searchInsert(int[] nums, int target) {
        int start = 0;  // Initialize the start pointer to the beginning of the array
        int end = nums.length - 1;  // Initialize the end pointer to the last index of the array

        // Perform binary search to find the correct insert position or target
        while (start <= end) {
            int mid = (start + end) / 2;  // Calculate the middle index

            // If the target is found at the mid index, return that index
            if (nums[mid] == target) {
                return mid;
            }
            // If the target is greater than the mid element, move the start pointer right
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            // If the target is smaller than the mid element, move the end pointer left
            else {
                end = mid - 1;
            }
        }

        // If target is not found, return the index where it should be inserted
        return start;
    }

    // Main method to test the searchInsert function
    public static void main(String[] args) {
        Search_insert_Position solution = new Search_insert_Position();  // Create an instance of the Solution class

        // Test case 1: The target exists in the array
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = solution.searchInsert(nums1, target1);
        System.out.println("Test Case 1: " + result1);  // Expected output: 2 (target 5 is at index 2)

        // Test case 2: The target is less than the first element
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 0;
        int result2 = solution.searchInsert(nums2, target2);
        System.out.println("Test Case 2: " + result2);  // Expected output: 0 (insert 0 at index 0)

        // Test case 3: The target is greater than the last element
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int result3 = solution.searchInsert(nums3, target3);
        System.out.println("Test Case 3: " + result3);  // Expected output: 4 (insert 7 at index 4)

        // Test case 4: The target needs to be inserted between elements
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 2;
        int result4 = solution.searchInsert(nums4, target4);
        System.out.println("Test Case 4: " + result4);  // Expected output: 1 (insert 2 at index 1)

        // Test case 5: The target exists at the beginning of the array
        int[] nums5 = {1, 3, 5, 6};
        int target5 = 1;
        int result5 = solution.searchInsert(nums5, target5);
        System.out.println("Test Case 5: " + result5);  // Expected output: 0 (target 1 is at index 0)
    }
}
