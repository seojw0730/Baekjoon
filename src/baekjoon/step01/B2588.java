package baekjoon.step01;

import java.io.*;

public class B2588 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input1 = Integer.parseInt(br.readLine());
		int input2 = Integer.parseInt(br.readLine());
		br.close();
		bw
		.append(String.valueOf(input1 * (input2 % 10)) + "\n")
		.append(String.valueOf(input1 * ((input2 % 100) / 10)) + "\n")
		.append(String.valueOf(input1 * (input2 / 100)) + "\n")
		.append(String.valueOf(input1 * input2) + "\n")
		.close();
	}
}
