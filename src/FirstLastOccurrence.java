import java.util.Arrays;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 6};

        int[] result = findOccurences(arr, 4);
        System.out.println(Arrays.toString(result));
    }

    static int[] findOccurences(int[] arr, int target) {

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;         // Recorded on the first encounter. (We lock in 2 as our first occurrence).
                }
                lastIndex = i;              // Updated on every encounter. (lastIndex becomes 2).
            }
        }
        return new int[] {firstIndex, lastIndex};
    }
}
/*

Imagine we have your array: arr = {1, 2, 4, 4, 4, 6} and we are looking for target = 4.
Before the loop starts, we initialize:    firstIndex = -1     lastIndex = -1

                                         Step-by-Step Trace

i = 0 (arr[0] = 1):
Is arr[0] == 4? No. (Do nothing)

i = 1 (arr[1] = 2):
Is arr[1] == 4? No. (Do nothing)

i = 2 (arr[2] = 4):
Is arr[2] == 4? Yes! Enter the if block:

if (firstIndex == -1): Since firstIndex is still -1, this condition is true.
firstIndex = 2; (We lock in 2 as our first occurrence).

lastIndex = 2; (lastIndex becomes 2).
i = 3 (arr[3] = 4):

Is arr[3] == 4? Yes! Enter the if block:
if (firstIndex == -1): Since firstIndex is now 2 (not -1), this condition is false. We skip changing firstIndex.
(This ensures firstIndex never changes after it's set).

lastIndex = 3; (lastIndex gets overwritten and updated to 3).
i = 4 (arr[4] = 4):

Is arr[4] == 4? Yes! Enter the if block:
if (firstIndex == -1): Still false. firstIndex remains 2.

lastIndex = 4; (lastIndex gets overwritten and updated to 4).

i = 5 (arr[5] = 6):
Is arr[5] == 4? No. (Do nothing)

Why this works so well:
Protecting firstIndex: The if (firstIndex == -1) check acts like a one-way gate.
It only allows the very first time we encounter the target to set the variable. All subsequent encounters ignore it.

Updating lastIndex: Because lastIndex = i; sits outside that inner check, it updates
every single time we find the target. As the loop marches forward, lastIndex keeps getting overwritten
with the latest index, leaving us with the final/last position when the loop ends.
 */


