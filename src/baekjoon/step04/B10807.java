package baekjoon.step04;

import java.io.*;

public class B10807 {
	public static int solution(int n, int[] arr, int v) {
		int answer = 0;
		for(int i : arr) {
			if(i == v) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] input1 = br.readLine().split(" ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(input1[i]);
		int v = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(solution(n, arr, v))).close();
	}
}
