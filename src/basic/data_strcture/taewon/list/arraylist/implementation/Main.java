package basic.data_strcture.taewon.list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(5);
		numbers.remove(5);
		numbers.removeLast();
		System.out.println(numbers.indexOf(20));
		System.out.println(numbers);
		System.out.println(numbers.toString());
		
		ArrayList.ListIterator li = numbers.listIterator();
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 10) {
				//li.add(50);
				li.remove();
			}
			System.out.println(numbers);

			System.out.println(number);
		}
		System.out.println(numbers);

	}
}
