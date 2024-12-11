package baekjoon.step06;

import java.io.*;

public class B3003 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int[] input2 = new int[6];
		for(int i = 0; i < 6; i++) {
			input2[i] = Integer.parseInt(input1[i]);
		}
		int[] answer = new int[6];
		answer[0] = 1 - input2[0];
		answer[1] = 1 - input2[1];
		answer[2] = 2 - input2[2];
		answer[3] = 2 - input2[3];
		answer[4] = 2 - input2[4];
		answer[5] = 8 - input2[5];
		for(int i : answer) {
			bw.append(i + " ");
		}
		bw.close();
	}
}
