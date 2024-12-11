package baekjoon.step12;

import java.io.*;

public class B2231 {
	public static int sum(int n) {
		int sum = n, temp = n;
		while(temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return sum;
	}
	
	public static int solution(int n) {
		int answer = 0;
		for(int i = n - 9 * String.valueOf(n).length(); i < n; i++) {
			if(sum(i) == n) {
				answer = i;
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(solution(n))).close();
	}
}