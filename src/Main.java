import javax.sound.midi.Soundbank;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Lets check my assignment2");
        System.out.println("First, we should check MyArraylist class");
        MyArrayList<Integer> arr1 = new MyArrayList<>();
        System.out.println("Here is our arr1:");
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        System.out.println("method 'get' displayed needed elements by index");
        System.out.print("method 'size' shows size of array: ");
        System.out.println(arr1.size());
        System.out.println("lets add 1 more element");
        arr1.add(6);
        System.out.println("size is now changed: " + arr1.size());
        System.out.println("Now lets check 'contain' method:");
        System.out.println(arr1.contains(2));
        System.out.println(arr1.contains(8));
        System.out.println("Lets add an element by index:");
        arr1.add(6, 3);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Now lets check 'remove' by index");
        arr1.remove(6);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Check 'remove' by item:");
        arr1.removeByObject(6);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        arr1.add(1);
        System.out.println("check last and first index of 1 2 3 4 5 1:");
        System.out.println("first index: " + arr1.indexOf(1));
        System.out.println("last index: " + arr1.lastIndexOf(1));
        System.out.println("Last, lets check 'clear':");
        arr1.clear();
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Now lets check LinkedList!");
        MyLinkedList<String> list = new MyLinkedList<>();
    }

}