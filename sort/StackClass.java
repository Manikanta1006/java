import java.util.Scanner;

public class StackClass{
    public static void main(String[] args){
        class Stack{
            int[] st;
            int tos;
            Stack(){
                this.tos=-1;
                st=new int[5];

            }
            void push(int x){
                if(tos==st.length-1){
                    System.out.println("Stack over flow");
                }
                else{
                    this.st[++tos]=x;
                    this.display();
                }
            }
            void pop(){
                if(tos==-1){
                    System.out.println("Stack is empty");
                }
                else{
                    this.tos--;
                    display();
                }
            }
            void display(){
                for(int i=0;i<=this.tos;i++){
                    System.out.print(this.st[i]+"\t");
                }
                System.out.println();
            }
            
        }
        Stack s1=new Stack();
        while(true){
            System.out.println("1.topush \t 2.pop \t 3.display \t 4.quit");
            Scanner input=new Scanner(System.in);
            int ch=input.nextInt();
            if(ch==1){
                System.out.println("enter a value to push");
                int val=input.nextInt();
                s1.push(val);
            }
            if(ch==2){
                s1.pop();
                
            }
            if(ch==3){
                s1.display();
            }
            if(ch==4){
                break;
            }
        }
    }
}