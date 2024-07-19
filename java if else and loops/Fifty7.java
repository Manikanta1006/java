import java.util.Scanner;

class Fifty7{
    public static void main(String[] args) {
        int x=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
         x=s.nextInt();
        while (x>0) {
            int rem=x%10;
            if(rem%2==0){
                System.out.println(rem);
            }
            x=x/10;
        }
    }
}