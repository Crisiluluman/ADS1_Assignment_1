package DataStructures;

public class LinkedList<T> implements List<T>{
    private Node<T> head;
    private int size;

    @Override
    public boolean isEmpty() {
        //TODO: Data i head er tom?
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<T>();
        newNode.setNext(head);
        newNode.setData(data);
        head = newNode;
        size++;
    }

    @Override
    public T removeFirst() throws EmptyListException {
        Node<T> temp = head;
        head = temp.getNext();
        size--;
        return temp.getData();
    }
}
