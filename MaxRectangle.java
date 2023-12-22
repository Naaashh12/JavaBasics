import java.util.*;
public class MaxRectangle {

    
    public static int maxAreaHistogram(int[] a) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0 ; i<a.length;i++) {
            if(s1.isEmpty()) {
                list1.add(-1);
            } else {
                while(!s1.isEmpty() && a[s1.peek()]>=a[i]) {
                    s1.pop();
                } 
                if(s1.isEmpty()) {
                    list1.add(-1);
                } else {
                    list1.add(s1.peek());
                }
            }
            s1.push(i);
        }

        for(int i=a.length-1;i>=0;i--) {
            if(s2.isEmpty()) {
                list2.add(a.length);
            } else {
                while(!s2.isEmpty()&& a[s2.peek()]>=a[i]) {
                    s2.pop();
                } 
                if(s2.isEmpty()) {
                    list2.add(a.length);
                } else {
                    list2.add(s2.peek());
                }
            }
            s2.push(i);
        }
        Collections.reverse(list2);
        //int[] area= new int[a.length];
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            int area=a[i]*(list2.get(i)-list1.get(i)-1);
            maxarea=Math.max(area,maxarea);
        }
        return maxarea;
    }

    public static int maxAreaRectangle(int[][] arr) {
        int[] ans = new int[arr.length];
        for(int j=0;j<arr.length;j++) {
            ans[j]=arr[0][j];
        }
        int area = maxAreaHistogram(ans);
        for(int i=1;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i][j]==0) {
                    ans[j]=0;
                } else {
                    ans[j]= ans[j]+arr[i][j];
                }
            }
            area = Math.max(area,maxAreaHistogram(ans));
        }
        return area;
    } 

    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.print(maxAreaRectangle(arr));
    }
}
