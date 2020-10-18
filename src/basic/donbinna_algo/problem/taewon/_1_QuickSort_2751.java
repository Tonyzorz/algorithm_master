package basic.donbinna_algo.problem.taewon;

import java.util.Scanner;

public class _1_QuickSort_2751 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		quickSort(arr, 0, num - 1);
		print(arr);
	}
	
	public static void quickSort(int[] arr, int start, int end) {
	
		if(start < end) {
			
			print(arr);
			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);
			
		}
		
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = (left - 1);
//		System.out.println("pivot is " + pivot);
		for(int j = left; j <= right - 1; j++) {
			
			if(arr[j] <= pivot) {
				i++;
//				System.out.println("about to change: " + arr[j] + " with " + arr[i]);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i] = arr[right];
		arr[right] = temp;
		
		return i;
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");

	}
}
