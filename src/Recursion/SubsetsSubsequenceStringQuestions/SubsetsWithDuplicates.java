package Recursion.SubsetsSubsequenceStringQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(getSubsets(arr));
    }

    static List<List<Integer>> getSubsets(int[] arr) {
        Arrays.sort(arr); /// Step 1: Sort to group duplicates together


        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); /// Start with the empty subset

        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
           /// Step 2: Handle duplicates
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1; /// Only look at newly added subsets from the last step
            } else {
                start = 0; /// Look at all subsets for unique elements
            }

            end = outer.size() - 1;
            int n = outer.size();

            /// Step 3: Expand the list
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
/**
 1. The Core Concept (The "Elevator Pitch")
 Approach: Iterative "snowball" expansion (instead of recursion/backtracking).
 We start with an empty subset [[]] and progressively fold each number in the array
 into existing subsets to double the pool of combinations.


 Handling Duplicates: To avoid redundant combinations (like generating [2] or [1, 2] twice),
 we sort the array first and use smart pointer tracking (start and end) to ensure duplicate elements only append themselves to the batches created in the immediately preceding step.
 🔑 3. Know Your Variables (Your Interview Talking Points)


 If an interviewer asks what each variable does, have these definitions ready:
 outer (List<List<Integer>>): The master collection holding all generated subsets.
 We declare it using the List interface for best practice and flexibility.
 i (Outer Loop): Iterates through each unique element in the sorted input array (nums[i]).


 start (Inner Loop Lower Bound): Controls where the inner loop starts copying from.
 Defaults to 0 for unique elements (copies all existing subsets).
 Shifts to end + 1 for duplicates (skips old subsets to prevent duplication).
 end (The Checkpoint Marker): Remembers the last index of the previous iteration's batch (outer.size() - 1).
 It feeds into start when a duplicate is hit.


 n (The Frozen Ceiling / outer.size()): Locks the size of the list right before the inner loop runs.
 Crucial: Prevents an infinite loop since we are actively adding items to outer while looping.


 The Duplicate Check (i > 0 && nums[i] == nums[i - 1]):


 Why i > 0? Protects against an ArrayIndexOutOfBoundsException when looking at the first element.
 Why nums[i] == nums[i - 1]? Detects if the current element is a repeat of the previous one.


 The Pointer Shift (start = end + 1):
 Why? When a duplicate is found, we restrict our inner loop to only append the number to the subsets created in the previous step,
 completely bypassing older combinations.



 To see how those subsets are skipped, let's look at the exact index map of your outer list right before the second 2 is processed:
 🗺️ The Map of outer right now:
 Index 0: [] (Old subset from the start)
 Index 1: [1] (Old subset from processing 1)
 Index 2: [2] (Freshly created during the first 2)
 Index 3: [1, 2] (Freshly created during the first 2)
 🛑 What would happen without the skip (start = 0)?
 If we didn't have the duplicate-checking logic, start would default to 0. The inner loop would run from j = 0 to 3, meaning it would touch every single item:
 j = 0  Grabs [], adds 2  Creates [2]      🛑 (Duplicate! We already have this at index 2)
 j = 1  Grabs [1], adds 2  Creates [1, 2]  🛑 (Duplicate! We already have this at index 3)
 j = 2  Grabs [2], adds 2  Creates [2, 2]  ✅
 j = 3  Grabs [1, 2], adds 2  Creates [1, 2, 2] ✅
 ✨ How the code cleanly skips indices 0 and 1:
 Because the code detects a duplicate (arr[2] == arr[1]), it triggers this line:
 start = end + 1;


 What was end? It was saved as 1 (marking the end of the previous batch, right at [1]).
 What does start become? 1 + 1 = 2.
 How does the loop change? Your inner loop is now built like this:

 for (int j = 2; j < 4; j++) { ... }



 Because j starts counting at 2, the computer completely ignores indices 0 and 1.
 It acts as though [] and [1] don't even exist for this iteration.
 j starts directly at Index 2 ([2])  adds 2  [2, 2]
 j moves to Index 3 ([1, 2])  adds 2  [1, 2, 2]
 The loop ends.
 By forcing start to jump to 2, you bypass the older subsets entirely, ensuring you never accidentally
 recreate duplicate copies of [2] or [1, 2].


 */
