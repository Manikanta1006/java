public class Selectionsort {
    public static void main(String[] args) {
        int i, min = 0;
        int temp = 0;
        int ar[] = { 5, 6, 2, 3, 1, 4 ,9,20};
        int j;
        for (i = 0; i <= ar.length - 2; i++) {
            min = ar[i];
            for (j = i + 1; j <= ar.length - 1; j++) {
                if (min > ar[j]) {
                    min = ar[j];

                    temp = ar[i];
                    ar[i] = min;
                    ar[j] = temp;
                }
            }

        }
        for (int k = 0; k <= ar.length - 1; k++) {
            System.out.println(ar[k]);
        }
    }
}
