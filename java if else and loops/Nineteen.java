import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // char c='a';
        // if(c=='a' ||  c =='e' ||  c =='i' || c =='o' || c =='u'){
        //     System.out.println("vowel");
        // }
        // else{
        //     System.out.println("consonent");
        // }
        System.out.println("Enter a character");
        char c=s.next().charAt(0);
        if(c=='a' ||  c =='e' ||  c =='i' || c =='o' || c =='u'){
                System.out.println("vowel");
            }
            else{
                System.out.println("consonent");
            }
    }
}
