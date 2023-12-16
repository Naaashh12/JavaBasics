import java.util.*;
import java.util.ArrayList;
public class NearestGreatLeft {

    public static void nearestgrestestleft(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<a.length;i++) {
            if(s.isEmpty()) {
                list.add(-1);
            } else {
                while(!s.isEmpty()&& s.peek()<=a[i]) {
                    s.pop();
                } 
                if(s.isEmpty()){
                     list.add(-1);
                } else {
                    list.add(s.peek());
                }
            }
            s.push(a[i]);
        }
        System.out.print(list);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,0,1,2,4};
        nearestgrestestleft(arr);
    }
}
