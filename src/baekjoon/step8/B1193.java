package baekjoon.step8;

import java.util.*;
import java.io.*;

public class B1193 {
	public static int[] solution(int x) {
		if(x == 1) {
			int[] answer = new int[2];
			answer[0] = 1;
			answer[1] = 1;
			return answer;
		}
		
		int[] answer = new int[2];
		int line = 1, add = 2, sum = 2;
		
		while(true) {
			sum += add;
			if(sum > x) break;
			add++;
			line++;
		}
		
		if(line % 2 == 1) {
			answer[1] = sum - x;
			answer[0] = line + 2 - answer[1];
		}else {
			answer[0] = sum - x;
			answer[1] = line + 2 - answer[0];
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		br.close();
		int[] answer = solution(x);
		int a = answer[0];
		int b = answer[1];
		bw.append(a + "/" + b).close();
	}
}