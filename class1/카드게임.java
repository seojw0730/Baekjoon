package class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 카드게임 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int answer = 0;
			for(int i=0; i<5; i++) {
				answer += Integer.parseInt(br.readLine());
			}
			br.close();
			
			bw.append(String.valueOf(answer)).close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
