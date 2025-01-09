package Leetcode;

public class Find_Minimum_in_Rotated_Sorted_Array {
    // Method to find the minimum element in a rotated sorted array
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];  // If there is only one element, return it as the minimum
        } else if (nums[0] < nums[nums.length - 1]) {
            return nums[0];  // If the array is not rotated, the minimum is the first element
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;  // Find the middle index

            // Check if the element at mid is the minimum element
            if (mid != 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];  // If nums[mid-1] > nums[mid], mid is the minimum
            }
            // Check if the element after mid is the minimum element
            else if (mid != nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];  // If nums[mid] > nums[mid+1], mid+1 is the minimum
            }
            // If the left part is sorted, the minimum is in the right part
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }
            // If the right part is sorted, the minimum is in the left part
            else {
                end = mid - 1;
            }
        }

        return -1;  // This return should never be reached since the array is guaranteed to have a minimum
    }

    // Main method to test the findMin function
    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array solution = new Find_Minimum_in_Rotated_Sorted_Array();  // Create an instance of the Solution class

        // Test case 1: A rotated sorted array where the minimum is at index 4
        int[] nums1 = {3, 4, 5, 1, 2};
        int result1 = solution.findMin(nums1);
        System.out.println("Test Case 1: " + result1);  // Expected output: 1

        // Test case 2: A rotated sorted array where the minimum is at index 0
        int[] nums2 = {11, 13, 15, 17};
        int result2 = solution.findMin(nums2);
        System.out.println("Test Case 2: " + result2);  // Expected output: 11

        // Test case 3: A sorted array without rotation, minimum is the first element
        int[] nums3 = {1, 2, 3, 4, 5};
        int result3 = solution.findMin(nums3);
        System.out.println("Test Case 3: " + result3);  // Expected output: 1

        // Test case 4: A rotated sorted array where the minimum is at index 2
        int[] nums4 = {7, 9, 11, 12, 5};
        int result4 = solution.findMin(nums4);
        System.out.println("Test Case 4: " + result4);  // Expected output: 5

        // Test case 5: A rotated sorted array with only one element
        int[] nums5 = {3};
        int result5 = solution.findMin(nums5);
        System.out.println("Test Case 5: " + result5);  // Expected output: 3
    }
}
