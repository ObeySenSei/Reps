package CycleSort;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};              /// Ans should return 2.
        System.out.println(findSmallPositive(arr));
    }
    static int findSmallPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // Added bounds check (arr[i] <= arr.length) and fixed value comparison (arr[i] != arr[correctIndex])
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // If all numbers from 1 to N are present, the answer is N + 1
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first]; // Fixed: store the array value, not the index
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/**
 They handle the special edge cases that make First Missing Positive one of the trickiest cyclic sort problems!

 Part 1: if (arr[i] > 0 && arr[i] <= arr.length)
 In standard cyclic sort, you assume every number is between 1 and N. But for this problem, your array can contain negative numbers,
 zeros, or massive numbers (like 100 in an array of size 4).
 This condition acts as a bouncer to filter out numbers that cyclic sort can't handle, preventing crashes. It has two checks:
 arr[i] > 0 (No negatives or zeros):



 If your array has a length of 4, valid indices are 0, 1, 2, 3.
 If arr[i] is 5, its correct index would be 5 - 1 = 4. Trying to access arr[4] will crash your program with an ArrayIndexOutOfBounds.


 What if the array had a number larger than the length?
 Imagine your array was {3, 5, -1, 1} (where length is still 4, but 5 is inside it):
 When the loop hits 5, the condition checks: 5 <= 4.
 That is False!

 Because it's false, the code skips trying to sort 5 (otherwise, it would look for index 5 - 1 = 4,
 which crashes the program since the array only goes up to index 3).
 So, arr.length acts as the maximum possible value that can fit into the array.



 This line handles a very specific scenario: What if the array already contains every single number from 1 to N in the correct order?
 Example:
 Suppose arr = [1, 2, 3] (Length N=3).
 After the cyclic sort runs, the array is still [1, 2, 3].
 The for loop checks every index:
 Index 0: arr[0] == 1 matches ✅
 Index 1: arr[1] == 2 matches ✅
 Index 2: arr[2] == 3 matches ✅
 Because every single number matches, the for loop finishes completely without ever hitting a return statement inside the loop.
 If the loop finishes without finding a mismatch, it means numbers 1, 2, and 3 are all present.
 Therefore, the smallest missing positive integer must be the very next number in sequence, which is arr.length + 1 (3+1=4).



 */