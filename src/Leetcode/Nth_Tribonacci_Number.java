package Leetcode;

public class Nth_Tribonacci_Number {
    // Method to calculate the nth Tribonacci number
    public int tribonacci(int n) {
        // Base cases: if n is 0, return 0 (T(0) = 0)
        if (n == 0) {
            return 0;
        }
        // Base cases: if n is 1 or 2, return 1 (T(1) = T(2) = 1)
        else if (n == 1 || n == 2) {
            return 1;
        } else {
            // Initialize the first three Tribonacci numbers: T(0) = 0, T(1) = 1, T(2) = 1
            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 1;

            // Loop to calculate the Tribonacci number from T(3) to T(n)
            for (int i = 3; i <= n; i++) {
                // Calculate the next Tribonacci number as the sum of the previous three terms
                int fourthTerm = firstTerm + secondTerm + thirdTerm;

                // Update the first, second, and third terms for the next iteration
                firstTerm = secondTerm;  // Move the second term to the first term
                secondTerm = thirdTerm;  // Move the third term to the second term
                thirdTerm = fourthTerm;  // Move the fourth term to the third term
            }

            // After the loop ends, the third term holds the nth Tribonacci number
            return thirdTerm;
        }
    }

    // Main method to test the tribonacci method
    public static void main(String[] args) {
        Nth_Tribonacci_Number solution = new Nth_Tribonacci_Number();  // Create an instance of Solution

        // Test case 1: Tribonacci of 0
        int n1 = 0;
        System.out.println(solution.tribonacci(n1));  // Output: 0 (T(0) = 0)

        // Test case 2: Tribonacci of 1
        int n2 = 1;
        System.out.println(solution.tribonacci(n2));  // Output: 1 (T(1) = 1)

        // Test case 3: Tribonacci of 2
        int n3 = 2;
        System.out.println(solution.tribonacci(n3));  // Output: 1 (T(2) = 1)

        // Test case 4: Tribonacci of 5
        int n4 = 5;
        System.out.println(solution.tribonacci(n4));  // Output: 4 (T(5) = 4)

        // Test case 5: Tribonacci of 10
        int n5 = 10;
        System.out.println(solution.tribonacci(n5));  // Output: 149 (T(10) = 149)

        // Test case 6: Tribonacci of 20
        int n6 = 20;
        System.out.println(solution.tribonacci(n6));  // Output: 121415 (T(20) = 121415)
    }
}
