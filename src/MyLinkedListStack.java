import java.util.EmptyStackException;

public class MyLinkedListStack<T> extends MyLinkedList{
    private MyLinkedList linkedStack;
    public MyLinkedListStack(){
        this.linkedStack = new MyLinkedList<>();
    }
    public void push(Object item){
        addFirst((Comparable) item);
    }
    public Comparable pop(MyLinkedListStack linkedStack){
        if (linkedStack.isEmpty(linkedStack)) {
            throw new EmptyStackException();
        }
        return linkedStack.remove(linkedStack.size() - 1);
    }
    public Comparable peek(MyLinkedListStack linkedStack){
        if (linkedStack.isEmpty(linkedStack)) {
            throw new EmptyStackException();
        }
        return linkedStack.get(linkedStack.size()-1);
    }
    public boolean isEmpty(MyLinkedListStack linkedStack){
        if (linkedStack.size == 0){
            return true;
        } else {
            return false;
        }
    }
    public int size(MyLinkedListStack linkedStack){
        if (linkedStack.isEmpty(linkedStack)) {
            throw new EmptyStackException();
        }
        return linkedStack.size;
    }
}
