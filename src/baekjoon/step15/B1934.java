package baekjoon.step15;

import java.util.*;
import java.io.*;

public class B1934 {
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
	
	public static int LCM(int a, int b) {
		int gcd = GCD(a, b);
		return gcd * (a / gcd) * (b / gcd);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(LCM(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		br.close();
		bw.append(sb).close();
	}
}
