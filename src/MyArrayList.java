public class MyArrayList<T> {
    private Object[] arr;
    private int size = 0;
    private int capacity = 5;
    public MyArrayList(){
        arr = new Object[capacity];
    }
    public T get(int index){
        return (T) arr[index];
    }
    public void add(T newItem){
        if (size == capacity){
            increaseCapacity();
        }
        arr[size++] = newItem;
    }
    private void increaseCapacity(){
        capacity = 2 * capacity;
        Object[] arr2 = new Object[capacity];
        for (int i = 0; i < size; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
}
