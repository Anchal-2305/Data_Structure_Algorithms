package Leetcode;

public class Sort_Colors {
    // Method to sort an array with 0s, 1s, and 2s in linear time O(n)
    public void sortColors(int[] nums) {
        // Initialize pointers: low points to the beginning, high points to the end, and mid will traverse the array.
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        // Traverse the array with the mid pointer
        while (mid <= high) {
            // Case 1: If nums[mid] is 0, it should be placed at the 'low' position
            if (nums[mid] == 0) {
                swap(nums, low, mid); // Swap the values at low and mid
                low++;  // Increment the low pointer since we've placed a 0
                mid++;  // Move the mid pointer to the next element

                // Case 2: If nums[mid] is 1, it's already in the correct position, so just move mid forward
            } else if (nums[mid] == 1) {
                mid++;

                // Case 3: If nums[mid] is 2, it should be placed at the 'high' position
            } else {
                swap(nums, high, mid); // Swap the values at high and mid
                high--;  // Decrease the high pointer since we've placed a 2
            }
        }
    }

    // Helper method to swap elements in the array
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method to test the sortColors function
    public static void main(String[] args) {
        Sort_Colors solution = new Sort_Colors(); // Create an instance of Solution class

        // Test Case 1: An array of mixed colors
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        System.out.println("Original Array: ");
        printArray(nums1);
        solution.sortColors(nums1);
        System.out.println("Sorted Array: ");
        printArray(nums1);  // Expected output: [0, 0, 1, 1, 2, 2]

        // Test Case 2: An array with only one color
        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Original Array: ");
        printArray(nums2);
        solution.sortColors(nums2);
        System.out.println("Sorted Array: ");
        printArray(nums2);  // Expected output: [1, 1, 1, 1]

        // Test Case 3: An array with no elements (empty array)
        int[] nums3 = {};
        System.out.println("Original Array: ");
        printArray(nums3);
        solution.sortColors(nums3);
        System.out.println("Sorted Array: ");
        printArray(nums3);  // Expected output: []

        // Test Case 4: An array with already sorted colors
        int[] nums4 = {0, 0, 1, 1, 2, 2};
        System.out.println("Original Array: ");
        printArray(nums4);
        solution.sortColors(nums4);
        System.out.println("Sorted Array: ");
        printArray(nums4);  // Expected output: [0, 0, 1, 1, 2, 2]
    }

    // Helper method to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
