package solvedac.class1;

import java.io.*;

public class B6131 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); br.close();
		int answer = 0;
		for(int b = 1; b <= 500; b++) {
			for(int a = b; a <= 500; a++) {
				if(a * a == b * b + n) {
					answer++;
					break;
				}
				if(a * a > b * b + n) break;
			}
		}
		bw.append(String.valueOf(answer)).close();
	}
}
