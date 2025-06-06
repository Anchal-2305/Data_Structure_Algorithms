package traininghitbullseye;

public class Istlargest_number {
    public static void main(String[] args) {
        int[] arr={25,16,38,10,35,48,20,50};
        int max1;
        max1=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        System.out.println(max1);
    }
}
