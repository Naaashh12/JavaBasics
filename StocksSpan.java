import java.util.*;
public class StocksSpan {

    public static void stockspan(int[] arr) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i<arr.length;i++) {
            if(s.isEmpty()) {
                list.add(-1);
            } else {
                while(!s.isEmpty()&& arr[s.peek()]<=arr[i]) {
                    s.pop();
                }
                if(s.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(s.peek());
                }
            }
            s.push(i);
        }
        for(int i =0; i<arr.length;i++) {
            System.out.print(i-list.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {100, 80, 60, 70, 60, 75, 85};
        stockspan(a);
    }
}
