import java.util.Scanner;

public class Fifty9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        int j=1;
        int d=0;
         while (j<=i) {
            d=n%10;
            n=n/10;
            j++;

         }
         System.out.println(d);
    }
}
