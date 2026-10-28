package Recursion.BackTracking;
import java.util.ArrayList;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0}, {1,1,0,1}, {1,1,0,0}, {0,1,1,1}};
        int n = arr.length;  /// get the length of the top Row

        ArrayList<String> ans = findPaths (arr, n);
        for(String p: ans){
            System.out.println(p);
        }
    }
    static void getAns (int[][] arr, int r, int c, int n, boolean[][] visited, ArrayList<String>ans, String path){

        if(r<0 || c<0 || r>= n || c>=n || arr[r][c] == 0 || visited [r][c]) {
            return ;
        }
        if (r == n-1 && c == n-1){
            ans.add(path);
            return;
        }
        visited[r][c] = true;

        getAns (arr, r+1, c, n,visited,ans, path + "D");
        getAns (arr, r-1, c, n,visited,ans, path + "U");
        getAns (arr, r, c+1, n,visited,ans, path + "R");
        getAns (arr, r, c-1, n,visited,ans, path + "L");

        visited[r][c] = false;
    }

    static ArrayList<String> findPaths (int[][]arr, int n){

        ArrayList<String> ans = new ArrayList<>();

        if (arr[0][0] == 0){
            return ans;
        }
        boolean[][] visited = new boolean[n][n];
        getAns (arr, 0, 0, n,visited,ans, "");

        return ans;
    }
}


