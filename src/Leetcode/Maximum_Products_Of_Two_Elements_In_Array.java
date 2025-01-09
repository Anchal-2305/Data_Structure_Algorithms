package Leetcode;

public class Maximum_Products_Of_Two_Elements_In_Array {
    // Method to find the maximum product of two numbers in the array after subtracting 1 from each.
    public int maxProduct(int[] nums) {
        int smax = -1;  // Initialize second maximum value (smax)
        int max = -1;   // Initialize maximum value (max)

        // Traverse the array to find the two largest numbers
        for (int i = 0; i < nums.length; i++) {
            // If current number is greater than max, update max and smax
            if (max < nums[i]) {
                smax = max;  // Update second maximum to the old maximum
                max = nums[i];  // Update maximum to the current number
            }
            // If current number is smaller than max but greater than smax, update smax
            else if (smax < nums[i]) {
                smax = nums[i];  // Update second maximum to the current number
            }
        }

        // Calculate the maximum product by subtracting 1 from both max and smax, then multiplying them
        int ans = (max - 1) * (smax - 1);

        return ans;  // Return the calculated product
    }

    // Main method to test the maxProduct method
    public static void main(String[] args) {
        Maximum_Products_Of_Two_Elements_In_Array solution = new Maximum_Products_Of_Two_Elements_In_Array();  // Create an instance of the Solution class

        // Test case 1: nums = [3, 4, 5, 2]
        int[] nums1 = {3, 4, 5, 2};
        int result1 = solution.maxProduct(nums1);
        System.out.println(result1);  // Expected output: 12 (because (5-1)*(4-1) = 4*3 = 12)

        // Test case 2: nums = [1, 5, 4, 5]
        int[] nums2 = {1, 5, 4, 5};
        int result2 = solution.maxProduct(nums2);
        System.out.println(result2);  // Expected output: 16 (because (5-1)*(5-1) = 4*4 = 16)

        // Test case 3: nums = [3, 7]
        int[] nums3 = {3, 7};
        int result3 = solution.maxProduct(nums3);
        System.out.println(result3);  // Expected output: 12 (because (7-1)*(3-1) = 6*2 = 12)

        // Test case 4: nums = [1, 1, 1]
        int[] nums4 = {1, 1, 1};
        int result4 = solution.maxProduct(nums4);
        System.out.println(result4);  // Expected output: 0 (because (1-1)*(1-1) = 0*0 = 0)
    }
}
