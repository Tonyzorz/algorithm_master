package basic.data_strcture.taewon.list.linkedlist.implementation;

public class LinkedList {

	//Node == Vertex
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	//LinkedList의 첫번째 노드에 추가 
	public boolean addFirst(Object input) {
		Node temp1 = new Node(input);
		temp1.next = head;
		head = temp1;
		size++;
		
		if(head.next == null) {
			tail = head;
		}
		
		return true;
	}
	
	//LinkedList의 마지막 노드에 추가 
	public boolean addLast(Object input) {
		Node lastNode = new Node(input);
		
		if(size == 0) {
			addFirst(input);
		} else {
			tail.next = lastNode;
			tail = lastNode;
			size++;
		}
		
		return true;
	}
	
	//LinkedList index 조회 
	Node node(int index) {
		
		Node temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public void add(int index, Object input) {
		if(index == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(index - 1);
			Node temp2 = node(index);
			Node newNode = new Node(input);

			temp1.next = newNode;
			newNode.next = temp2;
			if(newNode.next == null) {
				tail = newNode;
			}
			size++;
		}
	}
	
	public String toString() {
		if(head == null) {
			return "[]";
		} 
		Node temp = head;
		String str = "[";
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data + "]";
		return str;
	}
	
	//removeFirst
	//removeLast
	//remove
	//size
	//get
	//indexOf
	//Iterator next
	//Iterator add
	//Iterator remove
	
}
