package basic.bubble_sort.taewon;

public class BubbleSort {

//	public static void main(String[] args) {
//		int i, j, temp;
//		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
//		int length = array.length;
//		
//		for(i = 0; i < length; i++) {
//			
//			for(j = 0; j < length - 1 - i; j++) {
//				
//				if(array[j] > array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//			
//			System.out.print(i + 1 + "회전: ");
//			print(array);
//		}
//		
//		System.out.print("final회전: ");
//		print(array);
//	}
//	
	public static void main(String[] args) {
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array.length - 1 - i; j++) {
				
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		print(array);
	}
	public static void print(int array[]) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
}
