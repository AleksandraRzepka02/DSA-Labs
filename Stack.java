package gmit;

public class Stack<E> {
	private java.util.List<E> list = new java.util.ArrayList<E>();

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean push(E o) {
		//System.out.println(o + " added to stack.");
		return list.add(o);
	}
	
	public E pop(){
		E next = peek();
		list.remove(list.size() - 1);
		return next;
	}

	public E peek(){
		E next = list.get(list.size() - 1);
		return next;
	}
}
