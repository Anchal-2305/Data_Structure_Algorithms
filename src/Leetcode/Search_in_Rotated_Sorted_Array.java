package Leetcode;

public class Search_in_Rotated_Sorted_Array {
    static class Solution {
        public int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[start] <= nums[mid]) {
                    if (target >= nums[start] && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Rotated sorted array
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Index of target " + target1 + ": " + solution.search(nums1, target1));

        // Test case 2: Target not present
        int[] nums2 = {4, 5, 6, 7, 8, 9, 10};
        int target2 = 6;
        System.out.println("Index of target " + target2 + ": " + solution.search(nums2, target2));

        // Test case 3: Target is the first element
        int[] nums3 = {1, 2, 3, 4, 5, 6};
        int target3 = 1;
        System.out.println("Index of target " + target3 + ": " + solution.search(nums3, target3));

        // Test case 4: Target is not in the array
        int[] nums4 = {1, 2, 3, 4, 5, 6};
        int target4 = 7;
        System.out.println("Index of target " + target4 + ": " + solution.search(nums4, target4));
    }
}
