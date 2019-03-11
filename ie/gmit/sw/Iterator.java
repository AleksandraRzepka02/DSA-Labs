package ie.gmit.sw;

public class Iterator<E> {
    private Node<E> current;

    public Iterator(Node<E> start) {
        current = start;
    }

    public boolean hasNext() {
        return current != null;
    }

    public E next() {
        if (current == null) {
            throw new java.util.NoSuchElementException();
        }
        E returnValue = current.getData();
        current = current.getNext();
        return returnValue;
    }
}
