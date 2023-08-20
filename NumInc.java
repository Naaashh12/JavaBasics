public class NumInc {
    public static void inc(int n) {
        if(n==10) {
            System.out.print(n);
            return;
        }
        System.out.println(n);
        inc(n+1);

    }
    public static void main(String[] args) {
        int n=1;
        inc(n);
    }
}