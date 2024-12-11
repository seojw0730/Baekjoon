package baekjoon.step15;

import java.io.*;

public class B4948 {
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		if(n == 2 || n == 3) return true;
		
		for(int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static int solution(int n) {
		int answer = 0;
		for(int i = n + 1; i <=  2 * n; i++) {
			if(isPrime(i)) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		StringBuilder sb = new StringBuilder();
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			sb.append(solution(n)).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}
