package Leetcode;

public class Fibonacci_Number {
    // Method to calculate the nth Fibonacci number
    public int fib(int n) {
        // Base cases: if n is 0, return 0 (the first Fibonacci number)
        if (n == 0) {
            return 0;
        }
        // Base case: if n is 1, return 1 (the second Fibonacci number)
        else if (n == 1) {
            return 1;
        }

        // Initialize the first two Fibonacci numbers
        int firstterm = 0;  // F(0) = 0
        int secondterm = 1; // F(1) = 1

        // Loop to calculate the Fibonacci number from F(2) to F(n)
        for (int i = 2; i <= n; i++) {
            // Calculate the next Fibonacci number as the sum of the previous two
            int thirdterm = firstterm + secondterm;

            // Update the first and second terms for the next iteration
            firstterm = secondterm;  // Move the second term to the first term
            secondterm = thirdterm;  // Move the third term to the second term
        }

        // Return the nth Fibonacci number, which is stored in the second term after the loop
        return secondterm;
    }

    // Main method to test the fib method
    public static void main(String[] args) {
        Fibonacci_Number solution = new Fibonacci_Number();  // Create an instance of the Solution class

        // Test case 1: Fibonacci of 0
        int n1 = 0;
        System.out.println(solution.fib(n1));  // Output: 0 (F(0) = 0)

        // Test case 2: Fibonacci of 1
        int n2 = 1;
        System.out.println(solution.fib(n2));  // Output: 1 (F(1) = 1)

        // Test case 3: Fibonacci of 5
        int n3 = 5;
        System.out.println(solution.fib(n3));  // Output: 5 (F(5) = 5)

        // Test case 4: Fibonacci of 10
        int n4 = 10;
        System.out.println(solution.fib(n4));  // Output: 55 (F(10) = 55)

        // Test case 5: Fibonacci of 20
        int n5 = 20;
        System.out.println(solution.fib(n5));  // Output: 6765 (F(20) = 6765)
    }
}
