import java.util.*;
public class Kadane {
    public static void printsumofpairs(int num[]) {
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++) {
            cs=cs+num[i];
            if(cs<0) {
                cs=0;
            }
            ms=Math.max(cs,ms);
            
        }
        System.out.println("Maxsum is: "+ms);
        }
    
    public static void main(String[] args) {
     int[] arr ={1,-2,6,-1,3};
        
        printsumofpairs(arr);   


    }
}