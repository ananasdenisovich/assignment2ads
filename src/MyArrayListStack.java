import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    MyArrayList arrayStack;
    int capacity = 5;
    int size = 0;
    public MyArrayListStack(){
        arrayStack = new MyArrayList<>();
    }
    public void push(Object item){
        add(item, 0);
    }
    public Object pop(){
        Object temp = arrayStack.get(0);
        remove(0);
        return temp;
    }


}
