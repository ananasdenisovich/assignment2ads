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
        System.out.println("Now lets check 'contains' method for 2 and 8:");
        System.out.println(arr1.contains(2));
        System.out.println(arr1.contains(8));
        System.out.println("Lets add an element by index:");
        arr1.add(6, 3);
        displayArray(arr1);
        System.out.println("Now lets check 'remove' by index");
        arr1.remove(6);
        displayArray(arr1);
        System.out.println("Check 'remove' by item:");
        arr1.removeByObject(6);
        displayArray(arr1);
        arr1.add(1);
        System.out.println("check last and first index of 1 2 3 4 5 1:");
        System.out.println("first index: " + arr1.indexOf(1));
        System.out.println("last index: " + arr1.lastIndexOf(1));
        System.out.println("Last, lets check 'clear':");
        arr1.clear();
        displayArray(arr1);
        System.out.println();
        System.out.println("Now lets check LinkedList!");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("'get' displays elements:");
        displayList(list);
        System.out.println("'size' method: " + list.size());
        System.out.println("'contains' method for a and k");
        System.out.println(list.contains("a"));
        System.out.println(list.contains("k"));
        System.out.println("Lets add something!");
        list.add("hi");
        displayList(list);
        System.out.println("now lets add by index");
        list.add("yooo", 2);
        displayList(list);
        System.out.println("lets remove by item");
        list.removeByObject("hi");
        displayList(list);
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