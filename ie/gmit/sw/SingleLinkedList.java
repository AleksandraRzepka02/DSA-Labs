package ie.gmit.sw;

public class SingleLinkedList<E> {
	private Node<E> head = null;
	private int size = 0;
	
    public boolean add(E item) {
        add(size, item);
        return true;
    }
	
    public void add(int index, E item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException(Integer.toString(index));
        
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }
    
	public void addFirst(E item) {
	    head = new Node<E>(item, head);
	    size++;
	    System.out.println(head.getData() + " added first.");
	}
	
	public void addAfter(E current, E next) {
		Node<E> node = head;
		while (node != null){
			if (node.getData().equals(current)){
				addAfter(node, next);
				return;
			}
			node = node.getNext();
		}
	}
	
	private void addAfter(Node<E> node, E item) {
		Node<E> temp = new Node<E>(item, node.getNext());
		node.setNext(temp); 
        System.out.println(temp.getData() + " added at end.");
        size++;
    }
	
	public E removeFirst() {
        Node<E> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            return temp.getData();
        } else {
            return null;
        }
    }
	
	public E removeAfter(E item) {
		Node<E> node = head;
		while (node != null){
			if (node.getData().equals(item)){
				return removeAfter(node);
			}
			node = node.getNext();
		}		
		throw new java.util.NoSuchElementException();
	}
	
	private E removeAfter(Node<E> node) {
        Node<E> temp = node.getNext();
        if (temp != null) {
            node.setNext(temp.getNext());
            size--;
            return temp.getData();
        } else {
            return null;
        }
    }
	
	private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.getNext();
        }
        return node;
    }
	
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.getData();
    }
    
    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.getData();
        node.setData(newValue);
        return result;
    }
    
    public int size() {
    	return size;
    }
    
    public Iterator<E> iterator() {
        return new Iterator<E>(head);
    }
}