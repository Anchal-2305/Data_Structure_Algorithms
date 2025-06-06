package hitbullseye;

public class isprime {
        public static boolean isprime(int n){
            for (int i=2;i<n/2;i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int n=13;
            if(isprime(n)){
                System.out.println("Number is Prime :) ");
            }else {
                System.out.println("Number is not Prime");
            }
        }
    }



