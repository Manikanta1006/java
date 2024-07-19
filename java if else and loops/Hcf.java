public class Hcf {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        int big=0;
        int small=0;
        if(a<b){
            small=a;
        }
        else{
            small=b;
        }
        for(int i=small;i>=1;i--){
            if(a%i==0 && b %i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
