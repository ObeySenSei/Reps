import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);                  // After this method call, the original array has been modified.

        System.out.println("The array after moving 0s to the end: " + (Arrays.toString(arr)));

    }
    static void moveZeroes (int[] arr){

        int index = 0;

        for (int i=0; i < arr.length; i++){

            if (arr[i] != 0){                // say 1 is != 0,
                arr[index] = arr[i];         // then 0 gets replaced with 1
                index++;
            }                                // when 12 is placed at arr[2], index is incremented to 3.
        }

        while (index < arr.length){
            arr[index] = 0;              // arr[3] becomes 0. [1,3,12,0,_]
            index++;                     // index becomes 4.
        }
    }
}
/*
modify the original array itself, rather than creating a second array to store the answer.

1. index tracks where the next nonzero element should go.
2. The for loop scans the array. Whenever it finds a nonzero element, it copies it to arr[index] and increments index.
3. The while loop fills every remaining position with zero, starting at index and stopping at arr.length.

 */
