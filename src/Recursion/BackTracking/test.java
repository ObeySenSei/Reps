package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        int n = 4;  /// For NxN rows and cols
        char board[][] = new char[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = ('.');
            }
        }

        List<List<String>> ans = new ArrayList<>();
        nQueensBoard(board,0,n,ans);

        for (List <String> solution : ans){
            System.out.println();
            for (String row : solution){
                System.out.println(row);
            }
        }
    }
    static boolean isSafe (char[][] board, int row, int col, int n){

        for(int i=0; i<n; i++){
            if (board[row][i] == 'Q'){       // horizontal check
                return false;
            }
        }
        for (int j=0; j<n; j++){
            if (board[j][col] == 'Q'){
                return false;
            }
        }
        for (int i=row, j=col; i>=0 && j>=0; i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        for (int i=row, j=col; i>=0 && j<n; i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    static void nQueensBoard (char[][]board, int row, int n, List<List<String>> ans){

        if (row == n){
            List<String> currentBoard = new ArrayList<>();
            for (int i=0; i<n; i++){
                currentBoard.add(new String(board[i]));
            }
            ans.add(currentBoard);
            return;
        }
        for (int j=0; j<n; j++){
            if (isSafe(board,row,j,n)){
                board[row][j] = 'Q';
                nQueensBoard(board,row + 1,n,ans);
                board[row][j] = '.';
            }
        }
    }
}

