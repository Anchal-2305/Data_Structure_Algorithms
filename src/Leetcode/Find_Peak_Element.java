package Leetcode;

public class Find_Peak_Element {
    // Method to find the index of a peak element in the array.
    public int findPeakElement(int[] nums) {
        // If the array has only one element, it is the peak element.
        if (nums.length == 1) {
            return 0;
        }
        // If the first element is greater than the second, it is the peak.
        else if (nums[0] > nums[1]) {
            return 0;
        }
        // If the last element is greater than the second-to-last, it is the peak.
        else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        // Binary search for the peak element in the middle of the array
        else {
            int start = 1;  // Start from the second element (since first element is already checked)
            int end = nums.length - 2;  // End at the second-to-last element
            while (start <= end) {
                int mid = (start + end) / 2;  // Calculate the middle index

                // Check if the mid element is a peak
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;  // Return the index of the peak element
                }
                // If the mid element is smaller than the next element, peak must be on the right
                else if (nums[mid] < nums[mid + 1]) {
                    start = mid + 1;  // Move to the right half
                }
                // If the mid element is smaller than the previous element, peak must be on the left
                else {
                    end = mid - 1;  // Move to the left half
                }
            }
        }

        // If no peak is found, return -1 (although this shouldn't happen with the above checks)
        return -1;
    }

    // Main method to test the findPeakElement function.
    public static void main(String[] args) {
        Find_Peak_Element solution = new Find_Peak_Element ();  // Create an instance of the Solution class

        // Test case 1: Peak is at the start of the array
        int[] nums1 = {6, 2, 3, 4, 5};
        int result1 = solution.findPeakElement(nums1);
        System.out.println("Test Case 1: " + result1);  // Expected output: 0 (6 is the peak)

        // Test case 2: Peak is at the end of the array
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int result2 = solution.findPeakElement(nums2);
        System.out.println("Test Case 2: " + result2);  // Expected output: 5 (6 is the peak)

        // Test case 3: Peak is in the middle of the array
        int[] nums3 = {1, 3, 20, 4, 1, 0};
        int result3 = solution.findPeakElement(nums3);
        System.out.println("Test Case 3: " + result3);  // Expected output: 2 (20 is the peak)

        // Test case 4: Array with only one element (edge case)
        int[] nums4 = {10};
        int result4 = solution.findPeakElement(nums4);
        System.out.println("Test Case 4: " + result4);  // Expected output: 0 (10 is the peak)

        // Test case 5: Peak is in the middle of the array (with multiple peaks)
        int[] nums5 = {1, 3, 2, 5, 4};
        int result5 = solution.findPeakElement(nums5);
        System.out.println("Test Case 5: " + result5);  // Expected output: 1 or 3 (both are peaks)
    }
}
