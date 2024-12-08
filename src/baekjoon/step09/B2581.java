package baekjoon.step09;

import java.util.*;
import java.io.*;

public class B2581 {
	public static boolean isPrime(int n) {
		if(n == 1) return false;
		if(n == 2) return true;
		
		boolean answer = true;
		for(int i = 2; i < Math.sqrt(n) + 1; i++) {
			if(n % i == 0) {
				answer = false;
				break;
			}
		}
		return answer;
	}
	
	public static int[] solution(int m, int n) {
		int[] answer = new int[2];
		int sum = 0, min = 0, cnt = 0;
		boolean isMin = true;
		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				if(isMin) {
					isMin = false;
					min = i;
				}
				sum += i;
				cnt++;
			}
		}
		if(cnt == 0) {
			answer[0] = -1;
		}else {
			answer[0] = sum;
			answer[1] = min;
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		int[] answer = solution(m, n);
		if(answer[0] == -1) bw.append("-1");
		else bw.append(answer[0] + "\n" + answer[1]);
		bw.close();
	}
}