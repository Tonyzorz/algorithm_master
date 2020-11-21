package basic.donbinna_algo.stack.jinkwang;

import java.util.Stack;

public class StackProblem
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(7);
		s.push(5);
		s.push(4);
		s.pop();
		s.push(6);
		s.pop();
		s.push(9);
		s.push(10);
		
		while (!s.empty())
		{
			System.out.println(s.pop());
		}
	}
}
