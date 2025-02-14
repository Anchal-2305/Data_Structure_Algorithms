package Leetcode;

public class Average_Salary {
    // Method to calculate the average salary excluding the min and max salary
    public double average(int[] salary) {
        int max = salary[0]; // Initialize max with the first salary
        int min = salary[0]; // Initialize min with the first salary
        int sum = salary[0]; // Initialize sum with the first salary

        // Iterate through the salary array to find min, max, and calculate sum
        for (int i = 1; i < salary.length; i++) {
            if (max < salary[i]) {
                max = salary[i]; // Update max if a higher salary is found
            }
            if (min > salary[i]) {
                min = salary[i]; // Update min if a lower salary is found
            }
            sum += salary[i]; // Add salary[i] to sum
        }

        // Remove the min and max salary from the sum
        sum = sum - min - max;

        // Calculate the average by dividing by the new number of elements
        double ans = (double) sum / (salary.length - 2);
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        Average_Salary sol = new Average_Salary();
        int[] salary = {4000, 3000, 1000, 2000}; // Sample test case
        double result = sol.average(salary);
        System.out.println("Average salary excluding min and max: " + result);
    }
}

