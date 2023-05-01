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
        if (linkedQueue.isEmpty(linkedQueue)) {
            throw new NoSuchElementException();
        }
        return linkedQueue.remove(0);
    }
    public Object peek(){
        return getFirst();
    }
    public boolean isEmpty(MyLinkedListQueue linkedQueue){
        if (linkedQueue.size == 0){
            return true;
        } else {
            return false;
        }
    }
    public int size(MyLinkedListQueue linkedQueue){
        if (linkedQueue.isEmpty(linkedQueue)) {
            throw new NoSuchElementException();
        }
        return linkedQueue.size;
    }

}
