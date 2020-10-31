package basic.donbinna_algo.queue.taewon;

public class QueueTest {

	public static void main(String[] args) {
		QueueCreated<Integer> q = new QueueCreated<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		System.out.println(q.peek());
		
		System.out.println(q.isEmpty());
		
		q.remove();
		q.remove();
		q.remove();
		System.out.println(q.isEmpty());
		
	}
}
