package MergeSort;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};
        mergeSort(arr,0,arr.length-1);              // Start the sorting process for the whole hand of cards
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort (int[] arr, int start , int end){

        if (start >= end){             // Base case: If the pile has 1 or 0 cards, it's already sorted. Stop splitting.
            return;
        }
        int mid = start + (end-start) / 2;        // Find the middle of the pile

        mergeSort(arr,start,mid);            // Split & sort the Left pile
        mergeSort(arr,mid + 1, end);        // Split & sort the Right pile
        merge (arr, start, mid, end);            // Merge.(Glue the two sorted piles back together)
    }
    static void merge(int[]arr, int start, int mid, int end){

        int[] temp = new int [end - start + 1];      // A temporary spare table to hold our merged cards in order

        int i = start;                        // Pointer for the front of the Left pile
        int j = mid + 1;                      // Pointer for the front of the Right pile
        int k = 0;                            // Pointer for our temporary table

        while (i <= mid && j <= end) {       // Step 1: Compare front cards from both piles and take the smaller one
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];            // Left card is smaller
                i++;
            } else {
                temp[k] = arr[j];            // Right card is smaller
                j++;
            }
            k++;
        }

        while (i <= mid ){                // Step 2: If the Left pile has leftover cards, sweep them into temp
            temp [k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {                // Step 3: If the Right pile has leftover cards, sweep them into temp
            temp [k] = arr[j];
            j++;
            k++;
        }

        for (int x=0; x<temp.length; x++){    // Step 4: Copy the nicely sorted temp table back into our original array
            arr[start + x] = temp[x];                      //  0 + 0 = 0;    0 + 1 = 1;   2 + 0 = 2;   2 + 1 = 3
        }
    }
}

/*

so basically 4271, becomes 24,17 and then 2 is compared with 4,1,7, 1being smallers gets pushed into the
temp integer array first, then 2, then 4, last is 7, ,so we need to find a way to be able to push 7
which is a leftover to the temp why is why while (j <= end)

You hit the nail on the head regarding the leftover sweep!
Your intuition for why we need that extra loop (while (j <= end)) is 100% correct.

Just to fine-tune one tiny detail: 2 isn't compared against all of 4, 1, 7 at the same time.
Instead, it’s a strict step-by-step match-up between the front of the two piles:

Compare 2 (front of {2, 4}) vs 1 (front of {1, 7}).
→ 1 wins and goes into temp first.

Now the right pointer moves to 7. Compare 2 vs 7.
→ 2 wins and goes into temp second.

Now the left pointer moves to 4. Compare 4 vs 7.
→ 4 wins and goes into temp third.

At this point, the left pile is completely empty (4 was the last card).
But the right pile still has 7 sitting there.

Why your logic for while (j <= end) is spot on:
Because the left pile ran out first, the main while loop terminates.
Without a safety net, 7 would be left behind and forgotten!

That is precisely why the leftover loop exists:
 */
