import java.util.EmptyStackException;
public class MyArrayListQueue extends MyArrayList{
    private MyArrayList arrayQueue;
    public MyArrayListQueue(){
        this.arrayQueue = new MyArrayList<>();
    }
    public void enqueue(Object item){
        add((Comparable) item);
    }
}
