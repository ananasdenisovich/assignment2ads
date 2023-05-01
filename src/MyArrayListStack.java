import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    private MyArrayList arrayStack;
    public MyArrayListStack(){
        arrayStack = new MyArrayList<>();
    }
    public void push(Object item){
        add(item, 0);
    }
    public Object pop(MyArrayListStack stack){
        return stack.remove(stack.size() - 1);
    }
    public Object peek(MyArrayListStack stack){
        return stack.get(stack.size()-1);
    }


}