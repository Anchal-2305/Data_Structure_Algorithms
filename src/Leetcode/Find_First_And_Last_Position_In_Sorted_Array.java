package Leetcode;

public class Find_First_And_Last_Position_In_Sorted_Array {
    // Method to find the range of indices of a target value in a sorted array
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};  // Initialize the result array with default values (-1, -1)

        if (nums.length == 0) {  // If the input array is empty, return the default answer
            return ans;
        }

        // Find the first occurrence and last occurrence of the target in the array
        ans[0] = firstOccurrence(nums, target);
        ans[1] = lastOccurrence(nums, target);

        return ans;  // Return the range of indices
    }

    // Helper method to find the first occurrence of the target using binary search
    public int firstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;  // Default answer when the target is not found

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid;  // Found target, record the index
                end = mid - 1;  // Continue to search for earlier occurrences
            } else if (target > nums[mid]) {
                start = mid + 1;  // Target is larger, search in the right half
            } else {
                end = mid - 1;  // Target is smaller, search in the left half
            }
        }
        return ans;  // Return the index of the first occurrence
    }

    // Helper method to find the last occurrence of the target using binary search
    public int lastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;  // Default answer when the target is not found

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid;  // Found target, record the index
                start = mid + 1;  // Continue to search for later occurrences
            } else if (target > nums[mid]) {
                start = mid + 1;  // Target is larger, search in the right half
            } else {
                end = mid - 1;  // Target is smaller, search in the left half
            }
        }
        return ans;  // Return the index of the last occurrence
    }

    // Main method to test the functionality of searchRange
    public static void main(String[] args) {
        Find_First_And_Last_Position_In_Sorted_Array solution = new Find_First_And_Last_Position_In_Sorted_Array();  // Create an instance of the Solution class

        // Test case 1: nums = [5, 7, 7, 8, 8, 10], target = 8
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] result1 = solution.searchRange(nums1, 8);
        System.out.println("Test Case 1: [" + result1[0] + ", " + result1[1] + "]");
        // Expected output: [3, 4] (the target 8 appears at indices 3 and 4)

        // Test case 2: nums = [1, 2, 3, 3, 3, 4, 5], target = 3
        int[] nums2 = {1, 2, 3, 3, 3, 4, 5};
        int[] result2 = solution.searchRange(nums2, 3);
        System.out.println("Test Case 2: [" + result2[0] + ", " + result2[1] + "]");
        // Expected output: [2, 4] (the target 3 appears at indices 2, 3, and 4)

        // Test case 3: nums = [1, 2, 3, 4, 5], target = 6
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] result3 = solution.searchRange(nums3, 6);
        System.out.println("Test Case 3: [" + result3[0] + ", " + result3[1] + "]");
        // Expected output: [-1, -1] (the target 6 is not in the array)

        // Test case 4: nums = [1, 1, 1, 1, 1], target = 1
        int[] nums4 = {1, 1, 1, 1, 1};
        int[] result4 = solution.searchRange(nums4, 1);
        System.out.println("Test Case 4: [" + result4[0] + ", " + result4[1] + "]");
        // Expected output: [0, 4] (the target 1 appears at all indices from 0 to 4)

        // Test case 5: nums = [1, 2, 3, 4, 5], target = 0
        int[] nums5 = {1, 2, 3, 4, 5};
        int[] result5 = solution.searchRange(nums5, 0);
        System.out.println("Test Case 5: [" + result5[0] + ", " + result5[1] + "]");
        // Expected output: [-1, -1] (the target 0 is not in the array)
    }
}
