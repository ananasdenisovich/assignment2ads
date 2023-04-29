import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayListStack stack = new MyArrayListStack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.push(4);
        stack.pop();
        displayArray(stack);
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