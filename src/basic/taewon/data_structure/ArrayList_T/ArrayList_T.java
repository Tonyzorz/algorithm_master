package basic.taewon.data_structure.ArrayList_T;

public class ArrayList_T {

 /**
  * ArrayList 기능
  * - add
  * - addLast
  * - addFirst
  * - remove
  * - removeFirst
  * - removeLast
  * - get 
  * - toString
  * - size
  * - indexOf
  * 
  * - Iterator 
  * 	
  */
	private int size = 0;
	
	/**
	 * 원래 자바로 구현된 ArrayList의 Max 크기는 default maximum size = int byte 
	 * 														= 4 byte 
	 * 														= 32 bit 
	 * 														  8 bit => 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2  
	 * 														  32 bit => 2^31 - 1
	 * 														= 2,147,483,648
	 * 으로 구현되어 있다. 
	 */
	private Object[] elementData = new Object[100];
}
