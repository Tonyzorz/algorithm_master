package basic.data_strcture.taewon.list.arraylist.implementation;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	//뒤에 데이터를 추가해주는 메소드
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	//특정 위치에 엘리먼트를 추가해주는 메소드 
	public boolean add(int index, Object element) {
		if(elementData[index] != null) {

			for(int i = size - 1; i >= index; i--) {
				Object temp = elementData[i];
				elementData[i + 1] = temp;
				
			}
		}
		
		elementData[index] = element;
		
		size++;
		return true;
	}
	
	//첫번째 index에 엘리먼트 추가하는 메소드
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	//파라미터의 인덱스를 제거하고 순차적으로 체어주기
	public Object remove(int index) {
		if(elementData[index] == null) {
			return false;
		} 
		Object removed = elementData[index];
		for(int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
		return removed;
	}
	
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		return remove(size - 1);
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object element) {
		
		for(int i = 0; i <= size - 1; i++) {
			if(element.equals(elementData[i])) return i;
		}
		return -1;
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public String getAll() {
		
		String all = "";
		for(int i = 0; i < size; i++) {
			all += get(i) + " ";
		}
		return all;
	}
	
	public String toString() {
		String str = "[";
		for(int i = 0; i < size; i++) {
			str += elementData[i];
			if(i < size - 1) str += " ";
		}
		return str + "]";
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator {
		private int nextIndex = 0;
		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;
//			return returnData;
			return elementData[nextIndex++];
		}
		
		public Object previous() {
			return elementData[--nextIndex];
		}
		
		public boolean hasNext() {
			//return (elementData[nextIndex] != null) ? true : false;
			return nextIndex < size();
		}
		
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		
		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}
		
		public void remove() {
			ArrayList.this.remove(nextIndex);
			nextIndex--;
		}
	}
}
