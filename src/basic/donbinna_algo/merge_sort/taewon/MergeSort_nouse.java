package basic.donbinna_algo.merge_sort.taewon;

public class MergeSort_nouse {

	static int[] sorted;
	
	public static void main(String[] args) {
		
		int[] array = {7, 6, 5, 8, 3, 5, 9, 1, 2};
		int length = array.length;
		sorted = new int[length];
		mergeSort(array, 0, length - 1);
	}
	
	public static void merge(int[] array, int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
		
		//작은 순서대로 배열에 정렬
		while(i <= middle && j <= n) {
			if(array[i] <= array[j]) {
				sorted[k] = array[i];
				i++;
			} else {
				sorted[k] = array[j];
				j++;
			}
			k++;
			
		}
		
		//남은 데이터도 삽입
		if(i > middle) {
			for(int t = j; t <= n; t++) {
				sorted[k] = array[t];
				k++;
			}
		} else {
			for(int t = i; t <= n; t++) {
				sorted[k] = array[t];
				k++;
			}
		}
		
		//정렬된 sorted array를 array으로 이동...?
		for(int t = m; t <= n; t++) {
			array[t] = sorted[t];
		}
	}
	
	static void mergeSort(int a[], int m, int n) {
		//크기가 1보다 큰 경우
		if (m < n) {
			
			int middle = (m + 2) / 2;
			
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			
			merge(a, m, middle, n);
		}
	}
	
	static void print(int[] array) {
		System.out.printf("[ ");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.print(" ]");
		
	}
}
