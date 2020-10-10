package basic.problem.jinkwang;

import java.util.Scanner;

public class Problem2 // 이름 바꿔서 제출
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// 3개 숫자를 입력받아서 오름차순으로 정렬 0 < n < 1000000;

		// 숫자 세개 입력받기 3 2 1 일자로 입력 받을것임
		int i, j, min, temp, index = 0;
		Scanner scan = new Scanner(System.in);
		String inputNum = scan.nextLine();
		String num[] = inputNum.split(" ");
		int array[] = new int[3];
		for (i = 0; i < 3; i++)
		{
			array[i] = Integer.parseInt(num[i]);

		}
		// 정렬 -> selection 써서 해보기 최소값의 위치를 j에 담아 index로 넣고 시작점(i)의 위치의 숫자와 최솟값 index위치의 수를
		// swap
		for (i = 0; i < 3; i++)
		{
			min = 1000001;
			for (j = i; j < 3; j++)
			{
				if (min > array[j])
				{
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		// 출력 1 2 3 이렇게 한칸씩 띄고 한줄로 출력하기
		for (i = 0; i < 3; i++)
		{
			if (i < 2)
			{
				System.out.print(array[i] + " ");
			}
			else
			{
				System.out.print(array[i]);
			}
		}

	}
}
