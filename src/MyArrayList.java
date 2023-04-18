public class MyArrayList<T> implements MyList{
    private Object[] arr;
    private int size = 0;
    private int capacity = 5;
    public MyArrayList(){
        arr = new Object[capacity];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object item) {
        if (size == capacity){
            increaseCapacity();
        }
        arr[size++] = item;
    }

    @Override
    public void add(Object item, int index) {
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    public T get(int index){
        return (T) arr[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

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
