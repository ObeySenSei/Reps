package CycleSort;
// https://leetcode.com/problems/find-the-duplicate-number/?q=all+missing+numbers

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("The duplicate element is: " + findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {                   /// is this the correct element that needs to be there
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i]; // Found the duplicate on-the-fly!
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/**
 * Ah, that is the exact spot where index numbers and array elements get mixed up! Let's clear that up completely.
 * When you see 4 != 2 (from Iteration 3), neither of those numbers is an index.Here is what both numbers actually mean:
 * 4 is the element currently sitting at arr[1] (after a previous swap).2 is the expected value (i + 1, which is 1 + 1 = 2).
 * The Golden Rule to Remember:Indices are just the "parking spots" (positions 0, 1, 2, 3, 4).
 * Elements are the "cars" parked inside those spots (1, 3, 4, 2, 2).
 * When the code checks:  (arr[i] != i + 1)
 * It is never comparing index to index. It is always comparing:

 * The car currently parked here  ! = The car that is legally supposed to be parked here
 * So for 4 != 2 at i = 1:arr[1] (the car parked at spot 1) is 4.i + 1 (the car that belongs at spot 1) is 2.
 * Since 4 != 2, the code says: "Hey, this car (4) doesn't belong in parking spot 1! Let's move it to where it actually belongs.


 Our starting array is [1, 3, 4, 2, 2] and i = 0.
 Step-by-Step Breakdown
 Iteration 1 (i = 0): We look at arr[0], which is 1.

 Is arr[0] unequal to its expected position value (i + 1, which is 1)? No, 1 == 1, so the if condition is false.
 We drop into the else block and increment i. Now i = 1.

 Array state: [1, 3, 4, 2, 2]
 Iteration 2 (i = 1):

 We look at arr[1], which is 3.
 Is arr[1] != 1 + 1? Yes, 3 != 2, so we enter the if block.
 We calculate its correct index: correct = arr[1] - 1 = 3 - 1 = 2.
 We check if the element is already at its correct home: arr[1] (3) != arr[2] (4). This is true, so we swap arr[1] and arr[2].

 Array state after swap: [1, 4, 3, 2, 2] (Notice i stays 1 to re-check the new element that just got swapped into this spot).
 Iteration 3 (i = 1):
 Now arr[1] is 4.
 Is 4 != 2? Yes, we enter the if block.
 Its correct index is correct = 4 - 1 = 3.
 We check: arr[1] (4) != arr[3] (2). This is true, so we swap arr[1] and arr[3].
 Array state after swap: [1, 2, 3, 4, 2] (Again, i stays 1).

 Iteration 4 (i = 1):
 Now arr[1] is 2.
 Is arr[1] != 1 + 1? No, 2 == 2, so the condition is false.
 We drop into the else block and increment i. Now i = 2.

 Array state: [1, 2, 3, 4, 2]
 Iteration 5 (i = 2):
 We look at arr[2], which is 3.
 3 == 2 + 1, so it's already in the right spot. We go to else and increment i. Now i = 3.

 Array state: [1, 2, 3, 4, 2]
 Iteration 6 (i = 3):
 We look at arr[3], which is 4.
 4 == 3 + 1, so it's in the right spot. We go to else and increment i. Now i = 4.

 Array state: [1, 2, 3, 4, 2]
 Iteration 7 (i = 4):
 We look at arr[4], which is 2.
 Is arr[4] != 4 + 1? Yes, 2 != 5, so we enter the if block.
 Its correct index is correct = 2 - 1 = 1.

 Now we check the inner condition: arr[4] != arr[1]. Here, arr[4] is 2 and arr[1] is also 2.
 Because 2 != 2 is false, it triggers the else block: return arr[i];



 */

