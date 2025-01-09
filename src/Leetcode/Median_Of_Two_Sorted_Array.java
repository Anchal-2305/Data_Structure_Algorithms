package Leetcode;

public class Median_Of_Two_Sorted_Array {
    // Method to find the median of two sorted arrays
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two sorted arrays into one sorted array
        int[] mergedArray = merge(nums1, nums2);

        // Check if the length of the merged array is even or odd
        if (mergedArray.length % 2 == 0) {
            // If even, median is the average of the two middle elements
            double median = (double) (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2;
            return median;
        } else {
            // If odd, median is the middle element
            return (double) mergedArray[mergedArray.length / 2];
        }
    }

    // Helper method to merge two sorted arrays into one sorted array
    public int[] merge(int[] arr1, int[] arr2) {
        // Create a new array to store the merged result
        int[] mergedArray = new int[arr1.length + arr2.length];
        int p1 = 0;  // Pointer for arr1
        int p2 = 0;  // Pointer for arr2
        int p3 = 0;  // Pointer for mergedArray

        // Loop until all elements from both arrays are processed
        while (p1 < arr1.length || p2 < arr2.length) {
            // If arr1 is exhausted, take the element from arr2
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            // If arr2 is exhausted, take the element from arr1
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            // Compare the current elements from both arrays and pick the smaller one
            if (val1 < val2) {
                mergedArray[p3] = val1;
                p1++;  // Move pointer for arr1
            } else {
                mergedArray[p3] = val2;
                p2++;  // Move pointer for arr2
            }
            p3++;  // Move pointer for mergedArray
        }

        return mergedArray;  // Return the merged array
    }

    // Main method to test the findMedianSortedArrays method
    public static void main(String[] args) {
        Median_Of_Two_Sorted_Array solution = new Median_Of_Two_Sorted_Array();  // Create an instance of the Solution class

        // Test case 1: nums1 = [1, 3], nums2 = [2]
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        double result1 = solution.findMedianSortedArrays(nums1_1, nums2_1);
        System.out.println(result1);  // Expected output: 2.0 (The merged array is [1, 2, 3], and the median is 2)

        // Test case 2: nums1 = [1, 2], nums2 = [3, 4]
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        double result2 = solution.findMedianSortedArrays(nums1_2, nums2_2);
        System.out.println(result2);  // Expected output: 2.5 (The merged array is [1, 2, 3, 4], and the median is (2+3)/2 = 2.5)

        // Test case 3: nums1 = [], nums2 = [1]
        int[] nums1_3 = {};
        int[] nums2_3 = {1};
        double result3 = solution.findMedianSortedArrays(nums1_3, nums2_3);
        System.out.println(result3);  // Expected output: 1.0 (The merged array is [1], and the median is 1)

        // Test case 4: nums1 = [0], nums2 = [0]
        int[] nums1_4 = {0};
        int[] nums2_4 = {0};
        double result4 = solution.findMedianSortedArrays(nums1_4, nums2_4);
        System.out.println(result4);  // Expected output: 0.0 (The merged array is [0, 0], and the median is (0+0)/2 = 0)

        // Test case 5: nums1 = [1, 2, 3], nums2 = [4, 5, 6]
        int[] nums1_5 = {1, 2, 3};
        int[] nums2_5 = {4, 5, 6};
        double result5 = solution.findMedianSortedArrays(nums1_5, nums2_5);
        System.out.println(result5);  // Expected output: 3.5 (The merged array is [1, 2, 3, 4, 5, 6], and the median is (3+4)/2 = 3.5)
    }
}
