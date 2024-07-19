import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println();
         if(x<y){
            System.out.println(x);
            System.out.println(y);
            
         }
         else{
            System.out.println(y);
            System.out.println(x);
         }
    }
}
