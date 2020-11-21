package basic.이코테.그리디_구현.taewon;

public class 거스름돈 {

	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinTypes = {500, 100, 50, 10};
		
		for(int i = 0; i < coinTypes.length; i++) {
			cnt += n/coinTypes[i];
			n %= coinTypes[i];
			//percent means it carries remainder 
		}
		
		System.out.println(cnt);
	}
}
