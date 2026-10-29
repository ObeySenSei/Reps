package Recursion.BackTracking;
import java.util.List;
import java.util.ArrayList;

public class NQueens {
    public static void main(String[] args) {

        int n = 4;
        char[][] board = new char[n][n];    /// Initialize the board with '.'

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();      ///  To store all valid solutions found by the algorithm
        nQueens(board, 0, n, ans);               ///   Kicks off the recursive backtracking from row 0, passing ans along so every successful board configuration can be saved into it.


        System.out.println("Total solutions: " + ans.size());
        for (List<String> solution : ans) {           ///  Loops through every individual solution stored inside our ans list. Each solution is one complete board layout.
            System.out.println();
            for (String row : solution) {            ///  Loops through each row of the current board layout (which is a String like ".Q..") and prints it out line by line.
                System.out.println(row);
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {
        // Horizontal check
        for (int i = 0; i < n; i++) {                 /// It checks the entire current row (row) from left to right.   Is it strictly necessary here? Actually, no! In our row-by-row backtracking approach, we only place one queen per row.
            if (board[row][i] == 'Q') return false;
        }

        // Vertical check
        for (int j = 0; j < n; j++) {                /// It checks the entire column (col) from top to bottom to see if another queen ('Q') is already sitting in that same column.
            if (board[j][col] == 'Q') return false;
        }

        // Left Diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Right Diagonal check
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static void nQueens(char[][] board, int row, int n, List<List<String>> ans) {

        if (row == n) {            /// means the algorithm has successfully placed queens in all rows from 0 to n - 1

            List<String> currentBoard = new ArrayList<>();     /// Converts char[][] board into List<String> to store in 'ans'
            for (int i = 0; i < n; i++) {
                currentBoard.add(new String(board[i]));
            }
            ans.add(currentBoard);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';             // Place Queen
                nQueens(board, row + 1, n, ans);   // Recurse to next row
                board[row][j] = '.';             // Backtracking
            }
        }
    }
}
/**

 Let's look closely at how those lines pull off that conversion:

 In Java, a row of your board is a 1D character array (char[]), like ['.', 'Q', '.', '.'].
 Passing that char[] array directly into new String(...) instantly glues those characters together
 into a clean Java String (turning it into ".Q..").

 currentBoard.add(...):We do this for all N rows in a loop so currentBoard becomes a list of strings representing the full solved board
 layout.ans.add(currentBoard):Because ans is a master list that holds all valid solutions (List<List<String>>),
 we toss our completed currentBoard into it.


 board[row][j] = 'Q' & nQueens(board, row + 1, n, ans)
 We place the queen down, and then immediately call nQueens again to handle the next row (row + 1).
 This is the recursive step going deeper into the board.


 nQueens(board, row + 1, n, ans);
 This is the most crucial part for exploring alternatives.
 Once the recursive call finishes (either because it hit a dead end or successfully found a solution and returned),
 we remove the queen and put . back.
 This resets the cell so that the for loop can move on to test the next column in that row.
 */