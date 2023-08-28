import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add(1);
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
        Collections.sort(list);//ascending order
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//descending order
        System.out.println(list);

    }
}