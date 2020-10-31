package basic.donbinna_algo.queue.taewon;

import java.util.NoSuchElementException;

/**
 * add
 * peek
 * remove
 * isEmpty
 */
public class QueueCreated<T> {
	
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void add(T data) {
		Node<T> t = new Node<T>(data);
		if(last != null) {
			last.next = t;
		}
		
		last = t;
		
		if(first == null) {
			first = last;
		}
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public T remove() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
}
