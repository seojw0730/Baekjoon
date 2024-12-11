package baekjoon.step08;

import java.io.*;

public class B2292 {
	public static int solution(int n) {
		if(n == 1) return 1;
		
		int answer = 1, sum = 2;
		
		while(sum <= n) {
			sum += 6 * answer++;
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