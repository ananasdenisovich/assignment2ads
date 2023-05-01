import java.util.NoSuchElementException;
public class MyLinkedListQueue extends MyLinkedList{
    private MyLinkedList linkedQueue;//Declare an instance variable of type MyLinkedList
    public MyLinkedListQueue(){
        this.linkedQueue = new MyLinkedList<>();
    }//Create a constructor for the class and initialize the instance variable
    public void enqueue(Object item){
        add((Comparable) item);//method enqueue adds a needed item to index 0
    }
    public Object dequeue(MyLinkedListQueue linkedQueue){
        if (linkedQueue.isEmpty(linkedQueue)) {//checks if queue isnt empty
            throw new NoSuchElementException();
        }
        return linkedQueue.remove(0);//removes and returns the front element of queue
    }
    public Object peek(MyLinkedListQueue linkedQueue){
        return getFirst();
    }//returns the front element of queue
    public boolean isEmpty(MyLinkedListQueue linkedQueue){
        if (linkedQueue.size == 0){ //checks if stack's value's size is not 0
            return true;
        } else {
            return false;
        }
    }
    public int size(MyLinkedListQueue linkedQueue){
        if (linkedQueue.isEmpty(linkedQueue)) {//checks if queue isnt empty
            throw new NoSuchElementException();
        }
        return linkedQueue.size;//returns the size of queue
    }

}
