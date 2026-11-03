package Recursion.BackTracking;

public class test {
    public static void main(String[] args) {
        int grid[][] = {
                {0,  5, 14,  9, 20},
                {13,  8, 19,  4, 15},
                {18,  1,  6, 21, 10},
                {7, 12, 23, 16,  3},
                {24, 17,  2, 11, 22}
        };

        boolean result = checkValid(grid);
        System.out.println("Is the grid valid ? " + result );
    }

    static boolean isValid(int[][]grid, int row, int col, int n, int expectedVal){

        if (row<0 || col<0 || row >= n || col>=n || grid[row][col] != expectedVal ){
            return false;
        }
        if (expectedVal == n*n - 1){
            return true;
        }
        return  isValid(grid, row - 2, col + 1, n, expectedVal + 1) ||
                isValid(grid, row - 1, col + 2, n, expectedVal + 1) ||
                isValid(grid, row + 1, col + 2, n, expectedVal + 1) ||
                isValid(grid, row + 2, col + 1, n, expectedVal + 1) ||
                isValid(grid, row + 2, col - 1, n, expectedVal + 1) ||
                isValid(grid, row + 1, col - 2, n, expectedVal + 1) ||
                isValid(grid, row - 1, col - 2, n, expectedVal + 1) ||
                isValid(grid, row - 2, col - 1, n, expectedVal + 1);
    }
    static boolean  checkValid (int[][] grid){
        int n = grid.length;

        if (grid[0][0] != 0){
            return false;
        }
        return isValid(grid,0,0,n,0);

    }
}
