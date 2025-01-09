package Leetcode;

public class Is_Palindrome {
    // Method to check if a given integer is a palindrome
    public boolean isPalindrome(int x) {
        // If the number is negative, it cannot be a palindrome
        // Negative numbers are not considered palindromes because of the negative sign
        if(x < 0) {
            return false;
        }

        // Store the original number in a variable 'n'
        int n = x;
        // Initialize a variable to store the reversed number
        int revNum = 0;

        // Loop to reverse the number 'n'
        while(n > 0) {
            // Get the last digit of the number
            int d = n % 10;
            // Add the digit to the reversed number by shifting its current digits left by multiplying by 10
            revNum = revNum * 10 + d;
            // Remove the last digit from 'n'
            n = n / 10;
        }

        // Compare the reversed number with the original number
        // If both are the same, it's a palindrome
        if(revNum == x) {
            return true;
        } else {
            return false;
        }
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        Is_Palindrome solution = new Is_Palindrome();  // Create an instance of Solution

        // Test case 1: Positive palindrome number
        int num1 = 121;
        System.out.println(solution.isPalindrome(num1));  // Output: true

        // Test case 2: Negative number (cannot be a palindrome)
        int num2 = -121;
        System.out.println(solution.isPalindrome(num2));  // Output: false

        // Test case 3: Number that is not a palindrome
        int num3 = 123;
        System.out.println(solution.isPalindrome(num3));  // Output: false

        // Test case 4: Single-digit number (always a palindrome)
        int num4 = 7;
        System.out.println(solution.isPalindrome(num4));  // Output: true

        // Test case 5: A large palindrome number
        int num5 = 12321;
        System.out.println(solution.isPalindrome(num5));  // Output: true
    }
}
