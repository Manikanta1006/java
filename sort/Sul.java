import java.util.*;
import java.io.*;

class Sul{
        public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
          int q= sc.nextInt(); 
          for (int j=1; j<=q; j++) {  
           int a= sc.nextInt();
             int b= sc.nextInt();
             int n= sc.nextInt();
        int s= (int) (a + Math.pow(2, 0)*b); 
         System.out.printf("%d ",s); 
        for (int i =1; i<=n-1; i++) { 
        s= (int)(s+Math.pow(2,i)*b); 
        System.out.printf("%d ",s);
            }
    }
           System.out.println();

        }
    }