public class BinToDec {
    public static void Bin(int num){
        int mynum = num;
        int pow = 0;
        int decimal = 0;
        int Ld;
        while (num>0) {
            Ld = num % 10;
            decimal = decimal + (int)(Ld * Math.pow(2, pow));
            pow++;
            num = num/10;
        }
            System.out.println("The Decimal Conversion of " + mynum + " is : " + decimal);
    }
    public static void main(String[] args) {
        Bin(111);
    }
}
