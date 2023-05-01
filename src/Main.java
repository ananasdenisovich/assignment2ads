import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MyArrayListQueue queue = new MyArrayListQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.enqueue(5);
        queue.add(5);
        queue.dequeue(queue);
        displayArray(queue);
        System.out.println(queue.peek(queue));
        //System.out.println(queue.isEmpty(queue));
        //System.out.println(queue.size(queue));
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