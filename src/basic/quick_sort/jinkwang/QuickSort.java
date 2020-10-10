package basic.quick_sort.jinkwang;

public class QuickSort
{
	public static void main(String[] args)
	{
		int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		quickSort(data, 0, data.length - 1);
		show(data);
	}

	// 출력
	public static void show(int data[])
	{
		int i;
		System.out.print("{");

		for (i = 0; i < data.length; i++)
		{
			System.out.print(data[i]);
			if (i < data.length - 1)
			{
				System.out.print(", ");
			}

		}
		System.out.print("}");
	}

	// 퀵정렬
	public static void quickSort(int data[], int start, int end)
	{
		if (start < end)
		{
			int p = partition(data, start, end);
			quickSort(data, start, p - 1);// 피벗이 이제 오른쪽 끝에서 구분해줄수있는 i+1지점으로 옴 이 녀석보다 작은
											// 값들을 다시 정렬(왼쪽에 있는것은 이미 작은것은 맞으니까 순서만 소트)
			quickSort(data, p + 1, end);// 피벗보다 큰 오른쪽에 값들을 정렬

		}
	}

	// 배열 정리
	static int partition(int data[], int start, int end)
	{
		int pivot = data[end];
		int i = (start - 1);// 피벗보다 작은수의 숫자, 나중에 피벗과 위치를 바꾼다
		for (int j = start; j < end; j++)
		{
			if (data[j] <= pivot)
			{
				i++;
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;
				// int array[] = swap();
			}
		}
		// swap(data[i+1], data[end]);
		int temp = data[i + 1]; // i + 1과 오른쪽 끝의 피벗과 위치를 바꾸어 array 파티션을 두개로 쪼갠다. 이제 피벗
								// 기준으로 오른쪽은 큰값 왼쪽들은 작은값들이 (피벗보다 크고 작은것) 정렬됬는지는 알수 없지만
								// 값은 피벗보다 크거나 작은녀석들로 양분된 것을 알수 있다. 이때 재귀함수로 왼쪽을 소트하고 오른쪽을
								// 소트해서 정리를 완료한다.
		data[i + 1] = data[end];
		data[end] = temp;

		return (i + 1); // pivot의 위치
	}

	// int[] swap (int dataA[], int dataB[]){
	// int temp = data[j];
	// data[j] = data[i];
	// data[i] = temp;
	// return ;
	//
	// }

}
