public class fun_overloading {
    public static int calculator(int a , int b){
        return a + b;
    }
    public static float calculator(float a , float b){
        return a + b;
    }
    public static double calculator(double a , double b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(calculator(4,5));
        System.out.println(calculator(4.4,5.5));
        System.out.println(calculator(4.34,5.45));
    }
}
