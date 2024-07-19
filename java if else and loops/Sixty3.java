import java.util.Scanner;

public class Sixty3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    int big=0,small=0;
   if(x>y){
    big=x;
   }
   else{
    big=y;
   }
   for(int i=big; ;i++){
    if(i % x==0 && i% y==0){
        System.out.println(i);
        break;
    }
   }
}
}
