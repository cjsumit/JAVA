// Wrong solution NEED PRACTIC FOR THIS ONE !!

public class Prime_in_range {
    public static void Prime(int n){
        for(int i = 1; i<=n; i++){
            for(int j =2; j<=n-1; j++){
                if (i % j == 0) {
                    System.out.println(i);;
                }
            }
        }
    }
    public static void main(String[] args) {
        Prime(20);
    }
}
