public class Add2matrix {
    public static void main(String[] args) {
        int i,j;
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};
        int[][] c=new int[10][10];
        for( i=0;i<=a.length-1;i++){
            for( j=0;j<=b.length-1;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
