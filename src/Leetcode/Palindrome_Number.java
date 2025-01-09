package Leetcode;

public class Palindrome_Number {

    // Method to check if a given integer is a palindrome
    public boolean isPalindrome(int x) {
        // If x is negative, it's not a palindrome (since negative numbers can't be palindromes)
        if (x < 0) {
            return false;
        }

        // Store the original number to compare later
        int n = x;
        // Initialize a variable to store the reversed number
        int revNum = 0;

        // Reverse the number 'n' by extracting its digits
        while (n > 0) {
            // Get the last digit of 'n'
            int d = n % 10;
            // Shift the digits of revNum left by one place and add the new digit at the rightmost position
            revNum = revNum * 10 + d;
            // Remove the last digit of 'n'
            n = n / 10;
        }

        // After reversing the number, compare the reversed number with the original number
        // If they are the same, the number is a palindrome
        if (revNum == x) {
            return true;
        } else {
            // Otherwise, the number is not a palindrome
            return false;
        }
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        Palindrome_Number solution = new Palindrome_Number();  // Create an instance of the Solution class

        // Test case 1: Number is a palindrome
        int num1 = 121;
        System.out.println(solution.isPalindrome(num1));  // Output: true

        // Test case 2: Negative number (cannot be a palindrome)
        int num2 = -121;
        System.out.println(solution.isPalindrome(num2));  // Output: false

        // Test case 3: Non-palindromic number
        int num3 = 123;
        System.out.println(solution.isPalindrome(num3));  // Output: false

        // Test case 4: Single-digit number (trivially a palindrome)
        int num4 = 7;
        System.out.println(solution.isPalindrome(num4));  // Output: true

        // Test case 5: A large palindrome number
        int num5 = 12321;
        System.out.println(solution.isPalindrome(num5));  // Output: true

        // Test case 6: A number with trailing zeros (not a palindrome)
        int num6 = 120;
        System.out.println(solution.isPalindrome(num6));  // Output: false
    }
}
