
package OOP.Generics;

import java.util.Arrays;

public class CustomArrayList1<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList1() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (size == data.length) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    @SuppressWarnings("unchecked")
    public T remove() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }

        T removed = (T) data[--size];
        data[size] = null;
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    public static void main(String[] args) {

        CustomArrayList1<Integer> list = new CustomArrayList1<Integer>();

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

        CustomArrayList1<String> names = new CustomArrayList1<String>();

        names.add("Debanga");
        names.add("Rahul");

        System.out.println(names);
    }
}
