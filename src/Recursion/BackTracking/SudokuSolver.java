package Recursion.BackTracking;
//https://leetcode.com/problems/sudoku-solver/
public class SudokuSolver {
    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    static boolean helper(char[][] board, int r, int c) {

        if (r==9){
            return true;             ///  Base case to end recursion call
        }

        int nextRow = r, nextColumn = c + 1;
        if (nextColumn == 9) {
            nextRow = r + 1;
            nextColumn = 0;
        }

        if (board[r][c] != '.') {       /// if there already exists a digit,  we move to the next Row or Column
            return helper(board, nextRow, nextColumn);
        }

        for (char digit = '1'; digit <= '9'; digit++) {        ///  If the spaces are empty, we need to place Digits
            if (isSafe(board, r, c, digit)) {            ///  Need to check if it's safe to place a digit
                board[r][c] = digit;                          ///  Place digit
                if (helper(board, nextRow, nextColumn)) {
                    return true;
                }
                board[r][c] = '.';
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int r, int c, char digit) {

        for (int i = 0; i < 9; i++) {                   /// Check Column (Horizontal)
            if (board[r][i] == digit) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {                  /// Check Row (Vertical)
            if (board[j][c] == digit) {
                return false;
            }
        }

        int startRow = (r / 3) * 3;                   /// To check inside a particular Grid
        int startCol = (c / 3) * 3;
        for (int i = startRow; i <= startRow + 2; i++) {
            for (int j = startCol; j <= startCol + 2; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("--- Before Solving ---");
        printBoard(board);

        solveSudoku(board);          /// Call the helper method

        System.out.println("\n--- After Solving---");
        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r > 0 && r % 3 == 0) {
                System.out.println("------+-------+------");
            }
            for (int c = 0; c < 9; c++) {
                if (c > 0 && c % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}







