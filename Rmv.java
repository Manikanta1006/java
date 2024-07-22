public class Rmv {
    public static void main(String[] args) {
        int j;
        int[] ar={1,1,2,2,3,3,4,5,6,7,8,9};
        for(int i=0;i<=ar.length-1;i++){
            for(j=i;j>0;j--){
                if(ar[i]==ar[j-1]){
                    break;

                }
            }
            if(j==0){
                System.out.println(ar[i]);
            }
        }
    }
}
