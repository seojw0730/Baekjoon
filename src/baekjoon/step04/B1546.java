package baekjoon.step04;

import java.io.*;

public class B1546 {
	public static double solution(int n, double[] arr) {
		double m = Double.MIN_VALUE, sum = 0;
		for(double i : arr) {
			if(i > m) m = i;
		}
		for(int i = 0; i < n; i++) sum += arr[i] / m * 100;
		return sum / n;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");
		double[] arr = new double[n];
		for(int i = 0; i < n; i++) arr[i] = Double.parseDouble(input1[i]);
		bw.append(String.valueOf(solution(n, arr))).close();
	}
}
