package baekjoon.step12;

import java.util.*;
import java.io.*;

public class B1436 {
	public static int solution(int n) {
		int answer = 664, cnt = 0;
		while(cnt < n) {
			answer++;
			if(String.valueOf(answer).contains("666")) {
				cnt++;
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