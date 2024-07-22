class Buble{
    public static void main(String[] args) {
        int[] ar={5,3,4,6,2,1};
        int i,j;
        int temp=0;
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<ar.length-2;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
        
            }
        }
        for(int k=0;k<=ar.length-1;k++){
            System.out.println(ar[k]);
        }

    }
}