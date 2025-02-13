package Leetcode;

public class plus_one {

        // Static inner class or outer class should handle the main method
        public static class Solution {
            public int[] plusOne(int[] digits) {
                int n = digits.length;

                // If the last digit is not 9, just increment it and return the array.
                if (digits[n - 1] != 9) {
                    digits[n - 1] = digits[n - 1] + 1;
                    return digits;
                }

                // Set the last digit to 0 and proceed with the next digits.
                digits[n - 1] = 0;
                for (int i = n - 2; i >= 0; i--) {
                    if (digits[i] != 9) {
                        digits[i] = digits[i] + 1;
                        return digits;
                    }
                    digits[i] = 0;
                }

                // If all digits are 9, create a new array with an extra digit.
                int[] ans = new int[n + 1];
                ans[0] = 1;
                return ans;
            }

            // Static main method for testing the solution
            public static void main(String[] args) {
                Solution solution = new Solution();

                // Test case 1: Normal case
                int[] digits1 = {1, 2, 3};
                int[] result1 = solution.plusOne(digits1);
                System.out.print("Result for digits1: ");
                for (int digit : result1) {
                    System.out.print(digit + " ");
                }
                System.out.println();

                // Test case 2: All 9's
                int[] digits2 = {9, 9, 9};
                int[] result2 = solution.plusOne(digits2);
                System.out.print("Result for digits2: ");
                for (int digit : result2) {
                    System.out.print(digit + " ");
                }
                System.out.println();

                // Test case 3: Single digit (not 9)
                int[] digits3 = {4};
                int[] result3 = solution.plusOne(digits3);
                System.out.print("Result for digits3: ");
                for (int digit : result3) {
                    System.out.print(digit + " ");
                }
                System.out.println();

                // Test case 4: Single digit 9
                int[] digits4 = {9};
                int[] result4 = solution.plusOne(digits4);
                System.out.print("Result for digits4: ");
                for (int digit : result4) {
                    System.out.print(digit + " ");
                }
                System.out.println();

                // Test case 5: Multiple 9's followed by other digits
                int[] digits5 = {9, 9, 0};
                int[] result5 = solution.plusOne(digits5);
                System.out.print("Result for digits5: ");
                for (int digit : result5) {
                    System.out.print(digit + " ");
                }
                System.out.println();
            }
        }
    }


