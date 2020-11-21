package basic.이코테.그리디_구현.taewon;

import java.util.Scanner;

public class 일이될때까지 {

	/**
	 * 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 수행.
	 * 단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택.
	 * 1. N에서 1을 뺍니다.
	 * 2. N을 K로 나눕니다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int cnt = 0;
		System.out.println(n);
		System.out.println(k);
		
		//태원 로직 단순단순
//		while(n != 1) {
//			System.err.println(n);
//			if(n % k != 0) {
//				n -= 1;
//				cnt++;
//			} else {
//				n /= k;
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		//테크닉컬하게 풀이
		while(true) {
			//next divisible number, if there is none, it returns 0
			int target = (n/k) * k;
			System.out.println("target =" + target);
			cnt += (n - target);
			System.out.println("cnt = " + cnt);
			n = target;
			System.out.println("n = " + n);
			
			if(n < k) break;
			
			cnt++;
			System.out.println("cnt = " + cnt);
			n /= k;
			System.out.println("n = " + n);
		}

		cnt += (n - 1);
		System.out.println(cnt);
	}
}
