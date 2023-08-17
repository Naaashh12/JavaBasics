import java.util.*;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i =0;i< n;i++) 
            arr[i] = sc.nextInt();
        
        int index=findlarge(arr);
        if(index!=-1)
        System.out.println("Largest found at " +index);
        else
        System.out.println(" not found");
    }
    public static int findlarge(int[] a) {
        int min=Integer.MIN_VALUE;
        //int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i]>min) {
                min=a[i];
            }
            /*else if(a[i]<max) {
               max=a[i];
            }*/
            
            
        }
        return min;
        

    }
}