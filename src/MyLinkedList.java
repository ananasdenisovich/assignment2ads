import java.util.Comparator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{

    private class Node<E> {
        public T value;
        E element;
        Node<E> next;
        Node<E> prev;

        Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    public void add(T item, int index) {
        checkIndex(index);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(item);
        } else {
            Node<T> current = getNode(index);
            Node<T> newNode = new Node<>(item, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public boolean removeByObject(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                unlink(current);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T remove(int index) {
        checkIndex(index);
        Node<T> current = getNode(index);
        unlink(current);
        return current.element;
    }

    private void unlink(Node<T> node) {
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }
        if (node.next == null) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
        size--;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index) {
        return getNode(index).element;
    }

    private Node<T> getNode(int index) {
        checkIndex(index);
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index < size / 2) {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node<T> current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    public int indexOf(Object o) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        Node<T> current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }

        }
        return index;
    }
    public void sort(Comparator<T> comparator) {
        if (size <= 1) {
            return; // list is already sorted
        }

        Node current = head;
        while (current != null) {
            Node innerCurrent = current;
            T value = (T) innerCurrent.value;
            while (innerCurrent.prev != null && comparator.compare(value, (T) innerCurrent.prev.value) < 0) {
                innerCurrent.value = innerCurrent.prev.value;
                innerCurrent = innerCurrent.prev;
            }
            innerCurrent.value = value;
            current = current.next;
        }

    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
}