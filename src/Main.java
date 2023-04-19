

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        System.out.println(list.indexOf("a"));
        System.out.println( list.lastIndexOf("b"));
    }

}