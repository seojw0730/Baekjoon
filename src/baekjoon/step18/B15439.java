package baekjoon.step18;

import java.io.*;

public class B15439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		bw.append(String.valueOf(n*(n-1))).close();
	}
}
