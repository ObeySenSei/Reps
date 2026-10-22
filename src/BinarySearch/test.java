package BinarySearch;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,   3,  4 },
                {5,  6,   7,  8 },
                {9,  10, 1, 12 },
                {13, 14, 15, 16 }};

        int[] result = findIndex(arr,15);
        System.out.println(Arrays.toString(result));
    }
    static int[] findIndex (int[][] arr, int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return new int[]{-1, -1};
        }
        int row = arr.length;
        int column = arr[0].length;

        // Treat the 2D grid as a single flat array of size (rows * cols)
        int start = 0;
        int end = (column * row) - 1;

        // Magic Formula to convert 1D index back to 2D (row, col):     instead of the single line
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int currentR = mid / column;       // To find the index of the mid in 2D format, we divide the mid element by the number of columns 7/4 = 1
            int currentC = mid % column;

            int midValue = arr[currentR][currentC];

            if (midValue == target) {
                return new int[] {currentR, currentC};
            }
            if (midValue > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[] {-1,-1};
        }
    }




