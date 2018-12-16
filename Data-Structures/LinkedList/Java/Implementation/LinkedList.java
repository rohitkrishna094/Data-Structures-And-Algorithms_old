public class LinkedList<T> {

    Node<T> head;

    public LinkedList() {
        head = null;
    }

    // add at the first
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void addFirst(T data) {
        this.add(data);
    }

    // Add at last
    public void addLast(T data) {

    }

    // Add at specified index
    public void add(int index, T data) {

    }

    // Check if linkedlist is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Clear or empty the linkedlist;
    public void clear() {
        head = null;
    }

    // checks if given element exists in linkedlist or not
    public boolean contains(T data) {

    }

    // Gets first element in linkedlist
    public T getFirst() {

    }

    // Gets last element in linkedlist
    public T getLast() {

    }

    // Returns index of first occurrence of data or -1
    public indexOf(T data) {

    }

    // Returns index of last occurrence of data or -1
    public indexOf(T data) {

    }

    // Removes first element from list
    public T remove() {

    }

    // Removes first element from list
    public T removeFirst() {

    }

    // Removes last element from list
    public T removeLast() {

    }

    // Removes element at specified index
    public T remove(int index) {

    }

    // Removes first occurrence of data
    public T remove(T data) {

    }

    // Removes first occurrence of data
    public T removeFirst(T data) {

    }

    // Removes last occurrence of data
    public T removeLast(T data) {

    }

    // Replaces element at index with specified element and returns removed
    // element's data
    public T set(int index, T data) {

    }

}
