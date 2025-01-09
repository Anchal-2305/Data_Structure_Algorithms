package Leetcode;

public class Water_Bottels {
    // Method to calculate the total number of water bottles that can be consumed
    public int numWaterBottles(int numBottles, int numExchange) {
        // Variable to keep track of the total number of bottles consumed
        int consumedBottles = 0;

        // Loop to exchange bottles as long as we have enough bottles to exchange
        while (numBottles >= numExchange) {
            // Consume 'numExchange' full bottles.
            consumedBottles += numExchange;  // Add the number of exchanged bottles to total consumed
            numBottles -= numExchange;  // Remove the exchanged bottles from the total

            // After consuming 'numExchange' bottles, we get 1 full bottle in exchange
            numBottles++;  // Add one full bottle obtained from exchanging the empty bottles
        }

        // After the loop, there are remaining bottles that are not enough to exchange
        // Add the remaining bottles (less than numExchange) to the total consumed
        return consumedBottles + numBottles;
    }

    // Main method to test the numWaterBottles method
    public static void main(String[] args) {
        Water_Bottels solution = new Water_Bottels();  // Create an instance of Solution

        // Test case 1: 9 bottles, can exchange 3 empty bottles for 1 full bottle
        int numBottles1 = 9;
        int numExchange1 = 3;
        System.out.println(solution.numWaterBottles(numBottles1, numExchange1));  // Output: 13

        // Test case 2: 15 bottles, can exchange 4 empty bottles for 1 full bottle
        int numBottles2 = 15;
        int numExchange2 = 4;
        System.out.println(solution.numWaterBottles(numBottles2, numExchange2));  // Output: 19

        // Test case 3: 5 bottles, can exchange 2 empty bottles for 1 full bottle
        int numBottles3 = 5;
        int numExchange3 = 2;
        System.out.println(solution.numWaterBottles(numBottles3, numExchange3));  // Output: 7

        // Test case 4: 10 bottles, can exchange 3 empty bottles for 1 full bottle
        int numBottles4 = 10;
        int numExchange4 = 3;
        System.out.println(solution.numWaterBottles(numBottles4, numExchange4));  // Output: 14

        // Test case 5: 3 bottles, can exchange 2 empty bottles for 1 full bottle
        int numBottles5 = 3;
        int numExchange5 = 2;
        System.out.println(solution.numWaterBottles(numBottles5, numExchange5));  // Output: 4
    }
}
