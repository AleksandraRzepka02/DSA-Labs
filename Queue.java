package gmit;

import java.util.*;
public class Queue<E extends Element> {
	private LinkedList<E> list = new LinkedList<E>();
	private boolean isPriorityQueue = false;
	
	public Queue(boolean isPriorityQueue) {
		super();
		this.isPriorityQueue = isPriorityQueue;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public void add(E o) {
		list.add(o);
		if (isPriorityQueue) Collections.sort(list);
	}

	public void clear() {
		list.clear();
	}

	public E peek() {
		return list.peek();
	}

	public E poll() {
		return list.poll();
	}

	public boolean offer(E e) {
		if (list.contains(e)){
			return false;
		}else{
			return list.add(e);
		}
	}
}
