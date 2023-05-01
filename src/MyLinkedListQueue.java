import java.util.NoSuchElementException;
public class MyLinkedListQueue extends MyLinkedList{
    private MyLinkedList linkedQueue;
    public MyLinkedListQueue(){
        this.linkedQueue = new MyLinkedList<>();
    }
    public void enqueue(Object item){
        add((Comparable) item);
    }
    public Object dequeue(MyLinkedListQueue linkedQueue){
        return linkedQueue.remove(linkedQueue.size() - 1);
    }
}
