package basic.이코테.DFS_BFS.taewon;

import java.util.Stack;

public class Stack_ex {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(7);
		s.pop();
		s.push(1);
		s.push(4);
		s.pop();
		
		while(!s.isEmpty()) {
			System.out.print(s.peek() + " ");
			s.pop();
		}
	}
}
