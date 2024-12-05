package baekjoon.step2;

import java.util.*;
import java.io.*;

public class B2480 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int a = Integer.parseInt(input1[0]);
		int b = Integer.parseInt(input1[1]);
		int c = Integer.parseInt(input1[2]);
		br.close();
		int reward;
		if(a == b && b == c) {
			reward = 10000 + a * 1000;
		}else if(a != b && b != c && c != a) {
			int max = Math.max(a, b);
			max = Math.max(max, c);
			reward = max * 100;
		}else {
			reward = 1000;
			if(a == b) reward += a * 100;
			else if(b == c) reward += b * 100;
			else reward += c * 100;
		}
		bw.append(String.valueOf(reward)).close();
	}
}
