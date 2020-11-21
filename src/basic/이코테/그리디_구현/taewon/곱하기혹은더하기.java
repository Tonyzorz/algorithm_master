package basic.이코테.그리디_구현.taewon;

import java.util.Scanner;

public class 곱하기혹은더하기 {

	/**
	 * 각 자리가 숫자(0부터 9)로만 이루어진 문자열 S가 주어졌을 때,
	 * 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하면 숫자 사이에
	 * x 혹은 + 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 
	 * 구하는 프로그램을 작성하세요. 
	 * 
	 * 단 일반적으로 x를 우선순으로 연산하는 방식과는 달리, 
	 * 모든 연산은 왼쪽에서부터 순서대로 이루어집니다. 
	 * 
	 * 예, 02984라는 문자열의 가장 큰 수는 (((((0+2)x9)x8)x4) = 576
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		//태원 로직
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}

		int result = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i - 1] == 0) {
				result += arr[i];
			} else {
				result *= arr[i];
			}
		}
		System.out.println(result);
		
		//동빈나 로직
		System.out.println((int)str.charAt(0));
		System.out.println((int)'0');
		long result2 = str.charAt(0) - '0';
		for(int i = 1; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			if(num <= 1 || result2 <= 1) {
				result2 += num;
			} else {
				result2 *= num;
			}
		}
		System.out.println(result2);
	}
}
