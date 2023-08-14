import java.util.*;
public class Fact {
    public static int factorial(int num) {
        if (num==0) {
            return 1;
        }
        if(num==1) {
            return 1;
        }
        else {
        int factor = num * factorial(num-1);
        return factor;
        }
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}