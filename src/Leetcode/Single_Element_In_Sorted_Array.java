package Leetcode;

public class Single_Element_In_Sorted_Array {
    // Method to find the single non-duplicate element in the sorted array
    public int singleNonDuplicate(int[] nums) {
        // If the array has only one element, return that element
        if (nums.length == 1) {
            return nums[0];
        }

        // Check if the first element is the non-duplicate one
        else if (nums[0] != nums[1]) {
            return nums[0];
        }

        // Check if the last element is the non-duplicate one
        else if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int start = 0;
        int end = nums.length - 1;

        // Binary search for the single non-duplicate element
        while (start <= end) {
            int mid = (start + end) / 2;

            // Check if mid is the non-duplicate element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // If mid is at an odd index
            else if (mid % 2 == 1) {
                // If the element at mid matches the element before it, move right
                if (nums[mid - 1] == nums[mid]) {
                    start = mid + 1;
                }
                // Otherwise, move left
                else {
                    end = mid - 1;
                }
            }
            // If mid is at an even index
            else {
                // If the element at mid matches the element after it, move right
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 1;
                }
                // Otherwise, move left
                else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Return -1 if no result is found (this should not happen)
    }

    // Main method to test the singleNonDuplicate function
    public static void main(String[] args) {
        Single_Element_In_Sorted_Array solution = new Single_Element_In_Sorted_Array(); // Create an instance of Solution class

        // Test Case 1: The single non-duplicate element is 3
        int[] nums1 = {1, 1, 2, 2, 3, 4, 4};
        int result1 = solution.singleNonDuplicate(nums1);
        System.out.println("Test Case 1: " + result1);  // Expected output: 3

        // Test Case 2: The single non-duplicate element is 7
        int[] nums2 = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7};
        int result2 = solution.singleNonDuplicate(nums2);
        System.out.println("Test Case 2: " + result2);  // Expected output: 7

        // Test Case 3: The single non-duplicate element is 5
        int[] nums3 = {2, 2, 3, 3, 4, 4, 5};
        int result3 = solution.singleNonDuplicate(nums3);
        System.out.println("Test Case 3: " + result3);  // Expected output: 5

        // Test Case 4: The single non-duplicate element is 99
        int[] nums4 = {10, 10, 20, 20, 30, 30, 99};
        int result4 = solution.singleNonDuplicate(nums4);
        System.out.println("Test Case 4: " + result4);  // Expected output: 99

        // Test Case 5: The single non-duplicate element is 1
        int[] nums5 = {1, 2, 2};
        int result5 = solution.singleNonDuplicate(nums5);
        System.out.println("Test Case 5: " + result5);  // Expected output: 1
    }
}
