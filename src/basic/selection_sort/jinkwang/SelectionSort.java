package basic.selection_sort.jinkwang;

public class SelectionSort
{
	public static void main(String[] args)
	{
		int i, j, min, index, temp; // index : 가장 작은 숫자가 있는 위치 마킹
		int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		// (i,j)로 위치를 이동하며 비교해야겠다
		// 제일 작은 수를 앞으로 보내야겠다
		// 작은수가 있던 위치를 index에 담고 temp 변수를 이용해 위치를 바꿔준다
		for (i = 0; i < 10; i++)
		{
			index = 0;
			min = 9999; // 배열에 있는 수 보다 크게 잡아서 비교시 사용해주기 위한 최소값의 초기값 for문이 돌떄마다
						// 9999로 초기화 되서 다시 if문에서 비교하게 된다.
			for (j = i; j < 10; j++)
			{
				if (min > array[j])
				{
					min = array[j];
					index = j;
				}

			}
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		System.out.print("{ ");
		for (int k = 0; k < array.length; k++)
		{
			if (k < array.length - 1)
			{
				System.out.print(array[k] + ", ");
			}
			else
			{
				System.out.print(array[k]);
			}

		}
		System.out.println(" }");
		// { 1,2,3,4,5,6,7,8,9,10 }
	}
}
