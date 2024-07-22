public class Secmax {
    public static void main(String[] args) {
        int[] ar={7,3,1,5,6,4,8};
        int max=ar[0];
        int Secmax=ar[0];
        for(int i=1;i<=ar.length-1;i++){
            if(max<ar[i]){
                Secmax=max;
                max=ar[i];
            }
            else{
                if(Secmax==max||Secmax<ar[i]){
                    // System.out.println(ar[i]);
                    Secmax=ar[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(Secmax);
        }
    }


