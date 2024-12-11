package baekjoon.step15;

import java.io.*;

public class B13909 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		int answer=0;
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(i*i<=n) answer++;
		}
		bw.append(String.valueOf(answer)).close();
	}
}
