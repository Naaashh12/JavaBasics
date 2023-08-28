import java.util.*;
public class SwapArrayList {
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        list.add(75);
        list.add(5);
        list.add(7);
        list.add(99);
        list.add(3);
        list.add(6);
        list.add(19);
        list.add(39);
        list.add(65);
        System.out.println(list);
        int idx1=3, idx2=5;
        Swap(list, idx1, idx2);
        System.out.println(list);
        
    }
}