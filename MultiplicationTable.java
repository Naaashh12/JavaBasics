import java.util.*;

public class MultiplicationTable {
    public static void main (String[] args) {
      Scanner inp= new Scanner(System.in);
      int n;
      System.out.println("Enter a number :");
      n=inp.nextInt();
      for (int i=1;i<=10;i++) {
        int mul = n*i;
        System.out.println( n + " * " + i + " = " + mul);
      }
    }
}