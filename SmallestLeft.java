import java.util.*;

public class SmallestLeft {
    public static void nearestSmallestLeft(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
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
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 0, 1, 2, 4};
        nearestSmallestLeft(arr);
    }
}
