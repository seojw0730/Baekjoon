package solvedac.class1;

import java.io.*;

public class B1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); br.close();
		int temp = n, answer = 0;
		do {
			if(temp < 10) temp *= 11;
			else temp = 10 * (temp % 10) + (temp / 10 + temp % 10) % 10;
			answer++;
		} while(temp != n);
		bw.append(String.valueOf(answer)).close();
	}
}
