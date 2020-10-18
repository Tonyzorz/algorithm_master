package basic.insertion_sort.taewon;

public class InsertionSort {

	public static void main(String[] args) {
		int i, j, temp;
		int array[] = {10, 1, 5, 8, 7, 6, 4, 3, 2, 9};
		int length = array.length;
		
		for(i = 0; i < length - 1; i++) {
			j = i;
			
			while(array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				
				j = (j - 1 < 0)? 0: j--;
				/*
				 * j--; 
				 * j--를 하면 만약 첫번째 숫자가 두번째 숫자보다 클시 index out of bound -1발생
				 */
			}
			
			print(array);
		}
	}
	
	public static void print(int array[]) {
		for(int i = 0; i < array.length; i ++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
}
