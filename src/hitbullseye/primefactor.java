package hitbullseye;

public class primefactor {
    public static boolean isprime(int n){
            for (int i=2;i<n/2;i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int n=7;
            for (int i=1;i<=n;i++){
                if(n%i==0 && isprime(i)){
                    System.out.println(i);
                }
            }
        }
    }

