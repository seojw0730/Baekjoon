package baekjoon.step09;

import java.util.*;
import java.io.*;

public class B2501 {
	public static int solution(int n, int k) {
		int answer = 0, cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				cnt++;
				if(cnt == k) {
					answer = i;
					break;
				}
			}
		}
		
		if(cnt <= k - 1) return 0;
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int n = Integer.parseInt(input1[0]);
		int k = Integer.parseInt(input1[1]);
		bw.append(String.valueOf(solution(n, k))).close();
	}
}