package Recursion;

public class FindTargetElement {
    public static void main(String[] args) {
        int[] arr = {7, 4, 18, 26, 34};
        System.out.println("Is the element Present ? " + isPresent(arr, 34, 0));
        System.out.println("Index of the target: " + findIndex(arr,34,0));
        System.out.println("Index of target from last: " + findIndexFromLast(arr,34,arr.length-1));   // Since you want to search from last to first, you should start at index 4, not index 0.

    }

    static boolean isPresent(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || isPresent(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;           // -1 is the int value for False
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }


    static int findIndexFromLast(int[]arr, int target, int index){

        if (index < 0){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return findIndexFromLast(arr,target,index - 1);
        }
    }
}

