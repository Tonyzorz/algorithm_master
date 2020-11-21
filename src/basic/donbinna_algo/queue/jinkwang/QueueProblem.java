package basic.donbinna_algo.queue.jinkwang;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProblem
{

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(7);
		q.add(5);
		q.remove();
		q.add(4);
		q.add(8);
		q.remove();
		q.add(9);

		while (!q.isEmpty())
		{
			System.out.println(q.remove());
		}
	}
}
