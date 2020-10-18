package basic.donbinna_algo.problem.jinkwang;

import java.util.Scanner;

public class SelectionSortProblem// 백준에 제출할때는 class명을 Main으로 바꾸어서 제출해야된다.
{
	public static void main(String[] args)
	{
		int i, j, min, index = 0, temp, number; // i 첫번째 배열에 수를 담기위해서 사용, j 최소값을 찾아서 표지하기위한 변수, index에 j위치를 마킹, temp로 swap, number로 숫자 범위 받음, min 최소값 변수
		
		Scanner scan = new Scanner(System.in);
		//배열의 길이를 입력받는다.
		number = scan.nextInt();
		int array[] = new int[number]; // 0 < n < 1000까지의 범위이다.->문제에서 제시된 범위
		// 임의의 숫자를 입력받아서 array를 만든다.
		for (i = 0; i < number; i++) {
			array[i] = scan.nextInt();
		}
		//i번째부터 시작해서 number까지 반복하며 최솟값 j를 찾아서 index에 담아준다
		for (i = 0; i < number; i++) {
			//배열을 선택 정렬로 정렬한다. 여기서 다른 정렬법을 사용해도되나 선택정렬을 예시로 삼아 진행한다.
			//최소값을 지정해두고 배열안의 값들과 비교해서 현재 최소값보다 작은 값이 있는 곳의 index를 j에 저장하고 제일 왼쪽으로 보내준다. 시작점의 값과 j위치의 값을 temp를 이용해서 swap해준다.
			min = 1001;
			for (j = i; j < number; j++) {
				//주어진 범위의 값보다 큰수로 하여 범위내의 모든수와 비교한다.
				if (min > array[j]) {
					min = array[j];
					index = j;// 최소값의 위치 표시 -> 시작점의 숫자와 자리를 바꿔주고 다음 비교를 시작할떄 사용.
				}
			}
			//전역변수 index에 최소값의 위치를 j를 담아 for문 밖에서도 swap할때 사용할 수 있다.
			//최소값의 위치인 index와 시작점 위치인 i을 swap
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		scan.close();//입력 닫기.
		// 출력
		for (i = 0; i < number; i++) {
			System.out.println(array[i]);
		}
		
	}
}
