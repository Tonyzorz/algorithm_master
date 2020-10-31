package basic.donbinna_algo.problem.taewon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _2_1431 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.next();
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				//the value 0 if x == y;a value less than 0 if x < y; and a value greater than 0 if x > y
				
				if(o1.length() < o2.length()) {
					return -1;
				}
				else if (o1.length() == o2.length()) {
					int a = add(o1);
					int b = add(o2);
					if(a == b) {
						return o1.compareToIgnoreCase(o2);
					} else {
						return Integer.compare(a, b);
					 }
				}
				return 1;
			}
			
		});
		
		printAll(arr);
	}
	
	public static int add(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
                sum += s.charAt(i)-'0';
            }
        }
        return sum;
    }
	
	public static void printAll(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
