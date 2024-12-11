package baekjoon.step15;

import java.util.*;
import java.io.*;

public class B13241 {
	public static long GCD(long a, long b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
	
	public static long LCM(long a, long b) {
		long gcd = GCD(a, b);
		return gcd * (a / gcd) * (b / gcd);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		sb.append(LCM(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()))).append("\n");
		br.close();
		bw.append(sb).close();
	}
}
