package Leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_To_Integer {
    // Method to add an integer K to an array-form representation of a number A
    public List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;  // Length of the array A
        int cur = K;  // Variable to store the current number to add (starting with K)
        List<Integer> ans = new ArrayList();  // List to store the result

        int i = N;
        // Loop to traverse the array A and handle the addition digit by digit
        while (--i >= 0 || cur > 0) {
            // If we still have elements in A to process, add the current element to cur
            if (i >= 0)
                cur += A[i];

            // Add the least significant digit of cur to the result
            ans.add(cur % 10);

            // Update cur to be the remaining part (remove the least significant digit)
            cur /= 10;
        }

        // Reverse the result list to get the correct order (from most significant to least significant)
        Collections.reverse(ans);
        return ans;  // Return the final result
    }

    // Main method to test the addToArrayForm method
    public static void main(String[] args) {
        Add_to_Array_Form_To_Integer solution = new Add_to_Array_Form_To_Integer();  // Create an instance of the Solution class

        // Test case 1: A = [1, 2, 0, 0], K = 34
        int[] A1 = {1, 2, 0, 0};
        int K1 = 34;
        List<Integer> result1 = solution.addToArrayForm(A1, K1);
        System.out.println(result1);  // Expected output: [1, 2, 0, 3, 4]

        // Test case 2: A = [2, 7, 4], K = 181
        int[] A2 = {2, 7, 4};
        int K2 = 181;
        List<Integer> result2 = solution.addToArrayForm(A2, K2);
        System.out.println(result2);  // Expected output: [4, 5, 5]

        // Test case 3: A = [0], K = 23
        int[] A3 = {0};
        int K3 = 23;
        List<Integer> result3 = solution.addToArrayForm(A3, K3);
        System.out.println(result3);  // Expected output: [2, 3]

        // Test case 4: A = [9, 9, 9], K = 1
        int[] A4 = {9, 9, 9};
        int K4 = 1;
        List<Integer> result4 = solution.addToArrayForm(A4, K4);
        System.out.println(result4);  // Expected output: [1, 0, 0, 0]
    }
}
