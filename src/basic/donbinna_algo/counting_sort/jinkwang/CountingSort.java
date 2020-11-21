package basic.donbinna_algo.counting_sort.jinkwang;

public class CountingSort
{
	public static void main(String[] args)
	{
		int[] count = new int[5];
		int[] array = {1, 3, 2, 4, 3, 2, 5, 3, 1, 2, 3, 4, 4, 3, 5, 1, 2, 3, 5, 2, 3, 1, 4, 3, 5, 1, 2, 1, 1, 1};

		// 배열에 모든 방에 0으로 초기화. 나중에 개수만큼 ++ 해준다.
		for (int i = 0; i < 5; i++)
		{
			count[i] = 0;
		}

		// 개수를 센다 이건 이해안되면 직접 그려보기. i의값은 배열방을 세는 크기이고 idx는 그것보다 -1 (0부터 시작하니까);
		for (int i = 0; i < 30; i++) 
		{
			count[array[i] - 1]++;
		}

		// 출력 count 배열의 방개수는 5방이므로 0~4까지 돌리면 된다.

		for (int i = 0; i < 5; i++)// 여기 선언한 i를 찍는거니까 +1 해서 찍는다 0부터 시작이니.
		{
			// 0개면 찍을 필요가 없다. 없는 값이니까
			if (count[i] != 0)
			{
				// count[i]의 값만큼 반복해서 찍어줘야하니까 반복문이 하나 더있어야된다.
				for (int j = 0; j < count[i]; j++)
				{
					// 방을 새는 숫자므로 i + 1 해줘야한다. idx는 0부터이지만 첫번쨰 방은 1번칸 이므로 
					// 그칸의 숫자만큼 그칸 숫자를 찍어야하니까.
					System.out.print(i+1);
				}
			}
		}
	}

}
