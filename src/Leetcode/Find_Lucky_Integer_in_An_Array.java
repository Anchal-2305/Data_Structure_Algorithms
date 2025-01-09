package Leetcode;

import java.util.HashMap;

public class Find_Lucky_Integer_in_An_Array {
    // Method to find the lucky integer in the array
    public int findLucky(int[] arr) {
        // Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Loop through the array to populate the HashMap with frequencies
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            // Increment the frequency of the current element
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }

        // Initialize the variable to store the answer, -1 means no lucky integer found
        int ans = -1;

        // Loop through the keys of the HashMap to check for lucky integers
        for (int key : hm.keySet()) {
            // If the element is equal to its frequency (lucky number condition)
            if (hm.get(key) == key) {
                // Update the answer to the maximum lucky integer found
                ans = Math.max(ans, key);
            }
        }

        // Return the largest lucky integer, or -1 if no lucky integer is found
        return ans;
    }

    // Main method to test the findLucky function
    public static void main(String[] args) {
        Find_Lucky_Integer_in_An_Array solution = new Find_Lucky_Integer_in_An_Array();  // Create an instance of Solution

        // Test case 1: arr = [2, 2, 3, 4]
        int[] arr1 = {2, 2, 3, 4};
        System.out.println("Test Case 1: " + solution.findLucky(arr1));  // Expected output: 2 (the lucky integer 2)

        // Test case 2: arr = [1, 2, 2, 3, 3, 3]
        int[] arr2 = {1, 2, 2, 3, 3, 3};
        System.out.println("Test Case 2: " + solution.findLucky(arr2));  // Expected output: 3 (the lucky integer 3)

        // Test case 3: arr = [3, 6, 6, 6, 6]
        int[] arr3 = {3, 6, 6, 6, 6};
        System.out.println("Test Case 3: " + solution.findLucky(arr3));  // Expected output: -1 (no lucky integer)

        // Test case 4: arr = [5, 5, 5, 5]
        int[] arr4 = {5, 5, 5, 5};
        System.out.println("Test Case 4: " + solution.findLucky(arr4));  // Expected output: 5 (the lucky integer 5)

        // Test case 5: arr = [1, 1, 1, 2, 2]
        int[] arr5 = {1, 1, 1, 2, 2};
        System.out.println("Test Case 5: " + solution.findLucky(arr5));  // Expected output: 1 (the lucky integer 1)
    }
}
