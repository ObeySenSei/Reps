package Recursion.BackTracking;
import java.util.ArrayList;

public class RatInAMazeOptimized {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0}, {1,1,0,1}, {1,1,0,0}, {0,1,1,1}};
        int n = arr.length; // Length of rows (4)

        ArrayList<String> ans = findPath(arr, n);
        for (String p : ans){
            System.out.println(p);
        }
    }

    static void getAns(int[][] arr, int r, int c, int n, ArrayList<String> ans, String path) {
        if (r < 0 || c < 0 || r >= n || c >= n) {
            return;
        }
        if (arr[r][c] == 0 || arr[r][c] == -1) {       /// Base Case 2: If cell is blocked (0) or already visited (-1)
            return;
        }
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        /// Mark the current cell as visited by changing it to -1
        arr[r][c] = -1;

        // Explore all 4 directions
        getAns(arr, r + 1, c, n, ans, path + "D");     // Down
        getAns(arr, r - 1, c, n, ans, path + "U");     // Up
        getAns(arr, r, c - 1, n, ans, path + "L");     // Left
        getAns(arr, r, c + 1, n, ans, path + "R");     // Right

        /// Unmark the current cell (Backtrack) by restoring it back to 1
        arr[r][c] = 1;
    }

    static ArrayList<String> findPath(int[][] arr, int n) {

        ArrayList<String> ans = new ArrayList<>();
        if (arr[0][0] == 0) {
            return ans;
        }

        /// Call recursion directly without creating a visited array
        getAns(arr, 0, 0, n, ans, "");
        return ans;
    }
}