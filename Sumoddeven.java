import java.util.*;

public class Sumoddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of input string");
        int n =sc.nextInt();
        int evensum=0;
        int oddsum=0;
        int i;
        int num[]= new int[n];
        for(i=0;i<n;i++) {
            num[i]=sc.nextInt();
        }
        for(i=0;i<n;i++) {
            if(num[i]%2==0) {
                evensum+=num[i];
            }
            else {
                oddsum+=num[i];
            }
        }
        System.out.println("Oddsum is: " + oddsum + " even sum is: " + evensum);
    }
}