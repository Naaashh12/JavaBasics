import java.util.*;
public class BinarySearch {
    public static int bsearch(int[] arr,int key) {
        int first=0;
        int last = arr.length-1;
        
        while(first<=last) {
             int mid=(first+last)/2;
        if(key==arr[mid]) 
        return mid;
        else if(key<=arr[mid])
        last =mid-1;
        else
        first=mid+1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for(int i =0;i< n;i++) 
            arr[i] = sc.nextInt();
        System.out.println("Enter the key to be searched :");
        int key = sc.nextInt();
        int index=bsearch(arr,key);
        if(index!=-1)
        System.out.println("Key found at index " +index);
        else
        System.out.println("Key not found");
    }
}