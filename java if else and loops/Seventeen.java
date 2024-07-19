import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();                  
        if(x<y&&x<z){
            System.out.println(x+" "+y+" "+z);
        }
        if(y<z&&y<x){
            System.out.println(y+" "+z+" "+x);
        }
        if(z<y&&z<x){
            System.out.println(z+" "+y+" "+x);
        }

    }

}
