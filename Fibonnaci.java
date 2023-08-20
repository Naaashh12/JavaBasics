public class Fibonnaci {

    public static int fibbonaci(int n) {
        if(n==0)
        return 0;
        else if(n==1)
        return 1;

        else 
        return fibbonaci(n-1)+fibbonaci(n-2);

    }

    public static void main (String[] args) {
        int n=9;
        System.out.println(fibbonaci(9));

    }


}