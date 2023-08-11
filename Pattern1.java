import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int rows, cols;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        rows = in.nextInt();
        cols = in.nextInt();
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}