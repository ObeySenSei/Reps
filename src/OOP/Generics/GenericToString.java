package OOP.Generics;

public class GenericToString<T> {
    private Object[] data;
    private int size = 0;

    public GenericToString() {
        data = new Object[10];
    }
    public void add(T value) {
        data[size++] = value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        GenericArrayList<Integer> list = new GenericArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }
}