package baekjoon.step12;

import java.io.*;

public class B2839 {
	public static int solution(int n) {
		int answer = 0;
		
		while(n > 0) {
			if(n % 5 == 0) {
				answer = n / 5;
				break;
			}else {
				n -= 3;
				answer++;
				if(n % 5 == 0) {
					answer += n / 5;
					break;
				}
			}
		}
		
		if(n < 0) return -1;
		
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