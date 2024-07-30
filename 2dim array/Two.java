public class Two {
    public static void main(String[] args) {
        int sum=0;
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<=ar.length-1;i++){
            for(int j=0;j<=0;j++){
                // System.out.println(ar[i][j]);
                sum=sum+ar[i][j];
            }
        }
        System.out.println(sum);
    }
}
