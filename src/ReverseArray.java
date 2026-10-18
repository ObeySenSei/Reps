import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4};
        int[] reverse = findReverse(arr);
        System.out.println(Arrays.toString(reverse));
    }
    static int[] findReverse (int[] arr){

        int[] newArr = new int [arr.length];  //  create new array of size of the original array.

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            newArr[start] = arr[end];
            newArr[end] = arr[start];
            start++;
            end--;
        }
        if (arr.length % 2 != 0){
             newArr[start] = arr[start];       // START contains the last updated value (2 here), which accounts for
        }                                     //  array size with odd elements.  It helps us to fill the mid-position in
        return newArr;                        //                       the newArr
    }
}

/*
Here we are creating a new array.
arr[2] contains the value 3.
Therefore, it copies 3 into index 2 of the new array.

 */