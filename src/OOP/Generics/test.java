package OOP.Generics;

import java.util.Arrays;

class GenericArrayList1<T>{

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    GenericArrayList1(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (size == data.length){
            resize();
        }
        data[size] = num;
        size++;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove (){
        if(size == 0){
            throw new IllegalStateException("List is empty");
        }
        T removed = (T) data[size--];
        data[size] = null;
        return removed;
    }
    private void checkIndex (int index){
        if(index <0 || index >= size){
            throw new IllegalStateException("Invalid Index");
        }
    }
    public T get(int index){      // Here we are returning an index
        checkIndex(index);
        return (T) data[index];
    }
    public void set(int index, int value){
        checkIndex(index);
        data[index] = value;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOf(data,size));
    }
}
public class test {
    public static void main(String[] args) {
        GenericArrayList1<Integer> list = new GenericArrayList1<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.set(0,15);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.size());

        GenericArrayList1<String> list1 = new GenericArrayList1<>();
        list1.add("Debanga");
        list1.add("Debojyoti");
        System.out.println(list1);

    }
}
