package BinarySearch;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] arr =  {{5, 9, 14, 22},
                       {8, 12, 18, 25},
                       {15, 20, 26, 31},
                       {21, 28, 35, 40}};

        System.out.print(Arrays.toString(findTarget(arr,20)));

    }
    static int[] findTarget (int[][] arr, int target){

        int row = 0;
        int column = arr[0].length - 1;

        while (row < arr.length && column >= 0){
            if ( arr[row][column] == target){
                return new int[] {arr[row][column]};
            }
            if (arr[row][column] > target){
                column--;
            } else {
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
