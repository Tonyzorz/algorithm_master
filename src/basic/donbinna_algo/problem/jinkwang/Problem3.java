package basic.problem.jinkwang;

import java.util.Scanner;

public class Problem3
{
	public static void main(String[] args)
	{
		// 1 ≤ number ≤ 1,000,000의 수를 입력받아 오름차순으로 정렬

		// 숫자를 하나씩 입력받는다 입력받는 개수는 number개 만큼 입력받는다. 그다음 배열에 담는다.
		int i, j, pivot, temp, number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		int array[] = new int[number];
		for (i = 0; i < number; i++)
		{
			array[i] = scan.nextInt();
		}
		// quick 정렬로 정렬한다

		// 하나씩 출력
	}
}
