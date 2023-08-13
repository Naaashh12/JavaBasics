import java.util.*;
public class Incometax {
    public static void main(String[] args) {
        System.out.println("Enter income in rupees");
        Scanner in= new Scanner(System.in);
        int income = in.nextInt();
        int tax;
        income = in.nextInt();
        
            if(income < 500000){
                tax = 0;
            }
            else if(income >= 500000 && income <= 100000) {
                tax = (int) (income * 0.2);
            }
            else {
                tax = (int) (income * 0.3);
            }
            System.out.println("The tax is : " + tax);
        }
    }

