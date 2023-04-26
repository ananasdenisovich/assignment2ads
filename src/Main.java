import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        MyArrayList<Integer> arr2 = new MyArrayList<>();
        arr2.add(7);
        arr2.add(8);
        arr2.add(9);
        arrayList.addAll(arrayList, arr2, 2, 3); //this method has no scanner
        //displayArray(arrayList);


        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list.addAll(list, 1, list2);
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