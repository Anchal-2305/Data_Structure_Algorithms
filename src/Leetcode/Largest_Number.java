package Leetcode;

import java.util.Arrays;

public class Largest_Number {
    // Method to form the largest number by concatenating the elements of the array
    public String largestNumber(int[] nums) {
        // Convert the integer array to a String array for easier comparison and manipulation
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.toString(nums[i]); // Convert each number to its String representation
        }

        // Sort the array based on a custom comparator that compares the concatenated result of two strings
        Arrays.sort(arr, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        // Use StringBuilder to concatenate the sorted numbers
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]); // Append each number to form the largest number
        }

        // If the first character of the result is '0', it means the result is just zero
        if (sb.charAt(0) == '0') {
            return "0"; // If all numbers were zero, return "0"
        } else {
            return sb.toString(); // Return the concatenated result as a string
        }
    }

    // Main method to test the largestNumber method
    public static void main(String[] args) {
        Largest_Number solution = new  Largest_Number();  // Create an instance of the Solution class

        // Test Case 1: Typical case with multiple digits
        int[] nums1 = {10, 2};
        System.out.println("Largest number: " + solution.largestNumber(nums1));
        // Expected output: "210"

        // Test Case 2: Case with multiple zeroes
        int[] nums2 = {0, 0, 0};
        System.out.println("Largest number: " + solution.largestNumber(nums2));
        // Expected output: "0"

        // Test Case 3: Case with a mix of digits
        int[] nums3 = {3, 30, 34, 5, 9};
        System.out.println("Largest number: " + solution.largestNumber(nums3));
        // Expected output: "9534330"

        // Test Case 4: Case with larger values
        int[] nums4 = {121, 12};
        System.out.println("Largest number: " + solution.largestNumber(nums4));
        // Expected output: "12121"

        // Test Case 5: Case with single number
        int[] nums5 = {5};
        System.out.println("Largest number: " + solution.largestNumber(nums5));
        // Expected output: "5"
    }
}
