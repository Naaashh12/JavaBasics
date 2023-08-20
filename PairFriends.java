public class PairFriends {
    public static int pairs(int n) {
        //int totways=0;
        if(n==1||n==2)
        return n;

        /*int single = pairs(n-1);
        int pair =(n-1)*pairs(n-2);
        totways= single+pair;
        return totways;*/

        return pairs(n-1)+(n-1)*pairs(n-2);

        
    }
    public static void main(String[] args) {

        System.out.println(pairs(3));
    }
}