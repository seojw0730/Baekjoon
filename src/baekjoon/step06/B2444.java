package baekjoon.step06;

import java.io.*;

public class B2444 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i = 1; i <= n - 1; i++) {
			for(int j = 0; j < n - i; j++) {
				bw.append(" ");
			}
			for(int j = 0; j < 2 * i - 1; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		for(int i = 0; i < 2 * n - 1; i++) {
			bw.append("*");
		}
		bw.newLine();
		for(int i = 1; i <= n - 1; i++) {
			for(int j = 0; j < i; j++) {
				bw.append(" ");
			}
			for(int j = 0; j < 2 * (n - i) - 1; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		bw.close();
	}
}
