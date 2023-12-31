public class Occurance {
    public static int firstoccurance(int[] a, int key) {
        int start=0;
        int end=a.length-1;
        int res=-1;
        while(start<=end) {
            int mid= start+(end-start)/2;
            if(key==a[mid]){
                res= mid;
                end=mid-1;
            } else if(key<=a[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }

        return res;
    }

    public static int lastoccurance(int[] a, int key) {
        int start=0;
        int end=a.length-1;
        int res=-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(key==a[mid]){
                res=mid;
                start=mid+1;
            } else if( key<= a[mid]) {
                end= mid-1;
            } else {
                start=mid+1;
            }
        } 
        return res;

    }
    public static void main(String[] main) {
        int[] arr = {5,7,10,10,10,15,20};
        int key=10;
        System.out.print("Starting index : " + firstoccurance(arr, key)+ "\n");
        System.out.print("Ending index : " +lastoccurance(arr,key)+ "\n");
    }
    
}
