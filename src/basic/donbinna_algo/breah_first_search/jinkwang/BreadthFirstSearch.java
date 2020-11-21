package basic.donbinna_algo.breah_first_search.jinkwang;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class BreadthFirstSearch
{
	public static void main(String[] args)
	{

	}
}

/**
 * add remove peek isempty
 */
class Queue<T>
{
	class Node<T>
	{
		private T data;
		private Node<T> next;

		public Node(T data)
		{
			this.data = data;
		}
	}

	private Node<T> first;
	private Node<T> last;

	public void add(T data)
	{
		Node<T> t = new Node<T>(data);

		if (last != null)
		{
			last.next = t;
		}

		last = t;

		if (first == null)
		{
			last = null;
		}
	}

	public T peek()
	{
		if (first == null)
		{
			throw new EmptyStackException();
		}
		return first.data;
	}

	public T remove()
	{
		if (first == null)
		{
			throw new EmptyStackException();
		}

		T data = first.data;
		first = first.next;

		if (first == null)
		{
			last = null;
		}
		return data;
	}

	public boolean isEmpty()
	{
		return first == null;
	}
}

class Graph
{
	class Node
	{
		int data; // node's data
		LinkedList<Node> adjacent;// 인접한 노드들과의 관계
		boolean marked;// 방문했는지 표시하는 플래그

		// 노드의 생성자
		Node(int dada)
		{
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}

	// 노드들을 정렬할 배열
	Node[] nodes;

	// 그래프의 노드개수는 고정으로 작성 -> 간단하게 하기 위해
	Graph(int size)
	{
		// 사이즈(노드개수)를 받아서 그 개수만큼 배열방을 만들어준다.
		nodes = new Node[size];
		// 편의를 위해서 데이터와 배열방 사이즈를 동일하게 만든다.
		for (int i = 0; i < size; i++)
		{
			nodes[i] = new Node(i);
		}
	}

	// 두 노드의 관계를 저장하는 함수
	void addEdge(int i1, int i2)
	{
		// 데이터가 인덱스와 같음 그래서 받은 i1,2를 인덱스로 사용할 수 있다.
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];

		// 두개의 노드에 인접한 노드를 저장하는 LinkedList에 상대방이 있는지 확인하고 없으면 서로 추가해준다.
		if (!n1.adjacent.contains(n2))
		{
			n1.adjacent.add(n2);
		}
		if (!n2.adjacent.contains(n1))
		{
			n2.adjacent.add(n1);
		}
	}

	// 인자 없이 출력되면 0번 노드부터 넣고 시작하겠다.
	void dfs()
	{
		dfs(0);
	}

	void dfs(int index)
	{
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		// 현재노드를 스텍에 추가
		stack.push(root);
		// 스텍에 들어갔다고 표시
		root.marked = true;

		// 스텍에 데이터가 없을떄까지 반복
		while (!stack.isEmpty())
		{
			// 스텍에서 데이터 하나 가져오고
			Node r = stack.pop();
			// 가져온 데이터(노드)의 자식들을 스택에 저장
			for (Node n : r.adjacent)
			{
				if (n.marked == false)
				{
					n.marked = true;
					stack.push(n);
				}
			}
			// 그리고 방문할떄 출력해 주는 함수 visit()
			visit(r);
		}

	}

	// 인자 없이 출력되면 0번 노드부터 넣고 시작하겠다.
	void bfs()
	{
		bfs(0);
	}

	void bfs(int index)
	{
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
	}

	void visit(Node n)
	{
		System.out.println(n.data + " ");
	}

}
