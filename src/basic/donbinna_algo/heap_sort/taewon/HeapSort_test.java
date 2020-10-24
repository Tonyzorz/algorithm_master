package basic.donbinna_algo.heap_sort.taewon;

public class HeapSort_test {

	/*
	 * 1. 힙정렬 만들기
	 * 1.1 child 가 parent보다 클 시 parent와 swap
	 * 2. 루트 값을 마지막 인덱스 와 스왑
	 * 3. 인덱스가 root 까지 반복
	 * 
	 */
	
	public static void main(String[] args) {
		int[] arr = {40, 20, 50, 10, 30, 70};
		heapSort(arr);
		printAll(arr);
	}
	
	public static void heapSort(int[] arr) {
		int length = arr.length;
		heapify(arr, length);
		
		for(int i = length - 1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i);
		}
	}
	
	public static void heapify(int[] arr, int end){
		
		for(int i = 1; i < end; i++) {
			
			int child = i;
			while(child > 0) {
				int parent = (child - 1) / 2;
				if(arr[child] > arr[parent]) {
					swap(arr, child, parent);
				}
				child = parent;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void printAll(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

