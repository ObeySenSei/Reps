package Recursion.BackTracking;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        // A clean 3x3 board where all cells are open (true)
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // Matrix to track the step numbers of the path
        int[][] path = new int[board.length][board[0].length];

        allPathPrint("", board, 0, 0, path, 1);
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {

        // 1. BASE CASE: If we reached the destination (bottom-right)
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step; // Record final step

            // Print the grid showing the path order
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Moves: " + p);
            System.out.println();
            return;
        }

        // 2. INVALID CHECK: If the cell is blocked or already visited in this path, stop
        if (!maze[r][c]) {
            return;
        }

        // ==========================================
        // 3. DO: Mark current cell as visited
        // ==========================================
        maze[r][c] = false;
        path[r][c] = step;

        // ==========================================
        // 4. EXPLORE: Try moving in all 4 directions
        // ==========================================

        // Go Down
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        // Go Right
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        // Go Up
        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        // Go Left
        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // ==========================================
        // 5. UNDO (BACKTRACK): Clean up before leaving this function
        // This lets other paths use this cell later!
        // ==========================================
        maze[r][c] = true;
        path[r][c] = 0;
    }
}