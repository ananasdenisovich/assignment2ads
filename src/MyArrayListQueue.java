import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyArrayListQueue extends MyArrayList{
    private MyArrayList arrayQueue;
    public MyArrayListQueue(){
        this.arrayQueue = new MyArrayList<>();
    }
    public void enqueue(Object item){
        add((Comparable) item);
    }
    public Object dequeue(MyArrayListQueue arrayQueue){
        return arrayQueue.remove(0);
    }
    public Object peek(MyArrayListQueue arrayQueue){
        return arrayQueue.get(0);
    }
    public boolean isEmpty(MyArrayListQueue arrayQueue){
        if (arrayQueue.size == 0){
            return true;
        } else {
            return false;
        }
    }
    public int size(MyArrayListQueue arrayQueue){
        if (arrayQueue.isEmpty(arrayQueue)) {
            throw new NoSuchElementException();
        }
        return arrayQueue.size;
    }
}
