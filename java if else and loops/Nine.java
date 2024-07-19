import java.util.Scanner;

/**
 * Nine
 */
public class Nine {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        if(x%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

}