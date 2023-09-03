public class Knightstour1 {
    public static void solve(int[][]  board , int row , int col, int move) {
        //base-codition
        if(row<0|| row >=board.length || col<0 || col>=board.length ||board[row][col]!=0 ) {
            return;
        } else if( move == board.length*board.length) {
            board[row][col]=move;
            displayboard(board);
            board[row][col]=0;
            return;
        }
        //recursion
        board[row][col]=move;
        solve(board, row-1, col-2, move+1);
        solve(board, row-1, col+2, move+1);
        solve(board, row+1, col-2, move+1);
        solve(board, row+1, col+2, move+1);
        solve(board, row-2, col-1, move+1);
        solve(board, row-2, col+1, move+1);
        solve(board, row+2, col-1, move+1);
        solve(board, row+2, col+1, move+1);
        //backtracking
        board[row][col]=0;
    }
    public static void displayboard(int[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = new int [5][5];
        int row = 0;
        int col = 0;
        solve(board,row,col,1);
    }
}