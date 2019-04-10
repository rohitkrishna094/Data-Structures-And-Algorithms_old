public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    // add at the first
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void addFirst(T data) {
        this.add(data);
    }

    // Add at last
    public void addLast(T data) {
        this.add(this.size, data);
    }

    // Add at specified index or at the end if index < length
    public void add(int index, T data) {
        Node<T> newNode = new Node<T>(data);
        Node<T> cur = head, prev = head;
        for (int i = 0; i < index - 1 && cur != null; i++) {
            prev = cur;
            cur = cur.next;
            // System.out.println(i);
        }
        if (cur == null && index == 0) {
            head = newNode;
        } else if (cur == null) {
            prev.next = newNode;
        } else {
            Node<T> oldNext = cur.next;
            cur.next = newNode;
            newNode.next = oldNext;
        }
        size++;
    }

    @Override
    public String toString() {
        String s = "[";
        Node<T> cur = head;
        while (cur != null) {
            s += cur.data + " -> ";
            cur = cur.next;
        }
        s += "null]";
        return s;
    }

    // Check if linkedlist is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Clear or empty the linkedlist;
    public void clear() {
        head = null;
        size = 0;
    }

    // checks if given element exists in linkedlist or not
    public boolean contains(T data) {
        return false;
    }

    // Gets first element in linkedlist
    public T getFirst() {
        return head == null ? null : head.data;
    }

    // Gets last element in linkedlist
    public T getLast() {
        return null;
    }

    // Get element at index. If not present null
    public T get(int index) {
        return null;
    }

    // Returns index of first occurrence of data or -1
    public int indexOf(T data) {
        return -1;
    }

    // Returns index of last occurrence of data or -1
    public int lastIndexOf(T data) {
        return -1;
    }

    // Removes first element from list
    public T remove() {
        return null;
    }

    // Removes first element from list
    public T removeFirst() {
        return null;
    }

    // Removes last element from list
    public T removeLast() {
        return null;
    }

    // Removes element at specified index
    public T remove(int index) {
        return null;
    }

    // Removes first occurrence of data
    public T remove(T data) {
        return null;
    }

    // Removes first occurrence of data
    public T removeFirst(T data) {
        return null;
    }

    // Removes last occurrence of data
    public T removeLast(T data) {
        return null;
    }

    // Replaces element at index with specified element and returns removed
    // element's data
    public T set(int index, T data) {
        return null;
    }

}
