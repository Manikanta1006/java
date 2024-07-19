import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        int c=0;
        Scanner s=new Scanner(System.in);
        while (c<=5) {
            int n=s.nextInt();
            if(n%2==0){
                System.out.println(n);
                c++;
            }

        }
    }
}
