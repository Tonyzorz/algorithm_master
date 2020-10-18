package basic.donbinna_algo.merge_sort.taewon;

public class MergeSort_2 {

	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}
	
	private static void mergeSort(int[] arr) {
		int length = arr.length;
		int[] tmp = new int[length];
		mergeSort(arr, tmp, 0, length - 1);
	}
	
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid + 1, end);
			merge(arr, tmp, start, mid, end);
		}
	}
	
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		//임시 저장소에 데이터 저장
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
		
		//뒤쪽 배열은 다 정렬이 되었는데 앞쪽은 정렬이 안되었다. 그런 상황을 대비해 아래 포문 실행
		//만약 반대인, 앞쪽은 정렬이 되어있는데 뒤쪽은 정렬이 안되었을때는 신경을 안써도 되는 이유는
		//어차피 정렬이 벌서 되어있는 상태이기 때문이다.
		for(int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}
		
	}
	
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
}
