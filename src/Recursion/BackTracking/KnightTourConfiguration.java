package Recursion.BackTracking;

public class KnightTourConfiguration{
    public static void main(String[] args) {
        int[][] grid = {
                {0,  5, 14,  9, 20},
                {13,  8, 19,  4, 15},
                {18,  1,  6, 21, 10},
                {7, 12, 23, 16,  3},
                {24, 17,  2, 11, 22}
        };

        boolean result = checkValidGrid(grid);
        System.out.println("Is the grid a valid knight tour? " + result);
    }

    public static boolean isValid(int[][] grid, int r, int c, int n, int expectedValue) {
        /// Base case: Invalid move (out of bounds or wrong value)
        if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] != expectedValue) {
            return false;
        }
        /// Base case: for the last move
        if (expectedValue == n * n - 1) {
            return true;
        }

        /// Recursive calls for all 8 possible knight moves
        return  isValid(grid, r - 2, c + 1, n, expectedValue + 1) ||
                isValid(grid, r - 1, c + 2, n, expectedValue + 1) ||
                isValid(grid, r + 1, c + 2, n, expectedValue + 1) ||
                isValid(grid, r + 2, c + 1, n, expectedValue + 1) ||
                isValid(grid, r + 2, c - 1, n, expectedValue + 1) ||
                isValid(grid, r + 1, c - 2, n, expectedValue + 1) ||
                isValid(grid, r - 1, c - 2, n, expectedValue + 1) ||
                isValid(grid, r - 2, c - 1, n, expectedValue + 1);
    }

    /// LeetCode wrapper method matching the standard checkValidGrid signature
    public static boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] != 0) {      /// A valid tour should always start at (0, 0) with value 0
            return false;
        }

        return isValid(grid, 0, 0, n, 0);    /// Kicks off the recursion starting from (0, 0) looking for expectedValue = 0
    }
}