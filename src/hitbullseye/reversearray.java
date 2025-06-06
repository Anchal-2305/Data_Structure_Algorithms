package hitbullseye;

import java.util.Arrays;

public class reversearray {
    public static void main(String[]args) {
        int[] arr = {3,4,5,7,8,9};
        int i=0;
        int j= arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
        j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
