public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{

    private class Node<E> {
        E element; //element of linkedlist
        Node<E> next; //next node
        Node<E> prev; //previous node


        Node(E element, Node<E> next, Node<E> prev) { //new class node with respective attributes
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<T> head; //first element
    private Node<T> tail; //last element
    private int size; //count of elements

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void addByElement(){

    }
    public int size() {
        return size; //returns current count of elements
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    } //checks if there is a needed element by indexOf method, where it is already checked

    public void add(T item) {
        Node<T> newNode = new Node<>(item, null, tail);
        if (tail != null) { //adds new element instead of tail
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;//increases size as there is 1 new element
    }
    public void addAll(MyLinkedList list, int index, MyLinkedList list2){
        Node current = list.getNode(index);
        MyLinkedList tempList = new MyLinkedList();
        for (int i = index; i < list.size; i++){
            tempList.add(list.get(i));
            list.removeByObject(list.get(i));
            size--;
        }
        for (int i = 0; i < list2.size; i++){
            list.add(list2.get(i));
            size++;
        }
        for (int i = 0; i < tempList.size; i++){
            list.add(tempList.get(i));
        }

    }
    public void add(T item, int index) {
        checkIndex(index);
        if (index == size) {
            add(item); //adds new item
        } else {
            Node<T> current = getNode(index);
            Node<T> newNode = new Node<>(item, current, current.prev); //creates a new Node with increased capacity
            current.prev.next = newNode;//moves every element after added by 1 to the right
            current.prev = newNode;
            size++;
        }
    }

    public boolean removeByObject(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.element.equals(item)) { //finds an object that must be removed
                undo(current); //removes it
                return true;
            }
            current = current.next; //move current to the next element after removed one
        }
        return false;
    }

    public T remove(int index) {
        checkIndex(index);
        Node<T> current = getNode(index);// makes current a needed element with index
        undo(current); //removes current
        return current.element;
    }

    private void undo(Node<T> node) {
        if (node.prev == null) {
            head = node.next; //moves every element by 1 to gill the gap of null elements
        } else {
            node.prev.next = node.next;
        }
        if (node.next == null) {
            tail = node.prev; //does the same thing to tail
        } else {
            node.next.prev = node.prev;
        }
        size--; //decreases size since 1 element is removed
    }

    public void clear() { //clears all values
        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index) {
        return getNode(index).element;
    } //works with getNode() method

    private Node<T> getNode(int index) {
        checkIndex(index);
        if (index < size / 2) { //applies binary search
            Node<T> current = head; //if index is less than half of size, starts cchecking from start
            for (int i = 0; i < index; i++) {
                current = current.next; //checks all elements till the half, until finds the one with needed index
            }
            return current;
        } else {
            Node<T> current = tail; //if its on the other half, starts from end
            for (int i = size - 1; i > index; i--) { //same logic but in other direction
                current = current.prev;
            }
            return current;
        }
    }

    public int indexOf(Object o) { //same as in array
        Node<T> current = head; //starts from first element
        int index = 0;
        while (current != null) {
            if (current.element.equals(o)) {//checks all elements until equals condition is met
                return index;//once it is met, returns index of fit element
            }
        }
        return -1; //returns -1 if no same element is found
    }
    public int lastIndexOf(Object o) {
        Node<T> current = tail; //starts from last element
        int index = size - 1;
        while (current != null) {
            if (current.element.equals(o)) { //checks all elements until equals condition is met
                return index; //once it is met, returns index of fit element
            }

        }
        return index;
    }
    public void checkIndex(int index){ //same as in array
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    public void sort() {

        Node<T> current = head;

        for(int i = 0; i < size;i++){
            if(current.getNext()!=null && current.getElement().compareTo(current.getNext().getElement()) < 0){
                T temp = current.getElement();
                current.setElement(current.getNext().getElement());
                current.getNext().setElement(temp);
            }
            current = current.getNext();
        }
        current = head;
    }
    }