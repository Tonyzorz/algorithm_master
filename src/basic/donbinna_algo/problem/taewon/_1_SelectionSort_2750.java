package basic.donbinna_algo.problem.taewon;

import java.util.Scanner;

public class _1_SelectionSort_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		sort(arr);
		print(arr);
	}
	
	public static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int small = 9999;
			boolean swap = false;
			int place = 0;
			for(int j = i; j < arr.length; j++) {
				if(small > arr[j]) {
					small = arr[j];
					swap = true;
					place = j;
				}
			}
			
			//swap
			if(swap) {
				int temp = arr[i];
				arr[i] = small;
				arr[place] = temp;
			}
			
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
