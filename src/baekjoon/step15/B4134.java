package baekjoon.step15;

import java.io.*;

public class B4134 {
	public static boolean isPrime(long n) {
		if(n <= 1) return false;
		if(n == 2) return true;
		
		for(long i = 2; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static long solution(long n) {
		long answer = n;
		while(true) {
			if(isPrime(answer)) break;
			answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long t = Long.parseLong(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(long i = 0; i < t; i++) sb.append(solution(Long.parseLong(br.readLine()))).append("\n");
		br.close();
		bw.append(sb).close();
	}
}
