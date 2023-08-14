import java.util.Scanner;
public class Swapfunc {
    public static void swap(int a,int b) {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}