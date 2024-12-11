package baekjoon.step11;

import java.io.*;

public class B24313 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int a1 = Integer.parseInt(input1[0]);
		int a0 = Integer.parseInt(input1[1]);
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		br.close();
		if(a1 * n0 + a0 <= c * n0 && a1 <= c) {
			bw.append("1");
		}else {
			bw.append("0");
		}
		bw.close();
	}
}