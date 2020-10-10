package basic.selection_sort.taewon;

public class SelectionSort {

	public static void main(String[] args) {
		int i, j, min, temp, index = 0;
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int length = array.length;
		
		//sort 
		for(i = 0; i < length; i++) {
			//최소값을 선택하기 위해 제일 가능한 큰값 선언
			min = 9999;
			
			for(j = i; j < length; j++) {
				
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			
			System.out.print(i + 1 + " 회전 : ");
			print(array);
		}
		
		//출력
		System.out.print("final 회전 : ");
		print(array);
		
	}
	
	//회전 출력을 위한 print
	public static void print(int array[]) {
		for(int i = 0; i < array.length; i ++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
}
