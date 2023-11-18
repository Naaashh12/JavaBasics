import java.util.*;
public class SumofPairs {
    public static void main (String[] args) {
        int[] arr ={1,-2,6,-1,3};
        
        printsumofpairs(arr);
    }
    //APPROACH : Brute-Force
    /*public static void printsumofpairs(int num[]) {
        int cuurentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++) {
            int start=i;
        
            for(int j=i;j<num.length;j++) {
                int end=j;
                cuurentsum=0;
                for (int k=start;k<=end;k++){
                cuurentsum+=num[k];
                } 
                }
             if(cuurentsum>maxsum) {
                maxsum=cuurentsum; 
             }
            }
             System.out.print("Maxsum is : " + maxsum)  ;
        }*/
        

    
    public static void printsumofpairs(int num[]) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        //Prefix array
        int[] prefix= new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++) {
        prefix[i]=prefix[i-1]+num[i];

        }

        //subarray-array
        for (int i=0;i<num.length;i++) {
            int start=i;
            for(int j=i;j<num.length;j++) {
                int end=j;

                if(start==0)
                currentsum=prefix[end];
                else
                currentsum=prefix[end]-prefix[start-1];

             if(currentsum > maxsum) {
                maxsum=currentsum; 
             }
           
            }
            }
          System.out.print("Maxsum is : " + maxsum)  ; 
    }
       
        

    }

