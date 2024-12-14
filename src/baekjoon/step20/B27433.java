package baekjoon.step20;

import java.io.*;

public class B27433 {
	public static long solution(int n) {
		if(n<=1) return 1;
		else return n*solution(n-1);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		bw.append(String.valueOf(solution(n))).close();
	}
}