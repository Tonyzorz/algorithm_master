package basic.donbinna_algo.queue.taewon;

import java.util.NoSuchElementException;

/**
 * 
 * add() = 데이터를 추가한다
 * remove() = 첫번째 데이터를 제거한다
 * peek() = 큐 첫번째 데이터 보여주고 제거는 하지 않는다
 * isEmpty() = 비어있는지 확인한다
 *
 */
class Queue<T> {
	
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
		
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		//System.out.println("current added data = " + item );
		//마지막 노드가 있으면 뒤에있는 노드의 주소의 다음값을 수정
		if(last != null) {
			last.next = t;
			//System.out.println(last.next.hashCode());
		}
		
		last = t;
		//System.out.println(last.hashCode());
		//첫번째 노드가 
		if(first == null) {
			first = last;
		}
		
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
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
	}
	
}
