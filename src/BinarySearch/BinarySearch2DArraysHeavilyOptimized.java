package BinarySearch;
import java.util.Arrays;

public class BinarySearch2DArraysHeavilyOptimized {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,   3,  4 },
                {5,  6,   7,  8 },
                {9,  10, 11, 12 },
                {13, 14, 15, 16 }};

        int target = 9;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }
    /**
     * Searches for a target value in a 2D matrix where each row
     * is sorted and the first element of each row is greater than
     * the last element of the previous row.
     */
    public static int[] searchMatrix(int[][] matrix, int target) {
        // Base checks
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {  /// Matrix.length == 0 is to count the number of rows and Matric[0].length == 0 is to count the number of columns
            return new int[]{-1, -1};
        }

        int rows = matrix.length;                  /// rows tells us: How many floors are in this building? (For our 4x4 matrix, rows = 4).
        int cols = matrix[0].length;               /// cols tells us: How many rooms are on each floor? (For our 4x4 matrix, cols = 4).

        // Treat the 2D grid as a single flat array of size (rows * cols)
        int start = 0;
        int end = (rows * cols) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Magic Formula to convert 1D index back to 2D (row, col):     instead of the single line
            int currentRow = mid / cols;         /// To find the index of the mid in 2D format, we divide the mid element by the number of columns 7/4 = 1
            int currentCol = mid % cols;

            int midValue = matrix[currentRow][currentCol];

            if (midValue == target) {
                return new int[]{currentRow, currentCol};
            }

            if (midValue < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1;   // Search the left half
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}

/**

 int rows = matrix.length;
 int cols = matrix[0].length;

 Think of rows and cols as the architectural blueprint of your building. Without them, the code is completely blind.
 Here is why we must have them:
 1. They define how big the building is
 rows tells us: How many floors are in this building? (For our 44 matrix, rows = 4).
 cols tells us: How many rooms are on each floor? (For our 44 matrix, cols = 4).


 2. They build the 1D imaginary line (end = (rows * cols) - 1)
 Look at how rows and cols feed directly into our flat line's end point:
 rows * cols  4 * 4 = 16 total rooms.
 - 1  15 (because index starts at 0). Without rows and cols, we wouldn't know how long to stretch our imaginary 1D line!


 start = 0  This points to index 0. In our 2D grid, index 0 corresponds to matrix[0][0], which is the very first number: 1.
 end = (rows * cols) - 1  For a 4x4 matrix, 4 * 4 = 16 total elements. Since arrays are 0-indexed, the last element is at index 15.


We are starting from the absolute beginning of the entire matrix, stretched out like a single line:
start = 0  This points to index 0. In our 2D grid, index 0 corresponds to matrix[0][0], which is the very first number: 1.

end = (rows * cols) - 1  For a 44 matrix, 4 * 4 = 16 total elements.
Since arrays are 0-indexed, the last element is at index 15.

In our 2D grid, index 15 corresponds to matrix[3][3], which is the very last number: 16.
So, start = 0 and end = 15 are the boundaries of an imaginary 1D line that contains all 16 numbers of the grid.


Why do we do rows * cols instead of using rows or cols directly ?
Because a standard binary search only knows how to look at a single, straight line of numbers (like a 1D array):
Plaintext
Index:  0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15
Value: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15, 16]

If we just used rows - 1 or cols - 1, we would only be looking at the edge of the matrix, not the whole thing!
To search the entire matrix using binary search, we have to pretend the 4 rows are stacked end-to-end into one long strip of 16 total elements.


How the Magic Formula Bridges the Gap
Whenever binary search picks a middle index in that 16-item line (say, index 7), it doesn't know what row or column
that belongs to in the 2D grid. That's why we use:

int currentRow = mid / cols;  // 7 / 4 = 1 (Row 1)
int currentCol = mid % cols;  // 7 % 4 = 3 (Column 3)

This formula takes our imaginary 1D line index (7) and instantly translates it back to the exact physical room
in the 2D building (matrix[1][3], which is 8).

Those two lines (rows and cols) are the bridge between 2D reality and 1D binary search math.
They tell the code: "Here are the dimensions of the grid, so you can flatten it out, search it like lightning,
and map your way back home!


 Your previous staircase search runs in O(N+M) time. If your matrix is 10001000, it might have to take up to 2000 steps.
 This monster code uses Binary Search multiple times to crush the time complexity down to O(N+M). For that same 10001000 matrix, it takes roughly 20 steps. That’s why it's so long and terrifying—it’s heavily optimized.

 */