package baekjoon.step15;

import java.util.*;
import java.io.*;

public class B1929 {
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		if(n == 2 || n == 3) return true;
		
		for(int i = 3; i <= Math.sqrt(n) + 1; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[1000001]; arr[0] = 1; arr[1] = 1;
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); br.close();
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		for(int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				for(int j = 2 * i; j <= n; j += i) {
					arr[j]++;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = m; i <= n; i++) {
			if(arr[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		bw.append(sb).close();
	}
}
