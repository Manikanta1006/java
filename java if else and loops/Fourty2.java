import java.util.Scanner;

public class Fourty2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= s.nextInt();
        for(int i=1;i<=10;i++){
            // s=s*i;
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
