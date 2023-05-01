import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("MyArrayListStack check:");
        MyArrayListStack arrayStack = new MyArrayListStack();
        arrayStack.add(1);
        arrayStack.add(2);
        arrayStack.add(3);
        System.out.print("first version of the stack: ");
        displayArray(arrayStack);
        System.out.print("now lets push 5: ");
        arrayStack.push(5);
        displayArray(arrayStack);
        System.out.print("pop: ");
        System.out.println(arrayStack.pop(arrayStack));
        System.out.print("peek: ");
        System.out.println(arrayStack.peek(arrayStack));
        System.out.print("isEmpty: ");
        System.out.println(arrayStack.isEmpty(arrayStack));
        System.out.print("size: ");
        System.out.println(arrayStack.size(arrayStack));
        System.out.println();
        System.out.println("now lets check MyLinkedListStack:");
        MyLinkedListStack linkedStack = new MyLinkedListStack();
        linkedStack.add(1);
        linkedStack.add(2);
        linkedStack.add(3);
        System.out.print("first version of linkedStack: ");
        displayList(linkedStack);
        System.out.print("push 5: ");
        linkedStack.push(5);
        displayList(linkedStack);
        System.out.print("pop: ");
        System.out.println(linkedStack.pop(linkedStack));
        System.out.print("peek: ");
        System.out.println(linkedStack.peek(linkedStack));
        System.out.print("size: ");
        System.out.println(linkedStack.size());
        System.out.print("isEmpty: ");
        System.out.println(linkedStack.isEmpty(linkedStack));
        System.out.println();
        System.out.println("now lets check MyArrayListQueue:");
        MyArrayListQueue arrayQueue = new MyArrayListQueue();
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(5);
        System.out.print("firs version of arrayQueue: ");
        displayArray(arrayQueue);
        System.out.print("enqueue 5: ");
        arrayQueue.enqueue(5);
        displayArray(arrayQueue);
        System.out.print("dequeue: ");
        System.out.println(arrayQueue.dequeue(arrayQueue));
        System.out.println("peek: ");
        System.out.println(arrayQueue.peek(arrayQueue));
        System.out.print("isEmpty: ");
        System.out.println(arrayQueue.isEmpty(arrayQueue));
        System.out.print("size: ");
        System.out.println(arrayQueue.size(arrayQueue));
        System.out.println();
        System.out.println("now lets check MylinkedListQueue:");
        MyLinkedListQueue linkedQueue = new MyLinkedListQueue();
        linkedQueue.add(1);
        linkedQueue.add(2);
        linkedQueue.add(3);
        linkedQueue.add(5);
        System.out.print("firs version of linkedQueue: ");
        displayList(linkedQueue);
        System.out.print("enqueue 5: ");
        linkedQueue.enqueue(5);
        displayList(linkedQueue);
        System.out.print("dequeue: ");
        System.out.println(linkedQueue.dequeue(linkedQueue));
        System.out.println("peek: ");
        System.out.println(linkedQueue.peek(linkedQueue));
        System.out.print("isEmpty: ");
        System.out.println(linkedQueue.isEmpty(linkedQueue));
        System.out.print("size: ");
        System.out.println(linkedQueue.size(linkedQueue));
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