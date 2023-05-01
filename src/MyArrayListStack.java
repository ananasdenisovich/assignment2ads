import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    private MyArrayList arrayStack;
    public MyArrayListStack(){
        arrayStack = new MyArrayList<>();
    }
    public void push(Object item){
        add(item, 0);
    }

}