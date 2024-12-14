package baekjoon.step20;

import java.io.*;

public class B11729 {
	static StringBuilder sb=new StringBuilder();
	static int cnt=0;
	
	public static void Hanoi(int n, int start, int mid, int end) {
		cnt++;
		if(n==1) sb.append(start+" "+end+"\n");
		else {
			Hanoi(n-1, start, end, mid);
			sb.append(start+" "+end+"\n");
			Hanoi(n-1, mid, start, end);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		Hanoi(n, 1, 2, 3);
		bw.append(cnt+"\n");
		bw.append(sb).close();
	}
}