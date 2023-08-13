import java.util.*;

public class Factorial {
    public static void main(String[] args) {
      Scanner inp= new Scanner(System.in);
      int n;
      System.out.println("Enter a number :");
      n=inp.nextInt();
      int fact =1;
    while(n>0) {
        fact = fact*n;
        n=n-1;
    }
    System.out.println("The factorial is given by: " + fact);
    }
}