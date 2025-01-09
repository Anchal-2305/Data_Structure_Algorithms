package Leetcode;

public class Remove_Elements {
    // Method to remove all occurrences of 'val' from the array 'nums'
    public int removeElement(int[] nums, int val) {
        // Pointer to keep track of the next position for valid elements (not equal to val)
        int ptr = 0;

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to 'val', move it to the 'ptr' position
            if (nums[i] != val) {
                nums[ptr] = nums[i];  // Place the element in the current 'ptr' position
                ptr++;  // Increment the 'ptr' to move to the next position for valid elements
            }
        }

        // After the loop, 'ptr' will hold the length of the modified array without the 'val' elements
        return ptr;  // Return the new length of the array
    }

    // Main method to test the removeElement method
    public static void main(String[] args) {
        Remove_Elements solution = new Remove_Elements();  // Create an instance of the Solution class

        // Test case 1: nums = [3, 2, 2, 3], val = 3
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int newLength1 = solution.removeElement(nums1, val1);
        System.out.println("New Length: " + newLength1);  // Expected output: 2 (array becomes [2, 2])
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();  // Expected output: 2 2

        // Test case 2: nums = [0, 1, 2, 2, 3, 0, 4, 2], val = 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int newLength2 = solution.removeElement(nums2, val2);
        System.out.println("New Length: " + newLength2);  // Expected output: 5 (array becomes [0, 1, 3, 0, 4])
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();  // Expected output: 0 1 3 0 4

        // Test case 3: nums = [1, 2, 3, 4], val = 5
        int[] nums3 = {1, 2, 3, 4};
        int val3 = 5;
        int newLength3 = solution.removeElement(nums3, val3);
        System.out.println("New Length: " + newLength3);  // Expected output: 4 (array remains the same)
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();  // Expected output: 1 2 3 4

        // Test case 4: nums = [1, 1, 1], val = 1
        int[] nums4 = {1, 1, 1};
        int val4 = 1;
        int newLength4 = solution.removeElement(nums4, val4);
        System.out.println("New Length: " + newLength4);  // Expected output: 0 (array becomes [])
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength4; i++) {
            System.out.print(nums4[i] + " ");
        }
        System.out.println();  // Expected output: (empty array)
    }
}
