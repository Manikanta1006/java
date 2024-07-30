public class Three {
    public static void main(String[] args) {
        int i,j;
        int sum=0;
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        for(i=0;i<=ar.length-1;i++){
            for(j=i;j==i;j++){
                sum=sum+ar[i][j];
            }
        }
        System.out.println(sum);
    }
}
