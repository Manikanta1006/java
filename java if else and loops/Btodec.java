public class Btodec {
    public static void main(String[] args) {
        int binary=10100;
        int n=0;
        int rem=0;
        int d=0;
        double decimal=0;
        while (binary>0) {
            rem=binary%10;
            decimal= decimal + rem*Math.pow(2,n);
             d= (int)decimal;
            binary=binary/10;
            n++;
        }
        System.err.println(d);
    }
}
