package CycleSort;

public class FindDuplicateNumberFloydCycleDetection {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("The duplicate element is: " + findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        // Phase 1: Finding the intersection point in the cycle
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];          // Move 1 step
            fast = arr[arr[fast]];     // Move 2 steps
        } while (slow != fast);

        // Phase 2: Finding the "entrance" to the cycle (the duplicate number)
        int ptr1 = arr[0];
        int ptr2 = slow;

        while (ptr1 != ptr2) {
            ptr1 = arr[ptr1];
            ptr2 = arr[ptr2];
        }

        return ptr1; // This is the duplicate number
    }
}