package basic.donbinna_algo.problem.taewon;

import java.util.Scanner;

public class _2_HeapSort_1181_nouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.next();
		}
		heapSort(arr);
		printAll(arr);
	}
	
	public static void heapSort(String[] arr) {
		
		int length = arr.length;
		
		heapify(arr, length);
		
		for(int i = length - 1; i > 0; i--) {
			swap(arr, 0, i);
			
			heapify(arr, i);
		}
	}
	
	public static void heapify(String[] arr, int end) {
		
		for(int i = 1; i < end; i++) {
			
			int child = i;
			
			while(child > 0) {
				
				int parent = (child - 1) / 2;
				
				if(arr[child].length() > arr[parent].length()) {
					swap(arr, child, parent);
				} else if(arr[child].length() == arr[parent].length()) {
					compare(arr, child, parent);
				}
				
				child = parent;
			}
		}
	}
	
	public static void compare(String[] arr, int child, int parent) {
		int res = arr[child].compareToIgnoreCase(arr[parent]);
		if(res > 0) {
			swap(arr, child, parent);
		}
	}
	
	public static void swap(String[] arr, int i, int j) {
		String tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void printAll(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			if(i > 0 && arr[i].contentEquals(arr[i - 1])){
				continue;
			} else {
				System.out.println(arr[i]);
				
			}
		}
	}
}
