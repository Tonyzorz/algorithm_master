package basic.donbinna_algo.problem.taewon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _2_HeapSort_1181 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.next();
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				//the value 0 if x == y;a value less than 0 if x < y; and a value greater than 0 if x > y
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
		
		int j;
		for(int i = 0; i < arr.length - 1; i++) {
			
			int iLength = arr[i].length();
			
			for(j = i + 1; j < arr.length; j++) {
				int jLength = arr[j].length();
				
				if(iLength != jLength) {
					break;
				}
			}
			Arrays.sort(arr, i, j);
		}
		printAll(arr);
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
