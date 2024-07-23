public class Seclarge {
    public static void main(String[] args){
        int ar[]={100,30,80,90,5};

        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-2;j++){
                for(int k=0;k<=ar.length-2;k++){
                    if(ar[k]>ar[k+1]){
                        int temp=ar[k];
                        ar[k]=ar[k+1];
                        ar[k+1]=temp;

                    }
                }
            }
        }
        for(int l=0;l<=ar.length-1;l++){
            System.out.println();
        }
    }

}
