import java.util.Scanner;

public class MyArrayList<T> implements MyList {
    private Object[] arr;
    int size = 0; //count of elements
    private int capacity = 5; //size's max (may change)
    public MyArrayList(){
        this.arr = new Object[capacity];
        this.size = 0;
    }
    @Override
    public int size() {
        return size;
    } //returns size of arraylist according to how many elements we added

    @Override
    public boolean contains(Object o) {

        if (o == null) { //checks if thereis no o and therefore no element (false)
            for (int i = 0; i < size; i++) {
                if (arr[i] == null) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(arr[i])) { //checks if o is the same as every element of array
                    return true;//if it is the same, returns true
                }
            }
        }
        return false;
    }
    @Override
    public void add(Object item) {
        if (size == capacity){ //checks if size isnt greater that its max possible value
            increaseCapacity(); //if it is greater, makes it double
        }
        arr[size++] = item; // assigns an item to index from 0 to last element by increasing size
    }



    @Override
    public void add(Object item, int index) {
        checkIndex(index); //checks for right index
        if (this.size == this.arr.length) {
            this.increaseCapacity(); //increases capability, if size ids equal or bigger
        }
        for (int i = this.size; i > index; i--) {
            this.arr[i] = this.arr[i-1]; //gives value of a previous element, if new one isnt added on last position
        }
        this.arr[index] = item; //assigns value to new element
        this.size++; //increases size by 1
    }

    public void addALl(MyArrayList arr, int index, int n) {

    }
    @Override
    public boolean removeByObject(Object item) {
        boolean x = false;
        for (int i = 0; i < size; i++) {
            if (item == arr[i]){ //finds a given object in array
                remove(i); //removes it by previous method
                x = true; //returns true if it is removed
            } else {
                x = false;//false if not
            }
        }
        return x;
    }
    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object arr3 = arr[index]; //creates new object wuth the value of object of arr1 of the same index
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];//moves every element from last to given one by one
        }
        arr[size - 1] = ""; //makes the last element null, because its value is moved to prev one
        size--;//decreases the size to keep the count of elements
        return arr3;
    }


    @Override
    public void clear() {
        this.arr = new Object[5]; //creates new array with no elements
        this.size = 0; //return the count of elements to 0
    }

    public Object get(int index){
        checkIndex(index);
        return (Object) arr[index]; //returns object by its index
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (int i = size-1; i >= 0; i--) { //checks all elements, from last to first, so the latter - the first index will be chosen
            if (o == arr[i]){ //if one of elements is the same as o, it will assign to index its index's value
                index = i;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int x = 0;
        for (int i = 0; i < size; i++) {//checks all elements, from first to last, so the last index will be chosen
            if (o == arr[i]){ //if one of elements is the same as o, it will assign to index its index's value
                x = i;
            }
        }
        return x;
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){ //checks if index is with the range of 0 and size
            throw new IndexOutOfBoundsException();
        }
    }
    private void increaseCapacity(){
        capacity = 2 * capacity; //increases capacity 2 times if needed
        Object[] arr2 = new Object[capacity];
        for (int i = 0; i < size; i++){
            arr2[i] = arr[i]; //creates a new array with new capacity and copys values from prev one
        }
        arr = arr2;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public void addElementsByIndex(MyArrayList list, int index, int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            T item = (T) scan.next();
            list.add(item, index + i);
        }
    }
    public void addAll(MyArrayList arr1, MyArrayList arr2, int index, int n){
        for (int i = 0; i < n; i++){
            arr1.add(arr2.get(i), index + i);
            size++;
        }
    }
    public void addManyElements(MyArrayList<T> arrayList, int index, int n) {
        Scanner scan = new Scanner(System.in);
        checkIndex(index); //checks for right index
        if (this.size == this.arr.length) {
            this.increaseCapacity(); //increases capability, if size ids equal or bigger
        }
        for (int i = index; i < this.size; i++) {
            this.arr[i] = this.arr[i-1]; //gives value of a previous element, if new one isnt added on last position
        }
        for (int i = 0; i < n; i++){
            T item = (T) scan.next();
            arrayList.add(item, index);
        }
    }

}
