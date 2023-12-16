import java.util.*;

public class SmallestRight {
    public static void nearestSmallestRight(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = a.length-1; i >=0; i--) {
            while (!s.isEmpty() && s.peek() >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                list.add(-1);
            } else {
                list.add(s.peek());
            }
            s.push(a[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 0, 1, 2, 4};
        nearestSmallestRight(arr);
    }
}
