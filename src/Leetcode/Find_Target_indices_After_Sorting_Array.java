package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_Target_indices_After_Sorting_Array {
    // Method to find the indices of the target element in a sorted array
    public List<Integer> targetIndices(int[] nums, int target) {
        // Initialize variables
        int num = 0; // This keeps track of how many numbers are less than target
        int tcount = 0; // This counts how many times the target appears in the array

        // Iterate through the array to count the number of elements less than target
        // and how many times target appears
        for (int ele : nums) {
            if (ele == target) {
                tcount++;  // Increment the target count if the current element is the target
            } else if (ele < target) {
                num++;  // Increment num if the current element is less than target
            }
        }

        // Initialize the result list that will store the indices of target
        List<Integer> ans = new ArrayList<>();

        // While there are still occurrences of the target left
        while (tcount > 0) {
            // Add the current index to the answer list
            ans.add(num);
            num++;  // Move to the next index where the target might be
            tcount--;  // Decrease the target count
        }

        return ans;  // Return the list of target indices
    }

    // Main method to test the targetIndices method
    public static void main(String[] args) {
        Find_Target_indices_After_Sorting_Array solution = new Find_Target_indices_After_Sorting_Array();  // Create an instance of Solution class

        // Test Case 1: Typical case with numbers before and after target
        int[] nums1 = {1, 2, 5, 2, 3, 4, 5};
        int target1 = 5;
        System.out.println("Indices of target 5: " + solution.targetIndices(nums1, target1));
        // Expected output: [4, 5]

        // Test Case 2: Case where target is not present
        int[] nums2 = {1, 2, 3, 4, 5};
        int target2 = 6;
        System.out.println("Indices of target 6: " + solution.targetIndices(nums2, target2));
        // Expected output: []

        // Test Case 3: Case with multiple targets in the middle
        int[] nums3 = {1, 2, 2, 2, 3, 4};
        int target3 = 2;
        System.out.println("Indices of target 2: " + solution.targetIndices(nums3, target3));
        // Expected output: [1, 2, 3]

        // Test Case 4: Edge case with a single element array
        int[] nums4 = {5};
        int target4 = 5;
        System.out.println("Indices of target 5: " + solution.targetIndices(nums4, target4));
        // Expected output: [0]

        // Test Case 5: Empty array case
        int[] nums5 = {};
        int target5 = 3;
        System.out.println("Indices of target 3: " + solution.targetIndices(nums5, target5));
        // Expected output: []
    }
}
