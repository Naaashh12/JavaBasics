public class MouseMaze {
    
    public static void printmaze(int[][] sol) {
        for(int i=0; i<sol.length;i++) {
            for(int j=0;j<sol.length;j++) {
                System.out.print(sol[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static boolean solvemaze(int[][] maze) {
        int n = maze.length;
        int[][] sol = new int[n][n];
        if(solvemazeuntil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        printmaze(sol);
        return true;
    }

    public static boolean isSafe(int[][] maze, int i, int j) {
        int n = maze.length;
        if(i<n && j<n && i>=0 && j>=0 && maze[i][j]==1) {
            return true;
        }  
        return false;

    }
    public static boolean solvemazeuntil(int[][] maze, int i, int j, int[][] sol) {
        //reached destination
        
        if(i== maze.length-1 && j==maze.length-1 && maze[i][j]==1) {
            sol[i][j]=1;
            return true;
        }
        //if not destination check for other cells
        if(isSafe(maze,i,j)==true) {
            if(sol[i][j]==1) //if visited mark false
                return false;
            sol[i][j]=1; // if not visisted mark as visited if safe
            if (solvemazeuntil(maze, i+1,j,sol)) //down
                return true;
            if (solvemazeuntil(maze,i,j-1,sol)) //right
                return true;
            if (solvemazeuntil(maze,i,j+1,sol)) //left
                return true;
            if (solvemazeuntil(maze,i-1,j,sol)) //up
                return true;
            sol[i][j]=0; //mark unvisited if no solution exits; 
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][]= {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 } 
        };
        solvemaze(maze);
    }
}