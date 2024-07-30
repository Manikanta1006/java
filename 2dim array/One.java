class One{
    public static void main(String[] args) {
        int sum=0;
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=2;j++){
            sum=sum+ar[i][j];
            // if(ar[i][j]%2==0){
            //     System.out.print(" "+ar[i][j]);
            }
            // System.out.print(" "+ar[i][j]);
            }
            // System.out.println();
            System.out.println(sum);
        }
    }
