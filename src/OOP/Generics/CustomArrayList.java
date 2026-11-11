package OOP.Generics;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;                             //  Variable data stores the actual elements.
    private static final int DEFAULT_SIZE = 10;     //  Initial capacity of the array
    private int size = 0;                           //  Tracks how many elements are currently stored.

    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){                  //  isFull() checks whether the array is full.
            resize();                  //  And if full, resize() is called.
        }
        data[size] = num;              //  data[size] = num inserts the element.
        size++;                        //  size++ increases the element count.
    }
    private void resize() {

        int[] temp = new int[data.length * 2];    // double the size

        for(int i = 0; i < data.length; i++){     // Copy the current items in the new Array. We copy only the elements actually stored, not the entire capacity.
            temp[i] = data [i];
        }
        data = temp;                  // Make instance variable data point to the new larger array.
    }

    private boolean isFull(){         // This checks whether the number of stored elements equals the array's capacity.
        return size == data.length;
    }
    public int remove(){
        if (size == 0) {
            throw new IllegalStateException("Cannot remove from an empty list");
        }
        int removed = data[size - 1];
        data[size - 1] = 0;
        size--;
        return removed;
    }
    public int get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){  // This replaces an existing element. list.set(1, 100)  Changes the element at index 1 to 100.
        data[index] = value;
    }
    @Override
    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.set(1, 100);
        System.out.println(list);

        System.out.println("Element: " + list.get(0));
        System.out.println("Size: " + list.size());
    }
}

/*

Why static final for DEFAULT_SIZE?
- static: Shared by every object of the class.
- final: Its value cannot be changed after initialization.


return size == data.length;  This checks whether the number of stored elements equals the array's capacity.
For example:  size = 10;    data.length = 10;
The method returns true.  Remember: data.length represents capacity, not the number of elements stored.

The old array can eventually be garbage-collected if nothing else references it.
 */
