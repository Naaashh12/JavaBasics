public class PowerOptimised {
    public static int power(int x,int n) {
        if(n==0)
        return 1;
        int halfpow=power(x,n/2);
        int halfpowsqr=halfpow*halfpow;
        if(n%2!=0)
        halfpowsqr=x*halfpowsqr;

        return halfpowsqr;
    }

    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(power(x,n));
    }

}
