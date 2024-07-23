public class Insertion {
    public static void main(String[] args){
        int ar[]={5,8,9,1,4,7,2,10,3,6};
            int i,j,k,temp;
            for(i=0;i<=ar.length-1;i++){
                temp = ar[i];
                for(j=i;j>0;j--){
                    if(temp<ar[j-1]){
                        ar[j]=ar[j-1];
                    }
                    else{
                        // ar[j]=temp;
                        break;
                    }
                }
                ar[j]=temp;
            }
            for(k=0;k<=ar.length-1;k++){
                // System.out.println(k);
                System.out.println(ar[k]);
            }
        }
    }
