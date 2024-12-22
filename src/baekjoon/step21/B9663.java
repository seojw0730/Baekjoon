package baekjoon.step21;

import java.io.*;

public class B9663 {
	static int n, answer=0;
	static int[] board;
	
	public static boolean check(int L) {
		for(int i=0; i<L; i++) {
			if(board[i]==board[L]) return false;
			if(Math.abs(board[i]-board[L])==Math.abs(i-L)) return false;
		}
		return true;
	}
	
	public static void dfs(int L) {
		if(L==n) {
			answer++;
		}else {
			for(int i=0; i<n; i++) {
				board[L]=i+1;
				if(check(L)) dfs(L+1);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(br.readLine()); br.close();
		board=new int[n];
		dfs(0);
		bw.append(String.valueOf(answer)).close();
	}
}