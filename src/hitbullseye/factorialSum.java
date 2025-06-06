package hitbullseye;
    public class factorialSum{

        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        public static void main(String[] args) {
            int sum = factorial(1) + factorial(4) + factorial(3);
            System.out.println("The sum of 1! + 4! + 3! is: " + sum);
        }
    }

