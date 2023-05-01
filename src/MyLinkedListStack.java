import java.util.EmptyStackException;
public class MyLinkedListStack<T> extends MyLinkedList{
    private MyLinkedList linkedStack;
    public MyLinkedListStack(){
        this.linkedStack = new MyLinkedList<>();
    }
    public void push(Object item, MyLinkedListStack linkedStack){
        addFirst((Comparable) item);
    }


}
