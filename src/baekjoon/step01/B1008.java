package baekjoon.step01;

import java.io.*;

public class B1008 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		double a = Double.parseDouble(input1[0]);
		double b = Double.parseDouble(input1[1]);
		bw.append(String.valueOf(a / b)).close();
	}
}
