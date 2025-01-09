package Leetcode;

public class Power_Of_Two {

    // Method to check if a given number n is a power of two
    public boolean isPowerOfTwo(int n) {
        // If n is less than 1, it's not a power of two (since powers of two start at 1)
        if (n < 1) {
            return false;
        }
        // If n is exactly 1, it is a power of two (2^0 = 1)
        else if (n == 1) {
            return true;
        } else {
            // While n is divisible by 2, divide n by 2
            while (n % 2 == 0) {
                n = n / 2;
            }
            // If n becomes 1 after all divisions, it was a power of two
            if (n == 1) {
                return true;
            } else {
                // If n is not 1 after dividing by 2 repeatedly, it's not a power of two
                return false;
            }
        }
    }

    // Main method to test the isPowerOfTwo method
    public static void main(String[] args) {
        Power_Of_Two solution = new Power_Of_Two();  // Create an instance of Solution

        // Test case 1: Number is a power of two
        int num1 = 16;
        System.out.println(solution.isPowerOfTwo(num1));  // Output: true (16 = 2^4)

        // Test case 2: Number is not a power of two
        int num2 = 18;
        System.out.println(solution.isPowerOfTwo(num2));  // Output: false (18 is not a power of two)

        // Test case 3: Number is exactly 1 (2^0)
        int num3 = 1;
        System.out.println(solution.isPowerOfTwo(num3));  // Output: true (1 = 2^0)

        // Test case 4: A very large power of two
        int num4 = 1024;
        System.out.println(solution.isPowerOfTwo(num4));  // Output: true (1024 = 2^10)

        // Test case 5: A negative number (cannot be a power of two)
        int num5 = -16;
        System.out.println(solution.isPowerOfTwo(num5));  // Output: false (-16 is not a power of two)
    }
}
