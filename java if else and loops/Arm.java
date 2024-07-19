public class Arm {
    public static void main(String[] args) {
     
     int i;
    // 
     for( i=153;i<=1000;i++){

        int x=0;
     int rem=0;
     int sum=0;
     int d=0;
                                // *this logic only for 100 to 1000*
        x=i;
     while (x>0) {
        rem=x%10;
         d=d+(int) Math.pow(rem, 3);
        x=x/10;
     }

    if(d==i){
        System.out.println(i);
    }
}

    }
}
