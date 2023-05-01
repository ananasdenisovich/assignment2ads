import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.enqueue(5);
        queue.add(5);
        queue.dequeue(queue);
        displayList(queue);
        System.out.println(queue.peek());

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