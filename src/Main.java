import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);

        System.out.println("Unsorted list: ");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        list.sort(Comparator.naturalOrder());

        System.out.println("Sorted list: ");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

    }

}