package Recursion;

public class ArraySorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted (int[]arr, int index){

        if (index == arr.length - 1){     // A base case tells recursion when to stop making further recursive calls.
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}

/*
We call the method isSorted and pass two arguments to the isSorted Method.
static - Allows main to call the method directly through the class, without creating an object.

isSorted(arr, index + 1) - moves the checking position forward by one index.
The arr remains the same array. The index changes with each recursive call.


Suppose the array is:  {1, 2, 4, 3, 5};
At index 2, your comparison becomes: arr[2] < arr[3]

Substitute the values: 4 < 3

This is false.
Since the current pair is not in ascending order, the entire array cannot be strictly ascending. The method returns false.
Java's && operator also uses short-circuit evaluation: if the left side is false, Java doesn't evaluate the right side.
Therefore, it doesn't need to make another recursive call after discovering a pair that violates the condition.

When 4 < 3, the call isSorted(arr,2) becomes false and isSorted(arr, 3) is not actually executed.
It's coming back up the call stack, carrying the false result with it.

 */