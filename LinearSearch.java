import java.util.*;
public class LinearSearch {

    public static int search(int[] num,int key) {
        int n = num.length;
        boolean flag=false;
        for(int i=0;i<n;i++) {
            if(num[i]== key)
            return i;
            
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
        int index=search(arr,key);
        if(index!=-1)
        System.out.println("Key found at index " +index);
        else
        System.out.println("Key not found");
        

    }



}