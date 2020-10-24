package basic.donbinna_algo.problem.taewon;

public class taewon_test {

	public static void main(String[] args) {
		String a = "test";
		String b = "test";
		
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.compareToIgnoreCase(a));
		System.out.println(b.compareToIgnoreCase(a));
		
		System.err.println(a.contentEquals(b));
		
	}
}
