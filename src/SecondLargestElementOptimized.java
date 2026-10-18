public class SecondLargestElementOptimized {

    public static void main(String[] args) {
        int[] arr = {12, 5, 19, 8, 19, 14};
        int result = nextLargest(arr);
        System.out.println(result);
    }
    static int nextLargest(int[] arr){

        if (arr.length < 2){                // If there is only one element or the array is empty
            return -1;
        }
        int largest = arr[0];
        int secondLargest = 0;
        boolean foundSecond = false;

        for (int i=1; i< arr.length; i++){
            if (arr[i] > largest){                     //   if 19 > 12
                secondLargest = largest;               //   store 12 first
                largest = arr[i];                      // then update 12 to 19
                foundSecond = true;                 // foundSecond = true....We now have a valid second-largest candidate

            } else if (arr[i] < largest && (!foundSecond || arr[i] > secondLargest)){     // if 14 > 12 , then secondLargest is 14.
                secondLargest = arr[i];
                foundSecond = true;
            }
        }
        if (!foundSecond){       // (foundSecond == false)
            return -1;
        }
        return secondLargest;
    }
}

/*
We use foundSecond for one main reason: to know whether
secondLargest contains a real candidate or is still just an initial placeholder.  to negate (5,5,5,5)

!foundSecond: if we haven't found a candidate yet, accept this value as the first candidate.
The || means either we haven't found a candidate yet or the current value is better than the existing candidate.

The first if doesn't execute, and the else if doesn't execute either.
Therefore, foundSecond stays false.

 */

