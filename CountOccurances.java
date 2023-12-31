public class CountOccurances {
    public static int firstoccurnaces(int[] a, int key) {
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
    public static void main (String[] args) {
        int[] arr = {2,9,10,10,10,18,20};
        int key=10;
        System.out.print("First occurnaces of "+key+" : " +firstoccurnaces(arr, key)+"\n");
        System.out.print("Last occurnaces "+key+" : "+lastoccurance(arr, key)+"\n");
        int total= lastoccurance(arr,key)-firstoccurnaces(arr, key)+1;
        System.out.print("Total occurnaces of "+key+" : "+total+"\n");

    }
}
