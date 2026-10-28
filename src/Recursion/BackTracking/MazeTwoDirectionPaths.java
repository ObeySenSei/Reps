package Recursion.BackTracking;
import java.util.Arrays;

public class MazeTwoDirectionPaths {
    public static void main(String[] args) {
        // A maze board with an obstacle (false) in the middle
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        // Matrix to track the step numbers
        int[][] path = new int[board.length][board[0].length];

        twoDirPaths("", board, 0, 0, path, 1);
    }

    static void twoDirPaths(String p, boolean[][] maze, int r, int c, int[][] path, int step) {

        // 1. BASE CASE: If we reached the destination (bottom-right corner)
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step; // Record final step

            // Print the grid showing the path order
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Path: " + p);
            System.out.println();
            return;
        }

        // 2. INVALID CHECK: If the cell is blocked (false), stop
        if (!maze[r][c]) {
            return;
        }

        // 3. DO: Mark current cell as visited
        maze[r][c] = false;
        path[r][c] = step;

        // 4. EXPLORE: Only 2 directions (Down and Right)
        if (r < maze.length - 1) {       // Go Down
            twoDirPaths(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {     // Go Right
            twoDirPaths(p + 'R', maze, r, c + 1, path, step + 1);
        }

        // 5. UNDO (BACKTRACK): Unmark before leaving
        maze[r][c] = true;
        path[r][c] = 0;
    }
}