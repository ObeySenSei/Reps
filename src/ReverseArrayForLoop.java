import java.util.Arrays;

public class ReverseArrayForLoop {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4};
        findReverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void findReverse (int[] arr) {
        int end = arr.length - 1;

        for (int start = 0; start < arr.length / 2; start++){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;              // remember TEMP stores an actual value not an Index.
            end--;
        }
    }
}

/*

Here we are directly modifying the original array.

The key idea: start++ moves the left pointer right, while end-- moves the right pointer left.
Both are necessary to swap opposite pairs correctly.

 */
