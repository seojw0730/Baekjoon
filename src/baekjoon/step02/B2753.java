package baekjoon.step02;

import java.io.*;

public class B2753 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input1 = Integer.parseInt(br.readLine());
		br.close();
		if((input1 % 4 == 0 && input1 % 100 != 0) || (input1 % 400 == 0)) bw.append("1");
		else bw.append("0");
		bw.close();
	}
}
