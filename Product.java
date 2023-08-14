import java.util.*;
public class Product {
    public static int multiply(int num1, int num2) {
        int prodt = num1*num2;
        return prodt;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);//this variable prod and prodt are different
        System.out.println(prod);
    }
}