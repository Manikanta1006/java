import java.util.Scanner;

public class QueueClass {
    /**
     * InnerQueueClass
     */
    public static void main(String[] args) {
     class Queue {
        int[] qu;
        int l=0,r=0;
        Queue(){
            this.l=0;
            this.r=0;
            qu=new int[100];
            
        }
        void enqueue(int x){
            if(r==qu.length-1){
                System.out.println("queue is overflow");
            }
            else{
                this.qu[r++]=x;
                this.display();
            }
        }
        void dequeue(){
            if(r-l==0){
                System.out.println("queue is empty");
            }
            else{
                this.l++;
                display();
            }
        }
        void display(){
            for(int i=l;i<=this.qu[i];i++){
                System.out.print(qu[i]+"\t");

            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
        Queue q1= new Queue();
        while (true) {
            System.out.println("1.enqueue \t 2.dequeue 3.display \t 4.stop");
            Scanner input=new Scanner(System.in);
            int ch=input.nextInt();
            
            if(ch==1){
                System.out.println("enter a value to push");
                int val=input.nextInt();
                q1.enqueue(val);
            }
            if(ch==2){
                q1.dequeue();
            }
            if(ch==3){
                q1.display();
            }
            if(ch==4){
                break;
            }
        }
        
    }
}
        
    


