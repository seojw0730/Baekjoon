package baekjoon.step21;

import java.io.*;
import java.util.*;

public class B15651 {
	static int[] arr, answer;
	static int n, m;
	static StringBuilder sb=new StringBuilder();
	
	public static void solution(int L) {
		if(L==m) {
			for(int i : answer) sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		for(int i=0; i<n; i++) {
			answer[L]=arr[i];
			solution(L+1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); br.close();
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=i+1;
		answer=new int[m];
		solution(0);
		bw.append(sb).close();
	}
}