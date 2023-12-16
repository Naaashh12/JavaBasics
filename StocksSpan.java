import java.util.ArrayList;
import java.util.Stack;

public class StocksSpan {
    public static void stockspan(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<a.length;i++) {
            if(s.isEmpty()){
                list.add(-1);
            } else {
                while(!s.isEmpty()&&s.peek()<=a[i]) {
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
        for(int i =0;i<a.length;i++) {
            span.put(i-list.get(i));
        }
    }

    public static void main(String[] args) {
        int[] arr ={100,80,60,70,60,85,100};
        stockspan(arr);
    }
}
