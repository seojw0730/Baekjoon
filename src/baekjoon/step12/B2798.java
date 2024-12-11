package baekjoon.step12;

import java.io.*;

public class B2798 {
	static int[] chk, arr;
	static int n, m, answer = Integer.MIN_VALUE;
	
	public static void solution(int sum, int num) {
		if(sum > m) return;
		
		if(num == 3) {
			answer = Math.max(answer, sum);
		}else {
			for(int i = 0; i < n; i++) {
				if(chk[i] == 0) {
					chk[i] = 1;
					solution(sum += arr[i], num + 1);
					chk[i] = 0;
					sum -= arr[i];
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		n = Integer.parseInt(input1[0]);
		m = Integer.parseInt(input1[1]);
		arr = new int[n];
		chk = new int[n];
		String[] input2 = br.readLine().split(" ");
		br.close();
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		solution(0, 0);
		bw.append(String.valueOf(answer)).close();
	}
}