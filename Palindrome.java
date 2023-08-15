import java.util.Scanner;
public class Palindrome {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt();
            int[] a= new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            pali(a);
        }
    

    public static void pali(int num[]) {
        int left=0;
        int right=num.length-1;
        int flag=0;
        while(left<=right){
        if(num[left]==num[right]) {
            flag=1;
            left++;
            right--;

        }
        else 
            flag=0;
        }
        if(flag==1) {
             System.out.println("Is palindrome");
        }
        else {
             System.out.println("Not palindrome");
        }
    }*/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev =reverse(num);
        
        palli(num,rev);
    }
    public static int reverse(int n) {
        
        int rev=0;
        while(n>0) {
        int last=n%10;
        rev= (rev*10)+last;
        n=n/10;
        }

        return rev;

    }

    public static void palli(int o,int r ) {
        if(o==r) 
        System.out.println(" Palindrome" );
        else
        System.out.println(" Not Palindrome ");
    }
    }
    
    
