import java.util.*;

public class Primenum {
    public static void main(String[] args) {
    
        System.out.println("Enter a number to check ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        Boolean flag=true;
        if(num ==2)
        {
            System.out.println("The number is prime");
        }
        else {
        for(int i=2; i<num-1;i++) {
            if(num%i== 0 ) {
                flag=false;
            }
    
        }
        if(flag==true) {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
    }
}
}