package baekjoon.step12;

import java.util.*;
import java.io.*;

public class B19532 {
	public static int[] solution(int a, int b, int c, int d, int e, int f) {
		int[] answer = new int[2];
		boolean exit = false;
		for(int x = -999; x <= 999; x++) {
			for(int y = -999; y <= 999; y++) {
				if(a * x + b * y == c && d * x + e * y == f) {
					answer[0] = x;
					answer[1] = y;
					exit = true;
					break;
				}
			}
			if(exit) break;
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
		int c = Integer.parseInt(input1[2]);
		int d = Integer.parseInt(input1[3]);
		int e = Integer.parseInt(input1[4]);
		int f = Integer.parseInt(input1[5]);
		int[] answer = solution(a, b, c, d, e, f);
		StringBuilder sb = new StringBuilder();
		sb.append(answer[0]).append(" ").append(answer[1]);
		bw.append(sb).close();
	}
}