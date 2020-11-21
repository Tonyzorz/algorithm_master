package basic.이코테.그리디_구현.jinkwang;

public class Coin
{ // 동전 거슬러주기 문제. 최소한의 개수로 동전을 거슬러 준다. 거스름돈은 1260원이며 동전의 종류는 500, 100, 50, 10 원 4종류이며 개수는
	// 무제한이다.
	public static void main(String[] args)
	{
		int n = 1260; // 거스름돈
		int count = 0; // 동전의 개수
		int[] array = {500, 100, 50, 10}; // 동전의 종류

		for (int i = 0; i < array.length; i++)
		{
			count += n / array[i]; // 동전으로 금액을 나누면 몇번 줄수 있는지 회수를 셀수있다.(몫을 저장하면 동전을 몇개 썻는지 알수있는데 여기 계속 누계하여 총 개수를 알 수 있다.)
			n %= array[i]; // 동전으로 금액을 나눈 나머지를 n에 저장한다. 나머지값을 계속 동전을 바꿔가며 나누는것이다.
		} 
		System.out.println(count);
	}
}
