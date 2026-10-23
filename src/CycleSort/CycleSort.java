package CycleSort;
import java.util.Arrays;

public class CycleSort {

        public static void main(String[] args) {
            int[] arr = {3, 5, 2, 1, 4};

            cyclicSort(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void cyclicSort(int[] arr) {
            int i = 0;                            ///  arr[0] = 3

            while (i < arr.length) {
                int correctIndex = arr[i] - 1;        /// correctIndex = 3 - 1 = 2

                if (arr[i] != arr[correctIndex]) {    /// Is arr[0] != arr[2]....Is 3 != 2 ?  True....Then the if else block is executed
                    swap(arr, i, correctIndex);

                } else {                                ///  Current value is already correctly placed so,
                    i++;                                ///  move to the next element
                }
            }
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

