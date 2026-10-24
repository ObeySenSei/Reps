package Recursion;

public class R2 {

        public static void main(String[] args) {
            message(1);
        }

        static void message(int n) {
            if (n > 5) {                                            // or   n == 5
                return;
            }

            System.out.println("Hey");
            message(n + 1);
        }
    }

/* Instead of creating five different methods, you can call the same method from within itself.

   Recursion needs two things:
 - Base case: A condition that stops the recursive calls.
 - Recursive call: The method calling itself to repeat the operation.

 */