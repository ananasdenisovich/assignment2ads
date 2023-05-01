import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    private MyArrayList arrayStack;
    public MyArrayListStack(){
        this.arrayStack = new MyArrayList<>();
    }
    public void push(Object item){
        add(item, 0);
    }
    public Object pop(MyArrayListStack arrayStack){
        return arrayStack.remove(arrayStack.size() - 1);
    }
    public Object peek(MyArrayListStack arrayStack){
        return arrayStack.get(arrayStack.size()-1);
    }
    public boolean isEmpty(MyArrayListStack arrayStack){
        if (arrayStack.size == 0){
            return true;
        } else {
            return false;
        }
    }
    public int size(MyArrayListStack arrayStack){
        return arrayStack.size;
    }
}