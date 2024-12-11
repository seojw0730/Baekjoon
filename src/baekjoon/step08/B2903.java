package baekjoon.step08;

import java.io.*;

public class B2903 {
	public static int solution(int n) {
		return (int)Math.pow(Math.pow(2, n) + 1, 2);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(solution(n))).close();
	}
}