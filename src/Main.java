import javax.sound.midi.Soundbank;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        // CHECK WITHOUT INPUT
        System.out.println("Hello! Lets check my assignment2");
        System.out.println("First, we should check MyArraylist class");
        MyArrayList<Integer> arr1 = new MyArrayList<>();
        System.out.println("Here is our arr1:");
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        displayArray(arr1);
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
        System.out.println("now remove by index");
        list.remove(2);
        displayList(list);
        list.add("a");
        System.out.println("now lets check indexOf and lastIndexOf of 'a' for a b c a");
        System.out.println("first index: " + list.indexOf("a"));
        System.out.println("last index: " + list.lastIndexOf("a"));
        System.out.println("lets now clear it!");
        list.clear();
        displayList(list);

        // CHECK WITH INPUT
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to check this all with your input?");
        String answer = scan.next();
            System.out.println("Then First MyArrayList for Strings!");
            System.out.println("How many elements do you want in your array?");
            int n = scan.nextInt();
            MyArrayList<String> arr2 = new MyArrayList<>();
            System.out.println("now enter their values:");
            for (int i = 0; i < n; i++){
                String element = scan.next();
                arr2.add(element);
            }
            System.out.println("here is your array: " );
            displayArray(arr2);
            System.out.println("size is " + arr2.size());
        System.out.println("Enter String to check contains: ");
        String containsCheck = scan.next();
        System.out.println(arr2.contains(containsCheck));
        System.out.println("What element would you like to add?");
        String toAdd = scan.next();
        arr2.add(toAdd);
        displayArray(arr2);
        System.out.println("what element would you like to add and on what index?");
        toAdd = scan.next();
        int index = scan.nextInt();
        arr2.add(toAdd, index);
        System.out.println("What element would you like to remove?");
        String toRemove = scan.next();
        arr2.add(toRemove);
        displayArray(arr2);
        System.out.println("what element would you like to remove and on what index?");
        toRemove = scan.next();
        index = scan.nextInt();
        arr2.add(toRemove, index);
        System.out.println("which element's index would you like to know?");
        String item = scan.next();
        System.out.println(arr2.indexOf(item));
        System.out.println("which element's last index would you like to know?");
        item = scan.next();
        System.out.println(arr2.lastIndexOf(item));
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