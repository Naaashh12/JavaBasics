import java.util.Scanner;
public class BinomialCoeff {
    public static int factorial(int num) {
        /*if (num==0) {
            return 1;
        }
        if(num==1) {
            return 1;
        }
        else {
        int factor = num * factorial(num-1);
        return factor;
        }*/
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bino(int n,int r) {
        int c = factorial(n)/(factorial(r)*factorial(n-r));
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bino(n,r));
    }
}
