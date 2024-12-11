package baekjoon.step18;

import java.io.*;

public class B24723 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()); br.close();
		bw.append(String.valueOf((int)Math.pow(2, n))).close();
	}
}
