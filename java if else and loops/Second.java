import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number::");
        int a=input.nextInt();
        if(84%a==0){
            System.out.println(a+" is factor of 84");
        }
        else{
            System.out.println(a+"not is factor of84");
        }
    }
}
