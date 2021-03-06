package basic.donbinna_algo.heap_sort.taewon;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {40, 20, 50, 10, 30, 70};
		heapSort(arr);
	}
	
	public static void printAll(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
	}
	
	public static void heapSort(int[] arr) {
		System.out.println("최초 입력 받은 배열");
		printAll(arr);
		
		int length = arr.length;
		heapify(arr, length);
		
		for(int i = length - 1; i > 0; i--) {
			swap(arr, 0, i);
			System.out.println("최대값을 맨뒤와 바꾼 후 배열");
			printAll(arr);
			heapify(arr, i);
		}
	}
	
	public static void heapify(int[] arr, int index) {
		for(int i = 1; i < index; i++) {
			
			int child = i;
			
			while(child > 0) {
				int parent = (child - 1) / 2;
				if(arr[child] > arr[parent]) {
					swap(arr, child, parent);
				}
				child = parent;
			}
			System.out.println("최대힙 구조로 변환한 배열");
			printAll(arr);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	
}
