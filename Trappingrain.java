import java.util.*;
public class Trappingrain {
    public static int trappingrainwater(int[] a) {
        int[] leftMax= new int [a.length];
        leftMax[0]=a[0];
        for (int i =1; i<a.length;i++) {
            leftMax[i]= Math.max(a[i],leftMax[i-1]);
        }
        int[] rightMax= new int [a.length];
        rightMax[a.length-1]=a[a.length-1];
        for (int i=a.length-2;i>=0;i--) {
            rightMax[i]= Math.max(a[i],rightMax[i+1]);
        }
        int trappedwater=0;
        int maxHeight;
        for (int i =1; i<a.length;i++) {
            maxHeight=Math.min(leftMax[i],rightMax[i]);
            trappedwater += maxHeight-a[i];
        }

        return trappedwater;
    }
    
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println(trappingrainwater(arr));
    }
}