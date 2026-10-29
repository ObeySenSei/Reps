package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        int n = 5;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] ='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        NQueens(board, 0, n, ans);


        System.out.println("Total Soltuions: " + ans.size());
        for (List<String> solution : ans) {
            System.out.println("New Solution : ");
            for (String row : solution) {
                System.out.println(row);
            }
        }
    }
    static boolean isSafe (char[][]board, int r , int c, int n){
        for (int i=0; i<n; i++){
            if (board[r][i] == 'Q'){
                return false;
            }
        }
        for (int j=0; j<n; j++){
            if (board[j][c] == 'Q'){
                return false;
            }
        }
        for (int i=r, j=c; i>=0 && j>=0; i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        for (int i=r, j=c; i>=0 && j<n; i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static void NQueens(char[][] board, int r, int n, List<List<String>> ans){

        if (r==n){
            List<String> currentB = new ArrayList<>();
            for (int i=0; i<n; i++){
                currentB.add(new String (board[i]));
            }
            ans.add(currentB);
            return;
        }
        for (int j=0; j<n; j++){
            if (isSafe(board, r,j,n)){
                board[r][j] = 'Q';
                NQueens(board,r+1,n,ans);
                board[r][j] = '.';
            }
        }
    }
}
