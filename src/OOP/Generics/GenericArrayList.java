package OOP.Generics;
import java.util.Arrays;

public class GenericArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericArrayList() {             //  A constructor initializes an object when we create it.
        data = new Object[DEFAULT_SIZE];    //  new Object[DEFAULT_SIZE] creates an array of 10 positions. The data reference points to that array.
    }

    public void add(T num) {                //  T num — accepts an element of the generic type.
        if (size == data.length) {          //  Checks if the array is full.
            resize();                       //  We need more capacity.
        }
        data[size] = num;                   //  Use the current value of size as the index.  Insert num at that index.
        size++;                             //  Increase size by one.
    }

    private void resize() {                                  //  This method increases the capacity of the internal array.
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){    // We can also loop till size because only the stored elements need copying.
            temp[i] = data [i];
        }
        data = temp;      //  This makes 'data' point to the new array.   The old array can be garbage-collected once nothing references it.
    }

    @SuppressWarnings("unchecked")
    public T remove() {                  // T — returns the generic type. Why T instead of void? Because we want to return the removed element.
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        T removed = (T) data[--size];     //  We're converting an Object into T
        data[size] = null;                // Clears the position that previously contained the removed element.
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);                 //  Calls another method to verify that the requested index is valid.
        return (T) data[index];
    }

    public void set(int index, T value) {     //  index — position where we want to make a change.
        checkIndex(index);                    //  value — new value we want to insert.
        data[index] = value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public int size() {            // Remember, size() = number of elements.
        return size;
    }

    @Override
    public String toString() {                                                  //  This method provides a readable representation of our list.
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    public static void main(String[] args) {

        GenericArrayList<Integer> list = new GenericArrayList<Integer>();   // This creates an object of our generic class.

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        System.out.println("Removed: " + list.remove());
        System.out.println(list);

        list.set(0, 100);
        System.out.println(list);

        System.out.println("Element: " + list.get(1));
        System.out.println("Size: " + list.size());

        GenericArrayList<String> names = new GenericArrayList<String>();

        names.add("Debanga");
        names.add("Rahul");
        System.out.println(names);
    }
}
/**

 Arrays.copyOf(data, size)
 Creates a copy of the internal array containing only the actual elements.

 */