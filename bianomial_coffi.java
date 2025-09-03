public class bianomial_coffi {
    public static int coff(int n){
        int mul = 1;
        for(int i=0; i<n; i++){
            mul = mul * (n - i);
        }
        return mul;
    }
    public static int bincoff(int n, int r){
        int n_fact = coff(n);
        int r_fact = coff(r);
        int f_fact = coff(n-r);
        return n_fact /(r_fact * f_fact);
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.println(bincoff(n,r));
    }
}
