package basic.insertion_sort.jinkwang;

public class InsertionSort
{
	public static void main(String[] args)
	{
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int i, j, temp; // i : 반복횟수, j : array 의 index , temp : swap를 위한 변수

		for (i = 0; i < array.length - 1; i++)
		{
			j = i;

			while (array[j] > array[j + 1])
			{
				temp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = temp;
				if (j > 0) // 거의 정렬 되어있는 경우  -1번째와 1 번째를 비교할수도 있으므로 j가 0보다 큰 경우에만 j--해준다.
				{
					j--;
				}
			}
			System.out.println(" ");
			for (int t = 0; t < array.length; t++)
			{
				System.out.print(array[t] + " ");
			}
		}
	}
}
