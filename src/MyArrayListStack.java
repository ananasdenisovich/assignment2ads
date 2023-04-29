import java.util.EmptyStackException;
public class MyArrayListStack<T> extends MyArrayList {
    private MyArrayList<T> arrayList;

    public MyArrayListStack() {
        arrayList = new MyArrayList<>();
    }
    public void push(Object item){
        add(item, 0);
    }
    public Object pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object temp = arrayList.get(arrayList.size - 1);
        remove(arrayList.size - 1);
        return temp;
    }
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

}
