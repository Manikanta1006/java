import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        if(a%3==0){
            System.out.println("multiple");
        }
        else{
            System.out.println("not multiple");
        }
    }
}
