import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        if(a>99&&a<999){
            System.out.println("three digit number");
        }
        else{
            System.out.println("not a three digit number");
        }
    }
}
