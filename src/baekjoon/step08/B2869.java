package baekjoon.step08;

import java.util.*;
import java.io.*;

public class B2869 {
	public static int solution(int a, int b, int v) {
		int answer = 1;
		
		v -= a;
		
		if(v % (a - b) == 0) {
			answer += v / (a - b);
		}else {
			answer += v / (a - b) + 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		br.close();
		int a = Integer.parseInt(input1[0]);
		int b = Integer.parseInt(input1[1]);
		int v = Integer.parseInt(input1[2]);
		bw.append(String.valueOf(solution(a, b, v))).close();
	}
}