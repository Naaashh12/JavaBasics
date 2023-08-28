import java.util.*;
public class MaximumArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        list.add(75);
        list.add(5);
        list.add(7);
        list.add(99);
        list.add(3);
        for(int i=list.size()-1;i>=0;i--) {
            max = Math.max(max,list.get(i));
           
        }
        System.out.println(max + " ");
        }
}