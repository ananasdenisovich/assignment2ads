public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.print(arr.get(0));
        System.out.print(arr.get(1));
        System.out.print(arr.get(2));
        System.out.print(arr.get(3));
        System.out.print(arr.get(4));
        System.out.println(arr.get(5));
        System.out.println(arr.size());
    }
}