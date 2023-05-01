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
}
