package Recursion.BackTracking;
public class NKnightsClean {

    // The 4 backward directions a previous knight could attack from
    // given our top-left to bottom-right traversal order
    private static final int[][] ATTACK_OFFSETS = {
            {-2, -1},
            {-1, -2},
            {-2,  1},
            {-1,  2}
    };

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        placeKnights(board, 0, 0, n);
    }

    static void placeKnights(boolean[][] board, int row, int col, int knightsLeft) {
        // Base Case: All knights placed successfully
        if (knightsLeft == 0) {
            display(board);
            System.out.println("--------------------");
            return;
        }

        int n = board.length;

        // Base Case: Reached past the last row
        if (row == n) {
            return;
        }

        // If we reach the end of a row, move to the beginning of the next row
        if (col == n) {
            placeKnights(board, row + 1, 0, knightsLeft);
            return;
        }

        // Choice 1: Place a knight if the cell is safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            placeKnights(board, row, col + 1, knightsLeft - 1);
            board[row][col] = false; // Backtrack
        }

        // Choice 2: Skip this cell and move to the next column
        placeKnights(board, row, col + 1, knightsLeft);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int[] offset : ATTACK_OFFSETS) {
            int nextRow = row + offset[0];
            int nextCol = col + offset[1];

            if (isValid(board, nextRow, nextCol) && board[nextRow][nextCol]) {
                return false; // Found an attacking knight
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "K " : "X ");
            }
            System.out.println();
        }
    }
}