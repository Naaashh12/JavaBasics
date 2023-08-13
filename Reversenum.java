import java.util.*;

 public class Reversenum {
    public static void main (String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        int lastdig=0;
        while(num>0) {
            lastdig= num%10;
            rev=(rev*10)+lastdig;
            num = num/10;
        }
        System.out.println(rev);
    }
 }