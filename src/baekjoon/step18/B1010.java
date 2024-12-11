package baekjoon.step18;

import java.io.*;
import java.util.*;

public class B1010 {
	public static long solution(int n, int m) {
		if(n==m) return 1;
		long numer=1, denom=1;
		for(int i=m; i>Math.max(n, m-n); i--) {
			numer*=i;
		}
		for(int i=1; i<=m-Math.max(n, m-n); i++) {
			denom*=i;
		}
		return numer/denom;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		while(t-- > 0) {
			st=new StringTokenizer(br.readLine(), " ");
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			sb.append(solution(n, m)).append("\n");
		}
		bw.append(sb).close();
	}
}
