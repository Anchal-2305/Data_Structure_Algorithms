package Leetcode;

public class maximumcountinteger{

}
class Solution {
    public int maximumCount(int[] nums) {
        int lastnegIndex = lastNegative(nums) + 1;  // Count of negative numbers
        int firstposIndex = nums.length - firstPositive(nums);  // Count of positive numbers
        return Math.max(lastnegIndex, firstposIndex);
    }

    public int lastNegative(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // Default to -1, indicating no negative number found.
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < 0) {
                ans = mid;  // Found a negative number
                start = mid + 1;  // Look for a later negative number
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public int firstPositive(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;  // Default to length, indicating no positive number found.
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > 0) {
                ans = mid;  // Found a positive number
                end = mid - 1;  // Look for an earlier positive number
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // Main method to test the Solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Mixed negative and positive numbers
        int[] nums1 = {-5, -4, -3, 0, 1, 2, 3};
        System.out.println("Maximum Count for nums1: " + solution.maximumCount(nums1));

        // Test case 2: All negative numbers
        int[] nums2 = {-5, -4, -3, -2, -1};
        System.out.println("Maximum Count for nums2: " + solution.maximumCount(nums2));

        // Test case 3: All positive numbers
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Maximum Count for nums3: " + solution.maximumCount(nums3));

        // Test case 4: No positive or negative numbers (only zeros)
        int[] nums4 = {0, 0, 0, 0};
        System.out.println("Maximum Count for nums4: " + solution.maximumCount(nums4));

        // Test case 5: Empty array
        int[] nums5 = {};
        System.out.println("Maximum Count for nums5: " + solution.maximumCount(nums5));
    }
}

