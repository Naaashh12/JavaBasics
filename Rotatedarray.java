import java.util.Scanner;
public class Rotatedarray {
    public static int search(int[] arr,int si,int ei,int target) {
        if(si>ei) {
            return -1;
        }
        int mid=si+(ei-si)/2;

        if(arr[mid]==target) {
            return mid;
        }
        if(arr[si]<=arr[mid]) {
            if(arr[si]<=target && target<=arr[mid]) {
               return search(arr,si,mid-1,target);
            }
            else {
               return search(arr,mid+1,ei,target);
            }
        } 

        else {
            if(arr[mid]<=target && target<=arr[ei]) {
               return search(arr,mid+1,ei,target);
            }
            else {
                return search(arr,si,mid-1,target);
            }
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array :");
        for(int i=1;i<=n;i++)
        a[i]= sc.nextInt();
        System.out.println("Enter the target :");
        int target=sc.nextInt();
        int found =search(a,0,a.length,target);
        System.out.println(found);
    }
}