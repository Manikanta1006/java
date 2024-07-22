import java.util.Scanner;

class Decimaltb{
    public static void main(String[] args){
        int rem=0,sum=0;
        Scanner s= new Scanner((System.in));
        int n=s.nextInt();
    while(n>0){
        rem=n%2;
        sum=sum*10+rem;
        n=n/2;
    }
    System.out.println(sum);

    //reveese chey sum ni
    }
}