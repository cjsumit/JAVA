public class prime_num {
    // Method 1 !
    public static void prime(int n){
        int count = 0;
        for(int i =1; i<=n; i++){
            int rem = n%i;
            if (rem == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
    
    // Method 2

    public static boolean prim(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i<=n-1; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method 3 (Optimised method most used)

    public static boolean pr(int n){
        if(n==2){
            return true;
        }
        for (int i =2; i<=Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        prime(n);
        System.out.println(prim(n));
        System.out.println(pr(n));
    }
}
