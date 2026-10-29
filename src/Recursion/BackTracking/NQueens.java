package Recursion.BackTracking;
import java.util.List;
import java.util.ArrayList;
// https://leetcode.com/problems/n-queens/description/

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
            System.out.println("New Solution : ");
            for (String row : solution) {            ///  Loops through each row of the current board layout (which is a String like ".Q..") and prints it out line by line.
                System.out.println(row);
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {
        // Horizontal check
        for (int i = 0; i < n; i++) {                 /// It checks the entire current row (row) from left to right.   Is it strictly necessary here? Actually, no! In our row-by-row backtracking approach, we only place one queen per row.
            if (board[row][i] == 'Q') return false;   /// Notice that the loop variable i is used as the column index because it is the second parameter in board[row][i].  It keeps the current row fixed while changing the column (i).
        }                                             /// It scans that entire row horizontally from left to right, checking every square to see if a queen ('Q') is already sitting there.

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



 We chose j to represent the column because we are iterating horizontally across every single square available in the current row.
 Think about it like this:
 Your function is given a specific row to work on (e.g., row = 0, then later row = 1, etc.).
 Within that single row, the only thing that changes is the column position.
 As the loop runs, j acts as our column index, letting us test every square from left to right:

 When j = 0, it checks board[row][0]
 When j = 1, it checks board[row][1]
 When j = 2, it checks board[row][2]

 And so on, up to n - 1.
 So j is just our way of saying: "Let's try placing the queen in column 0 of this row, and if that doesn't work,
 let's move to column 1, then column 2, and test them one by one."



 Here is the step-by-step breakdown of what this exact block does:
 List<String> currentB = new ArrayList<>();
 Creates a brand-new, empty list that will hold our row-by-row snapshot.
 for (int i = 0; i < n; i++)
 Loops through every single row index (i) of the board from top to bottom.

 currentB.add(new String(board[i]));
 board[i] grabs the character array for that specific row (for example: ['.', 'Q', '.', '.']).
 new String(...) glues those characters together into a clean, text-based Java String (".Q..").
 .add(...) puts that newly minted string into your currentB list.
 By the time this loop finishes, currentB is a completely independent, frozen copy of the winning board layout,
 ready to be safely stored in your final ans list!

 */