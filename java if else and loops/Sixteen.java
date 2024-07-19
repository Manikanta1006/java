import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();              //decending order
        if(x>y&&x>z){
            System.out.println(x+" "+y+" "+z);
        }
        if(y>z&&y>x){
            System.out.println(y+" "+x+" "+z);
        }
        if(z>y&&z>x){
            System.out.println(z+" "+y+" "+x);
        }

    }
}
