import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number::");
        int a=input.nextInt();
        if(a%7==0){
            System.out.println("divisible by 7");
        }
        else{

            System.out.println("not divisible by 7");
        }
    }
}
