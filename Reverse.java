import java.util.*;


public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number which you want to reverse");
        int num;
        Scanner sc = new Scanner(System.in);
        num  = sc.nextInt();
        while(num>0) {
            int last = num%10;
            System.out.print(last +" ");
            num=num/10;
        }
        
    }
}