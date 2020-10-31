package basic.donbinna_algo.merge_sort.jinkwang;

public class MergeSort
{

	private static void mergeSort(int[] arr)
	{ // 임시로 값을 저장할 배열 생성
		int[] temp = new int[arr.length];
		// 정렬하고자하는 배열, 임시저장배열, 시작 idx, 끝 idx를 인자로 받는다. arr.length의 -1을 해주면
		// idx는 0부터 시작하므로 같은값이다.
		mergeSort(arr, temp, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int[] temp, int start, int end)
	{
		// 두개로 쪼개고 비교하다보면 start가 end랑 같아지면 이미 배열 비교가 끝났다는 의미이므로 같아지기 전까지만 비교한다.
		if (start < end)
		{
			// 중간값을 잡고 반으로 쪼개기위해서 잡는 지표
			int mid = (start + end) / 2;
			// 중간에서 앞에 배열 정렬
			mergeSort(arr, temp, start, mid);
			// 중간에서 뒤에 배열 정렬
			mergeSort(arr, temp, mid + 1, end);
			// 두배열 비교해서 병합해서 temp배열에 담고 원본 arr에 복사
			merge(arr, temp, start, mid, end);
		}
	}

	private static void merge(int[] arr, int[] temp, int start, int mid, int end)
	{
		// 정렬위해 temp에 배열 복사 임시저장소에 정렬할 배열을 복사
		for (int i = start; i <= end; i++)
		{
			temp[i] = arr[i];
		}
		// 앞쪽 배열의 idx
		int part1 = start;
		// 중간 기준 뒤쪽 배열의 idx
		int part2 = mid + 1;
		// 최종 배열의 idx
		int index = start;

		// 두 배열을 비교하면서 포인터 이동시키고 arr에 정렬된 값을 복사하는 로직
		while (part1 <= mid && part2 <= end)
		{
			if (temp[part1] < temp[part2])
			{
				arr[index] = temp[part1];
				part1++;
			}
			else
			{
				arr[index] = temp[part2];
				part2++;
			}
			index++;
		}
		// 만약 앞에 배열이 남고 뒤배열을 다 집어 넣었을때처리( 뒷배열이 남았으면 그냥 넣으면되니까 필요없음) 중간값에서 part1을 빼줘야 mid까지
		// 남은 개수를 구할수 있고 그만큼 반복문을 돌면서 arr에 복사한다.
		// for (int i = 0; i <= mid - part1; i++)
		// {
		// arr[index + i] = temp[part1 + i];
		// }

		
		//남은배열을 순차적으로 넣어줌 이미 정렬이 되있는 두개를 합치는거이므로 비교하고 남은애는 순서대로 넣으면된다.
		if (part1 > mid)
		{
			for (int t = part2; t <= end; t++)//mid까지 포함해서 돌려야 전부 다 돌리는거니까 = 꼭 확인!
			{
				arr[index] = temp[t];
				index++;
			}
		}
		else
		{
			for (int t = part1; t <= mid; t++)
			{
				arr[index] = temp[t];
				index++;
			}
		}

	}

	private static void printArray(int[] arr)
	{
		for (int data : arr)
		{
			System.out.print(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] arr = {9,5,1,7,3,2,6,4,0};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}
}
