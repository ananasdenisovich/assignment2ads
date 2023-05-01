import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MyLinkedListStack stack = new MyLinkedListStack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.size());
        stack.push(5);
        stack.pop(stack);
        displayList(stack);
        System.out.println(stack.peek(stack));
    }

    public static void displayArray(MyArrayList arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    public static void displayList(MyLinkedList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}