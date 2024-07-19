import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        if(a%10==4){
            System.out.println("units place is 4");
        }
        else{
            System.out.println("units place is not 4");

        }
    }
}
