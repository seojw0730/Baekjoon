package baekjoon.step15;

import java.util.*;
import java.io.*;

public class B1735 {
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
	
	public static int LCM(int a, int b) {
		int gcd = GCD(a, b);
		return gcd * (a / gcd) * (b / gcd);
	}
	
	public static int[] solution(int a, int b, int c, int d) {
		int[] answer = new int[2];
		int numer = 0, denom = 0;
		numer = a * d + b * c;
		denom = b * d;
		int gcd = GCD(numer, denom);
		if(gcd > 1) {
			numer /= gcd;
			denom /= gcd;
		}
		answer[0] = numer;
		answer[1] = denom;
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int[] answer = solution(a, b, c, d);
		StringBuilder sb = new StringBuilder();
		sb.append(answer[0]).append(" ").append(answer[1]);
		br.close();
		bw.append(sb).close();
	}
}
