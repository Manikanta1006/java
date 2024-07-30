public class Five {
    public static void main(String[] args) {
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-1;j++){
                if(max<ar[i][j]){
                    max=ar[i][j];
                }
            }
            
        }
        System.out.println(max);
    }
}
