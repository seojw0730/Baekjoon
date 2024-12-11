package baekjoon.step10;

import java.io.*;

public class B1085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int x = Integer.parseInt(input1[0]);
		int y = Integer.parseInt(input1[1]);
		int w = Integer.parseInt(input1[2]);
		int h = Integer.parseInt(input1[3]);
		int answer = Integer.MAX_VALUE;
		answer = Math.min(answer, x);
		answer = Math.min(answer, y);
		answer = Math.min(answer, Math.abs(x - w));
		answer = Math.min(answer, Math.abs(y - h));
		bw.append(String.valueOf(answer)).close();
	}
}