import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyArrayListQueue extends MyArrayList{
    private MyArrayList arrayQueue;//Declare an instance variable of type MyArrayList
    public MyArrayListQueue(){
        this.arrayQueue = new MyArrayList<>();
    }//Create a constructor for the class and initialize the instance variable
    public void enqueue(Object item){
        add((Comparable) item);//method enqueue adds a needed item to index 0
    }
    public Object dequeue(MyArrayListQueue arrayQueue){
        if (arrayQueue.isEmpty(arrayQueue)) {//checks if queue isnt empty
            throw new NoSuchElementException();
        }
        return arrayQueue.remove(0);//removes and returns the front element of queue
    }
    public Object peek(MyArrayListQueue arrayQueue){
        if (arrayQueue.isEmpty(arrayQueue)) {//checks if queue isnt empty
            throw new NoSuchElementException();
        }
        return arrayQueue.get(0);//returns the front element of queue
    }
    public boolean isEmpty(MyArrayListQueue arrayQueue){
        if (arrayQueue.size == 0){//checks if stack's value's size is not 0
            return true;
        } else {
            return false;
        }
    }
    public int size(MyArrayListQueue arrayQueue){
        if (arrayQueue.isEmpty(arrayQueue)) {
            throw new NoSuchElementException();//checks if queue isnt empty
        }
        return arrayQueue.size;//returns the size of queue
    }
}
