public class MyLinkedListStack<T> extends MyLinkedList{
    private MyLinkedList linkedStack;
    public MyLinkedListStack(){
        this.linkedStack = new MyLinkedList<>();
    }
    public void push(Object item){
        addFirst((Comparable) item);
    }
    public Comparable pop(MyLinkedListStack linkedStack){
        return linkedStack.remove(linkedStack.size() - 1);
    }
    public Comparable peek(MyLinkedListStack linkedStack){
        return linkedStack.get(linkedStack.size()-1);
    }

}
