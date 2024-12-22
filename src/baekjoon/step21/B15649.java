package baekjoon.step21;

import java.io.*;
import java.util.*;

public class B15649 {
	static int[] chk, arr, answer;
	static int n, m;
	static StringBuilder sb=new StringBuilder();
	public static void solution(int L) {
		if(L==m) {
			for(int i : answer) sb.append(i+" ");
			sb.append("\n");
		}else {
			for(int i=1; i<=n; i++) {
				if(chk[i]==0) {
					chk[i]=1;
					answer[L]=arr[i];
					solution(L+1);
					chk[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); br.close();
		n=Integer.parseInt(st.nextToken());
		chk=new int[n+1];
		arr=new int[n+1];
		for(int i=1; i<=n; i++) arr[i]=i;
		m=Integer.parseInt(st.nextToken());
		answer=new int[m];
		solution(0);
		bw.append(sb).close();
	}
}