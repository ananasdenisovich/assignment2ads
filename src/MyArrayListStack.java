import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    private MyArrayList arrayStack; //Declare an instance variable of type MyArrayList
    public MyArrayListStack(){
        this.arrayStack = new MyArrayList<>();//Create a constructor for the class and initialize the instance variable
    }
    public void push(Object item){
        add(item, 0); //method push adds a needed item to index 0
    }
    public Object pop(MyArrayListStack arrayStack){
        if (arrayStack.isEmpty()) {
            throw new EmptyStackException(); //checks if stack is not empty
        }
        return arrayStack.remove(arrayStack.size() - 1); //removes and returns the last element of stack
    }
    public Object peek(MyArrayListStack arrayStack){
        if (arrayStack.isEmpty()) {
            throw new EmptyStackException();//checks if stack is not empty
        }
        return arrayStack.get(arrayStack.size()-1); //returns the last element of stack
    }
    public boolean isEmpty(MyArrayListStack arrayStack){
        if (arrayStack.size == 0){ //checks if stack's value's size is not 0
            return true;
        } else {
            return false;
        }
    }
    public int size(MyArrayListStack arrayStack){
        if (arrayStack.isEmpty()) {
            throw new EmptyStackException(); //checks if stack is not empty
        }
        return arrayStack.size; //returns the size
    }
}