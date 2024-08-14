class Fib{
    public static void main(String[] args) {
        int f=0, s=1 ,t;
        int n=5;
        System.out.println(f);
        System.out.println(s);
        for(int i=2;i<=5;i++){
            t=f+s;
            f=s;
            s=t;
            System.out.println(t);
        }

    }
}