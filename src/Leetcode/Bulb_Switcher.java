package Leetcode;

public class Bulb_Switcher {
    // Method to determine how many bulbs are on after n switches
    public int bulbSwitch(int n) {
        int count = 0;  // Variable to count how many bulbs are on
        int i = 1;  // Start from the first bulb's square

        // Loop until the square of i exceeds n
        while (i * i <= n) {
            count++;  // Each perfect square (i*i) corresponds to a bulb that is on
            i++;  // Increment i to check the next number
        }

        return count;  // Return the count of bulbs that are on
    }

    // Main method to test the bulbSwitch method
    public static void main(String[] args) {
        Bulb_Switcher solution = new Bulb_Switcher();  // Create an instance of the Solution class

        // Test case 1: n = 3
        int n1 = 3;
        int result1 = solution.bulbSwitch(n1);
        System.out.println("Result for n = 3: " + result1);  // Expected: 1 (Only bulb 1 will remain on)

        // Test case 2: n = 10
        int n2 = 10;
        int result2 = solution.bulbSwitch(n2);
        System.out.println("Result for n = 10: " + result2);  // Expected: 3 (Bulbs 1, 4, 9 will remain on)

        // Test case 3: n = 25
        int n3 = 25;
        int result3 = solution.bulbSwitch(n3);
        System.out.println("Result for n = 25: " + result3);  // Expected: 5 (Bulbs 1, 4, 9, 16, 25 will remain on)

        // Test case 4: n = 100
        int n4 = 100;
        int result4 = solution.bulbSwitch(n4);
        System.out.println("Result for n = 100: " + result4);  // Expected: 10 (Bulbs 1, 4, 9, ..., 100 will remain on)
    }
}
