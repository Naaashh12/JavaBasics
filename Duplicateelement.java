public class Duplicateelement {
    public static void duplicate(int arr[]) {
        int n=arr.length;;
        int flag=0;
        for(int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if(arr[i]==arr[j])
                flag=1;
                else
                flag=0;
            }
        }
        if(flag==1)
        System.out.print("False");
        else
        System.out.print("True");

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        duplicate(a);
    }
}