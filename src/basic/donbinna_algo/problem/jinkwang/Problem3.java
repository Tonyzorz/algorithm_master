package basic.donbinna_algo.problem.jinkwang;

import java.util.Scanner;

public class Problem3
{
	public static void main(String[] args)
	{
		// 1 ≤ number ≤ 1,000,000의 수를 입력받아 오름차순으로 정렬

		// 숫자를 하나씩 입력받는다 입력받는 개수는 number개 만큼 입력받는다. 그다음 배열에 담는다.
		int i, number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		int array[] = new int[number];
		for (i = 0; i < number; i++)
		{
			array[i] = scan.nextInt();
		}
		quickSort(array, 0, array.length - 1);
		scan.close();
		// System.out.print("{ ");
		// for (i = 0; i < array.length; i++)
		// {
		// System.out.print(array[i]);
		// if (i < array.length - 1)
		// {
		// System.out.print(", ");
		// }
		//
		// }
		// System.out.println(" }");
		for (i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}

	}

	// quick 정렬로 정렬한다
	private static void quickSort(int[] arr, int l, int r)
	{
		if (l < r)
		{
			int p = partition(arr, l, r);
			quickSort(arr, l, p - 1);
			quickSort(arr, p + 1, r);
		}
	}

	// 배열 정렬
	private static int partition(int[] arr, int l, int r)
	{
		int pivot = arr[r];
		int i = (l - 1);
		for (int j = l; j < r; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				// arr[i]이랑 arr[j] 랑 swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		// arr[pivot]랑 arr[i+1]를 바꿔서 분할점을 잡고 이제 재귀를 돌려준다.
		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;

		return (i + 1);
	}

}
