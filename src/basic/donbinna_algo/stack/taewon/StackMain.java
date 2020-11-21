package basic.donbinna_algo.stack.taewon;

import java.util.EmptyStackException;

/**
 * pop()
 * push()
 * peek()
 * isEmpty()
 *
 */
class Stack<T> {

	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}
}

public class StackMain {
	public static void main(String[] args) {
		Stack s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.isEmpty());
	}
}
