public class MyArrayList<T> implements MyList{
    private Object[] arr;
    private int size = 0;
    private int capacity = 5;
    public MyArrayList(){
        this.arr = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == null) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(arr[i])) {
                    return true;
                }
            }
        }
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
        boolean x = false;
        for (int i = 0; i < size; i++) {
            if (item == arr[i]){
                remove(i);
                x = true;
            } else {
                x = false;
            }
        }
        return x;
    }

    @Override
    public Object remove(int index) {
        Object arr3 = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = "";
        size--;
        return arr3;
    }


    @Override
    public void clear() {
        this.arr = new Object[5];
        this.size = 0;
    }

    public T get(int index){
        return (T) arr[index];
    }

    @Override
    public int indexOf(Object o) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (o == arr[i]){
                x = i;
            }
        }
        return x;
    }

    @Override
    public int lastIndexOf(Object o) {
        int x = 0;
        for (int i = size-1; i >= 0; i--) {
            if (o == arr[i]){
                x = i;
            }
        }
        return x;
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
