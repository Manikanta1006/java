public class Dectb {
    public static void main(String[] args) {
        int a=14;
        int rem=0;
        int sum=0;
        int i=0;
        int[] ar= new int[10];
        while(a>0){
            rem =a%2;
            ar[i]=rem;;
            sum=sum*10+ar[i];
            a=a/2;
            // ar[i]=sum;
            System.out.println(ar[i]);
        }
        // for(int j=)
    }
}
