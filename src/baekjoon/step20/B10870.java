package baekjoon.step20;

import java.io.*;

public class B10870 {
	public static long solution(long n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else return solution(n-1)+solution(n-2);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		long n=Long.parseLong(br.readLine()); br.close();
		bw.append(String.valueOf(solution(n))).close();
	}
}