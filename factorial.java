public class factorial {
    public static int fac(int num){
        int mul =1;
        for(int i=0; i<num; i++){
            mul = mul * (num - i);
        }
        return mul;
    }
    public static void main(String[] args) {
        int a =5;
        System.out.println(fac(a));
    }
}
