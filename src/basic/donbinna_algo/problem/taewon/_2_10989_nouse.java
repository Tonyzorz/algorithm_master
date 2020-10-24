package basic.donbinna_algo.problem.taewon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2_10989_nouse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr= new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				for(int j = 0; j < arr[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		
		br.close();
		bw.close();
	}
}
