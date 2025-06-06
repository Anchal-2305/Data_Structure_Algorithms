package traininghitbullseye;

public class IIIrdlargestnumber {
    public static void main(String[] args) {
        int[] arr = {25, 16, 38, 10, 35, 48, 20, 50};

        if (arr.length < 3) {
            System.out.println("Array must contain at least three elements.");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3 && arr[i] != max1 && arr[i] != max2) {
                max3 = arr[i];
            }
        }
        if (max3 == Integer.MIN_VALUE) {
            System.out.println("There is no distinct third largest number.");
        } else {
            System.out.println("3rd Largest number in the Array is: " + max3);
        }
    }
}