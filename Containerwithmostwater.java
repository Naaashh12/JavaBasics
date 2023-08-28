import java.util.*;
public class Containerwithmostwater {
    public static int findsol(ArrayList<Integer> heights) {
        int lp=0;
        int rp = heights.size()-1;
        int maxwater=0;
        while(lp<rp) {
            //calculate stored water
            int ht = Math.min(heights.get(lp),heights.get(rp));
            int width = rp-lp;
            int curwater=  ht*width;
            maxwater= Math.max(curwater,maxwater);
            //pointer update
            if(heights.get(lp)<heights.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        System.out.print(findsol(heights));
    }
}