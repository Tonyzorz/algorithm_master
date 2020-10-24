package basic.donbinna_algo.problem.taewon;

import java.util.Scanner;

public class _1_MergeSort_2751_timeover {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		mergeSort(arr);
		print(arr);
	}
	
	private static void mergeSort(int[] arr) {
		int length = arr.length;
		int[] tmp = new int[length];
		mergeSort(tmp, arr, 0, length - 1);
	}
	
	private static void mergeSort(int[] tmp, int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(tmp, arr, start, mid);
			mergeSort(tmp, arr, mid + 1, end);
			merge(tmp, arr, start, mid, end);
		}
	}
	
	private static void merge(int[] tmp, int[] arr, int start,int mid, int end) {
		for(int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}

		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		
		while(part1 <= mid && part2 <= end) {
			if(tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		
		for(int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmp[i + part1];
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
