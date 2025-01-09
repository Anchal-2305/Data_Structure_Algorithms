package Leetcode;

public class Container_With_Most_Water {
    // Method to find the maximum area of water that can be trapped between two lines
    public int maxArea(int[] height) {
        int start = 0;  // Start pointer at the beginning of the array
        int end = height.length - 1;  // End pointer at the last element of the array
        int maxCap = 0;  // Variable to store the maximum water area found

        // Continue until the start pointer meets the end pointer
        while (start < end) {
            // Find the height of the current container by taking the minimum of the two heights
            int h = Math.min(height[start], height[end]);

            // Find the width of the current container (distance between the two pointers)
            int width = end - start;

            // Calculate the current capacity (area) of the container
            int currCap = h * width;

            // Update the maximum area found so far
            maxCap = Math.max(currCap, maxCap);

            // Move the pointer that points to the smaller height to try and find a larger container
            if (height[start] < height[end]) {
                start++;  // Move the start pointer rightwards
            } else {
                end--;  // Move the end pointer leftwards
            }
        }

        // Return the maximum area found
        return maxCap;
    }

    // Main method to test the maxArea function
    public static void main(String[] args) {
        Container_With_Most_Water solution = new Container_With_Most_Water();  // Create an instance of the Solution class

        // Test case 1: height = [1,8,6,2,5,4,8,3,7]
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result1 = solution.maxArea(height1);
        System.out.println("Result for height1: " + result1);  // Expected output: 49 (between height[1] and height[8])

        // Test case 2: height = [1,1]
        int[] height2 = {1, 1};
        int result2 = solution.maxArea(height2);
        System.out.println("Result for height2: " + result2);  // Expected output: 1 (smallest case)

        // Test case 3: height = [4,3,2,1,4]
        int[] height3 = {4, 3, 2, 1, 4};
        int result3 = solution.maxArea(height3);
        System.out.println("Result for height3: " + result3);  // Expected output: 16 (between height[0] and height[4])

        // Test case 4: height = [1,2,3,4,5,6,7,8,9,10]
        int[] height4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result4 = solution.maxArea(height4);
        System.out.println("Result for height4: " + result4);  // Expected output: 25 (between height[0] and height[9])

        // Test case 5: height = [1,2,4,3,4]
        int[] height5 = {1, 2, 4, 3, 4};
        int result5 = solution.maxArea(height5);
        System.out.println("Result for height5: " + result5);  // Expected output: 12 (between height[1] and height[4])
    }
}
