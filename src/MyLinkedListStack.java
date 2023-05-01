import java.util.EmptyStackException;

public class MyLinkedListStack<T> extends MyLinkedList{
    private MyLinkedList linkedStack; //Declare an instance variable of type MyLinkedList
    public MyLinkedListStack(){
        this.linkedStack = new MyLinkedList<>(); //Create a constructor for the class and initialize the instance variable
    }
    public void push(Object item){
        addFirst((Comparable) item);
    } //uses addFirst method to add an element to the head
    public Comparable pop(MyLinkedListStack linkedStack){
        if (linkedStack.isEmpty(linkedStack)) { //checks if stack isnt empty
            throw new EmptyStackException();
        }
        return linkedStack.remove(linkedStack.size() - 1); //removes and returns the tail
    }
    public Comparable peek(MyLinkedListStack linkedStack){
        if (linkedStack.isEmpty(linkedStack)) {//checks if stack isnt empty
            throw new EmptyStackException();
        }
        return linkedStack.get(linkedStack.size()-1);//returns the tail
    }
    public boolean isEmpty(MyLinkedListStack linkedStack){
        if (linkedStack.size == 0){ //checks if stack's value's size is not 0
            return true;
        } else {
            return false;
        }
    }
    public int size(MyLinkedListStack linkedStack){
        if (linkedStack.isEmpty(linkedStack)) {
            throw new EmptyStackException(); //checks if stack is not empty
        }
        return linkedStack.size;//returns the size
    }
}
