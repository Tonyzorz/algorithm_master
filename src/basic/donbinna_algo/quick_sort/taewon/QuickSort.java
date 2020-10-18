package basic.donbinna_algo.quick_sort.taewon;

public class QuickSort {

	public static void main(String[] args) {
		
		int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int datas[] = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		quickSort(datas, 0, datas.length - 1);
		print(datas);
	
		//퀵 정렬 소스코드에서 단 두 부분만 바꾸어서 
		//내림차순 정렬 소스코드로 바꾸어보세요.
		
	}
	
	
	public static void quickSort(int data[], int start, int end) {
		
		if(start >= end) { // 원소가 1개인 경우
			return;
		}
		
		int key = start; //키는 첫번째 원소
		int i = start + 1;
		int j = end;
		int temp;
		System.out.println("start " + i + ", current datas are i == " + i + " j == " + j);
//		{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}
//		3 7 8 1 5 9 6 10 2 4
//		3 2 8 1 5 9 6 10 7 4
//		3 2 1 8 5 9 6 10 7 4
		while(i <= j) {//엇갈릴 때까지 반복, array 인덱스
			
			//키 값보다 큰 값을 만날 때까지
			while(data[i] <= data[key]) {
				System.out.println("before i : " + i);
				i++;
				if(i > end) {
					break;
				}
				System.out.println("after i : " + i);

			}
			
//			3 7 8 1 5 9 6 10 2 4
			//키 값보다 작은 값을 만날때까지
			while(data[j] >= data[key] && j > start) {
				System.out.println("before j : " + j);

				j--;
				
				System.out.println("after  j: " + j);

			}
			
			//현재 엇갈린 상태면 키 값과 교체
			if(i > j) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		print(data);
		quickSort(data, start, j-1);
		quickSort(data, j + 1, end);
	}
	
	public static void print(int array[]) {
		for(int i = 0; i < array.length; i ++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	
	
}
