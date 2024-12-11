package baekjoon.step15;

import java.io.*;

public class B2485 {
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		else return GCD(b, a % b);
	}
	
	public static int LCM(int a, int b) {
		int gcd = GCD(a, b);
		return gcd * (a / gcd) * (b / gcd);
	}
	
	public static int solution(int n, int[] arr) {
		int answer = 0;
		int[] dist = new int[n - 1];
		for(int i = 0; i < n - 1; i++) {
			dist[i] = arr[i + 1] - arr[i];
		}
		int gcd = GCD(dist[0], dist[1]);
		for(int i = 2; i < n - 1; i++) {
			gcd = GCD(gcd, dist[i]);
		}
		for(int i = 0; i < n - 1; i++) {
			answer += dist[i] / gcd - 1;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		bw.append(String.valueOf(solution(n, arr))).close();
	}
}
