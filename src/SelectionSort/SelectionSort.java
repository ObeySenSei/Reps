package SelectionSort;

import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 1};

        for (int i = 0; i < arr.length - 1; i++) {    // i < length - 1 because after placing the first 3 elements correctly, the fourth element must already be in its correct position.

            int minIndex = i;       // let's assume arr[0] has the lowest value ...  We initially assume 2 is the minimum.

            for (int j = i + 1; j < arr.length; j++) {       // if i=0 already has the lowest element, we dont need to check it with itself
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];                // arr[i]     i.e     arr[0] is 2, so temp = 2.
            arr[i] = arr[minIndex];           //                    arr[0] becomes arr[3], which is 1.
            arr[minIndex] = temp;             //                    arr[3] becomes temp, which is 2.
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*

i < arr. length - 1 because,
a)  By the time the outer loop reaches the second-to-last element, the final remaining element is already guaranteed
to be in its correct sorted position (the largest or smallest, depending on order).
b)  Avoiding Redundancy: If the loop went all the way to i < array.length, it would perform an unnecessary
final iteration where it compares a single element against itself, which serves no purpose.
c)  Preventing Index Errors: Because the inner loop (j) starts at i + 1, stopping the outer loop at length - 1 ensures
that the inner loop never attempts to access an index outside the array's boundaries

arr[0] = arr[3];
arr[0] = 1

Array is now {1, 5, 4, 1}.
after
arr[minIndex] = temp
[1, 5, 4, 2]

The rule: for an array of n elements, Selection Sort needs at most n - 1 passes. The last element takes care of itself.

*/
