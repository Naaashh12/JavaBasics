import java.util.*;
public class KLargest {

    public static int findKlargest(int[] a,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<a.length;i++) {
            pq.add(a[i]);
            if(pq.size()>k) {
                pq.remove();
            }
        }
        return pq.peek();

    }
    public static void main(String[] args ) {
        int[] arr ={7,10,4,3,20,15};
        int k=1;
        System.out.print(findKlargest(arr,k));
    }
}


