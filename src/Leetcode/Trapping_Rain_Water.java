package Leetcode;

public class Trapping_Rain_Water {
    // Method to calculate the total amount of trapped water
    public int trap(int[] height) {
        int n = height.length;  // Get the number of elements in the height array

        if (n == 0) {
            return 0;  // No water can be trapped if the array is empty
        }

        // Create an array to store the maximum height to the left of each element
        int[] leftMax = new int[n];
        leftMax[0] = height[0];  // The first element's left maximum is itself
        // Fill the leftMax array by taking the maximum of the previous value and the current height
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Create an array to store the maximum height to the right of each element
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];  // The last element's right maximum is itself
        // Fill the rightMax array by taking the maximum of the next value and the current height
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Initialize a variable to keep track of the total trapped water
        int ans = 0;
        // Loop through the array and calculate the trapped water at each position
        for (int i = 0; i < n; i++) {
            // The amount of water trapped at each position is the difference between the minimum
            // of the leftMax and rightMax, and the current height at that position
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;  // Return the total trapped water
    }

    // Main method to test the trap function
    public static void main(String[] args) {
        Trapping_Rain_Water solution = new Trapping_Rain_Water();  // Create an instance of the Solution class

        // Test Case 1: Standard example
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water: " + solution.trap(height1));  // Expected output: 6

        // Test Case 2: Array with no water trapped
        int[] height2 = {1, 1, 1, 1, 1};
        System.out.println("Trapped Water: " + solution.trap(height2));  // Expected output: 0

        // Test Case 3: Array with all increasing heights
        int[] height3 = {0, 1, 2, 3, 4};
        System.out.println("Trapped Water: " + solution.trap(height3));  // Expected output: 0

        // Test Case 4: Array with a single peak and valleys
        int[] height4 = {3, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Water: " + solution.trap(height4));  // Expected output: 8

        // Test Case 5: Edge case with an empty array
        int[] height5 = {};
        System.out.println("Trapped Water: " + solution.trap(height5));  // Expected output: 0

        // Test Case 6: Case with a single element (no water can be trapped)
        int[] height6 = {5};
        System.out.println("Trapped Water: " + solution.trap(height6));  // Expected output: 0
    }
}
