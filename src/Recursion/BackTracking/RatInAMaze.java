package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0}, {1,1,0,1}, {1,1,0,0}, {0,1,1,1}};
        int n = arr.length;              /// We store the length of rows i.e 4.

        ArrayList<String> ans = findPath(arr,n);
        for (String p : ans){
            System.out.println(p);
        }
    }

    static void getAns (int[][] arr, int r, int c, int n, ArrayList<String> ans, String path, boolean[][] visited){
        if(r < 0 || c < 0 || r >= n || c >= n ){        /// Out of Bounds check
            return;
        }
        if (arr[r][c] == 0 || visited[r][c]) {      /// Base Case 2: Blocked cell (mat[r][c] == 0) or already visited
            return;
        }
        if (r==n-1 && c==n-1){    /// Base Case 3: Reached destination
            ans.add(path);
            return;
        }
        visited[r][c] = true;  /// Mark the current cell as visited

        getAns (arr, r+1, c, n, ans, path + "D", visited);     // To go Down
        getAns (arr, r-1, c, n, ans, path + "U", visited);     // To go Up
        getAns (arr, r, c-1, n, ans, path + "L", visited);     // To go Left
        getAns (arr, r, c+1, n, ans, path + "R", visited);     // To go Right

        visited [r][c] = false;  /// Unmark the current cell (Backtrack)                We want to find all possible paths from the start to the destination, not just the first one we happen to stumble
    }

    static ArrayList<String> findPath (int[][]arr, int n){
        ArrayList<String> ans = new ArrayList<>();

        if (arr[0][0] == 0){
            return ans;          ///  If the starting point is blocked, no path is possible
        }
        boolean[][] visited = new boolean [n][n];

        getAns (arr, 0,0,n,ans,"",visited);
        return ans;
    }
}

/**

 If you don't unmark it: Once the first path explores that cell and marks it as true, it stays true forever.
 When the algorithm backs up and tries to explore the second route, it will look at that cell, see true,
 think "Oh, I've already been here," and skip it. You would lose valid paths.
 By unmarking it (false): You are resetting your footsteps.


 What is Ans storing? Ans is an ArrayList of String passed into the recursion.
 It acts as a collection container that stores all the successful paths found from the start cell (0, 0)
 to the destination cell (n - 1, n - 1).   Every time the rat successfully reaches the destination (r == n - 1 && c == n - 1),
 the current sequence of moves (stored in path, like "DDRDRR") is added to ans.
 By the time the entire search finishes , Ans contains every possible valid route through the maze.


 Why do we need boolean[][] visited = new boolean[n][n];
 Preventing Infinite Loops (Crucial):
 Without a visited array, the rat could easily get trapped in an infinite cycle. For example:
 The rat moves Right from cell (0,0) to (0,1).
 From (0,1), it decides to move Left back to (0,0).
 From (0,0), it moves Right to (0,1) again... and so on forever.


 Rat steps on (0, 0). Immediately, visited[0][0] = true. (It puts a "Do Not Enter - Currently Occupied" sign on this cell).
 if (mat[r][c] == 0 || visited[r][c])  return;
 Stops right here! It cannot go back to (0,0).
 Because it can't go backward, it is forced to look at its other options (like moving Down or further Right into unexplored territory).


 By marking the cell true, you tell the rat: "You are already using this cell on your current walk,
 so you are not allowed to step backward onto yourself."



 */
