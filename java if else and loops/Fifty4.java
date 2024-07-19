import java.util.Scanner;

public class Fifty4 {
    public static void main(String[] args) {
        int min=999999;
        int max=0;
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int x=s.nextInt();
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
