package hitbullseye;

public class IIndlargestnumber {
    public static void main(String[] args) {
        int[] arr={25,16,38,10,35,48,20,50};
        //int n= arr.length;;
        int max1,max2;
        if (arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }else {
            max2=arr[0];
            max1=arr[1];
        }
        for (int i=2;i< arr.length;i++){
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if (arr[i]>max2) {
                max2=arr[i];
            }
        }
        System.out.println("2nd Largest Number in the Array is:"+max2);
    }
}
