import java.util.Scanner;
public class Sumofdigits {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=sumdigit(n);
        System.out.println("The sum of digits in "+n+" = "+ sum);
    }
    public static int sumdigit(int num) {
        int last=0;
        int sum=0;
        while(num>0) {
        last=num%10;
        sum=sum+last;
        num=num/10;
        }
        return  sum;
    }
}
