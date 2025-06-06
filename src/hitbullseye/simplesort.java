package hitbullseye;

public class simplesort {
        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 6, 4, 3};
            int k = 3;

            // Sort first k elements in descending order
            for (int i = 0; i < k - 1; i++) {
                for (int j = i + 1; j < k; j++) {
                    if (arr[i] < arr[j]) {
                        // Swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            // Sort the rest in ascending order
            for (int i = k; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        // Swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            // Print result
            System.out.println("Final array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

