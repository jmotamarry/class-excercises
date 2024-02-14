public class recursiveMaze {
    private static final int[][] MAZE = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 1, 0, 1, 0, 1, 0, 1},
        {1, 1, 0, 1, 0, 0, 0, 1, 0, 1},
        {1, 1, 0, 1, 0, 1, 0, 1, 0, 1},
        {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 0, 1}
    };

    // search from (1, 1)
    public static boolean solve(int row, int col) {
        int endCol = 8;
        int endRow = 7;
        if (MAZE[row][col] == 0) {
            MAZE[row][col] = 3;
        } else if (MAZE[row][col] == 3){
            MAZE[row][col] = 0;
        }

        for (int i = 0; i < MAZE.length; i++) {
            for (int j = 0; j < MAZE[0].length; j++) {
                System.out.print(MAZE[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        
        if (row == endRow && col == endCol) {
            return true;
        }
        if (MAZE[row][col + 1] == 0) {
            solve(row, col + 1);
        }
        if (MAZE[row + 1][col] == 0) {
            solve(row + 1, col);
        }
        if (MAZE[row][col - 1] == 0) {
            solve(row, col - 1);
        }
        if (MAZE[row - 1][col] == 0) {
            solve(row - 1, col);
        }
        return false;
    }

    public static void main (String[] args) {
        int startCol = 1;
        int startRow = 1;
        System.out.println(solve(startRow, startCol));
    }
}