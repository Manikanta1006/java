class Booblesort{
    public static void main(String[] args){
        int [] ar={10,100,53,85,48,13};

        for(int a=0;a<=ar.length-1;a++){
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-2;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        }
        for(int b=0;b<=ar.length-1;b++){
            System.out.println(ar[b]);
        }
    }

}