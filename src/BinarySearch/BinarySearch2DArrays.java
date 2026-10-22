package BinarySearch;
import java.util.Arrays;
// unsorted array
public class BinarySearch2DArrays {
    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {28, 29, 37, 49},
                       {33, 34, 38, 50}};

        System.out.print(Arrays.toString(findTarget(arr,37)));
    }

    static int[] findTarget (int[][] arr , int target){

        int row = 0;
        int column = arr[0].length - 1;    // Correct and safe for any matrix dimensions (square or rectangular) instead of arr.length - 1

        while (row < arr.length && column >= 0){
            if (arr[row][column] == target){
                return new int[] {row,column};
            }
            if (arr[row][column]  > target){
                column--;
            } else {                              // if (arr[row][column]  < target)
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}

/*


The SetupTarget: 37Starting position:row = 0 (First row)column = 3 (Last column, since arr[0].length - 1 = 4 - 1 = 3)
Initial Point: arr[0][3] = 40 (the top-right corner)Step-by-Step ExecutionIteration 1Current Position: arr[0][3] = 40
Check 1: Is 40 == 37? $\rightarrow$ No.Check 2: Is 40 > 37? $\rightarrow$ Yes.Action: Because 40 is greater than our target,
every number to the left in this row will also be too big. So, we move left by decrementing the column: column becomes 2.
Iteration 2Current Position: arr[0][2] = 30Check 1: Is 30 == 37? $\rightarrow$ No.Check 2: Is 30 > 37? $\rightarrow$
No.Action: Because 30 is smaller than our target, every number above it in this column is even smaller.
So, we move down by incrementing the row: row becomes 1.Iteration 3Current Position: arr[1][2] = 35Check 1: Is 35 == 37?
$\rightarrow$ No.Check 2: Is 35 > 37? $\rightarrow$ No.Action: 35 is still smaller than 37. We move down again: row becomes 2.
Iteration 4Current Position: arr[2][2] = 37Check 1: Is 37 == 37? $\rightarrow$ Yes!Action: We found our target.
The code immediately returns new int[] {2, 2}.SummaryThe code successfully tracked down 37 at Row 2,
Column 2 by intelligently cutting out entire rows or columns at each step, ending up with a time complexity of $O(N + M)$
instead of scanning every single element.

In your code, arr.length - 1 is used to set the starting column index to the last column of the matrix
(the top-right corner of a staircase search).However, this only works because your matrix is square (4 * 4),
meaning the number of rows equals the number of columns (arr.length is 4, and arr[0].length is also 4).


In Java, a 2D array is simply an array of 1D arrays. You can picture it as a stack of rows:

Java
int[][] arr = {
    {10, 20, 30, 40}, // <-- arr[0] (Row 0)
    {15, 25, 35, 45}, // <-- arr[1] (Row 1)
    {28, 29, 37, 49}, // <-- arr[2] (Row 2)
    {33, 34, 38, 50}  // <-- arr[3] (Row 3)

arr[0] gives you the entire first row: {10, 20, 30, 40}.  arr[1] gives you the entire second row, and so on.

Why use arr[0].length?
Because arr[0] is a 1D array containing all the elements of the first row,
asking for arr[0].length asks: "How many elements are in this row?"

For your matrix:   arr[0] has 4 elements (10, 20, 30, 40).
Therefore, arr[0].length is 4 (the total number of columns).

Why - 1?
Arrays in Java are 0-indexed, meaning indexing starts at 0.

If there are 4 columns (total length = 4), the valid column indexes are 0, 1, 2, and 3.
To point to the last column (the rightmost side), you need index 3.

That is why we write arr[0].length - 1 (4 - 1 = 3), which correctly targets the last column.



 */


