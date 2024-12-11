package baekjoon.step05;

import java.io.*;

public class B11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String input1 = br.readLine(); br.close();
		char[] arr = input1.toCharArray();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(String.valueOf(arr[i]));
		}
		br.close();
		bw.append(String.valueOf(sum)).close();
	}
}
