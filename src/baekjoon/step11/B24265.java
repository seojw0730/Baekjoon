package baekjoon.step11;

import java.io.*;

public class B24265 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Integer.parseInt(br.readLine());
		br.close();
		bw.append(n * (n - 1) / 2 + "\n2").close();
	}
}