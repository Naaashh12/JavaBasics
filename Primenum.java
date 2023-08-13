import java.util.*;

public class Primenum {
    public static void main(String[] args) {
        System.out.println("Enter range of numbers ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a number to check ");
        int num = sc.nextInt();
        int flag=0;
        for(int i=2; i<n;i++) {
            if(num%i!=0&& ) {
                flag=1;
            }
        }
        if(flag==1) {
            System.out.println("The number is prime"+num);
        }
        else {
            System.out.println("The number is not prime");
        }
    }
}