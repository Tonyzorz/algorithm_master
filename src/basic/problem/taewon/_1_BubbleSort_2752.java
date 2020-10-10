package basic.problem.taewon;

import java.util.Scanner;

public class _1_BubbleSort_2752 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		String str = scan.nextLine();
		String[] str2 = str.split(" ");
		
		for(int i = 0; i < str2.length; i++) {
			arr[i] = Integer.parseInt(str2[i]);
		}
		
		bubbleSort(arr);
		print(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		
		int p = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length - p; j++) {
				if(arr[i] <= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			p++;
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
