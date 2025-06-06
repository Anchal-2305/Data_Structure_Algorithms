package traininghitbullseye;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[] arr={3,2,1,4};
        int temp;
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
